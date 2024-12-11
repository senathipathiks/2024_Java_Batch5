import Signin from "./Signin";
import { render, screen } from '@testing-library/react';

jest.mock('axios');
jest.mock('react-router-dom');

it("renders 'username text' ", () => {
    render(<Signin />);
    const linkElement = screen.getByRole("username");
    expect(linkElement).toBeInTheDocument();
    
   
  });

  it("renders 'label for password' ", () => {
    render(<Signin />);
    const linkElement = screen.getByRole("pwdlabel");
    expect(linkElement).toBeInTheDocument();
     
  });
  it("renders 'password text' ", () => {
    render(<Signin />);
    const linkElement = screen.getByRole("pwdtext");
    expect(linkElement).toBeInTheDocument();
    expect(screen.getByPlaceholderText("Enter Password")).toHaveTextContent("");
   
  });
  it("renders 'submit button' ", () => {
    render(<Signin/>);
    const linkElement = screen.getByTestId("login-submit");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Login");
   
  });

  