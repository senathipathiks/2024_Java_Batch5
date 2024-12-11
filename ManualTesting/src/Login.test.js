import { render, screen } from '@testing-library/react';
import Login from './Login'


jest.mock('axios');
jest.mock('react-router-dom');


it("renders 'Login header text' ", () => {
    render(<Login />);
    const linkElement = screen.getByTestId("logheading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Log in to your account");
    
   
  });
it("renders 'username text' ", () => {
  render(<Login />);
  const linkElement = screen.getByRole("username");
  expect(linkElement).toBeInTheDocument();
  
 
});
it("renders 'label for username' ", () => {
    render(<Login />);
    const linkElement = screen.getByRole("userlabel");
    expect(linkElement).toBeInTheDocument();
     
  });
it("renders 'label for password' ", () => {
  render(<Login />);
  const linkElement = screen.getByRole("pwdlabel");
  expect(linkElement).toBeInTheDocument();
   
});
it("renders 'password text' ", () => {
  render(<Login />);
  const linkElement = screen.getByRole("pwdtext");
  expect(linkElement).toBeInTheDocument();
  expect(screen.getByPlaceholderText("Enter Password")).toHaveTextContent("");
 
});


   
it("renders 'submit button' ", () => {
    render(<Login/>);
    const linkElement = screen.getByTestId("login-submit");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Login");
   
  });