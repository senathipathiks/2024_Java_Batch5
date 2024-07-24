import { render, screen } from '@testing-library/react';
import renderer from "react-test-renderer";
import Login from './Login';


describe("All Test Suite", ()=>{

  test('renders username label', () => {
    render(<Login />);
    const linkElement = screen.getByRole("unamelabel");
    expect(linkElement).toBeInTheDocument();
  }); 

  test('renders username input', () => {
    render(<Login />);
    const linkElement = screen.getByRole("username");
    expect(linkElement).toBeInTheDocument();
  }); 

  test('renders password label', () => {
    render(<Login />);
    const linkElement = screen.getByRole("pwdlabel");
    expect(linkElement).toBeInTheDocument();
  }); 

  test('renders password input', () => {
    render(<Login />);
    const linkElement = screen.getByRole("pwd");
    expect(linkElement).toBeInTheDocument();
  }); 

  test('renders button', () => {
    render(<Login />);
    const linkElement = screen.getByRole("login");
    expect(linkElement).toBeInTheDocument();
  }); 



});

test('Snapshot test', () => {
    render(<Login />);
    const comp = renderer.create(<Login/>);
    const tree = comp.toJSON;
    expect(tree).toMatchSnapshot();
  }); 