import { render, screen, fireEvent, waitFor } from '@testing-library/react';
import { useNavigate } from 'react-router-dom'
import axios from 'axios';
import MockAdapter from 'axios-mock-adapter';
import Login from './components/Login';

 
jest.mock('react-router-dom', () => ({
  ...jest.requireActual('react-router-dom'),
  useNavigate: jest.fn(),
}));
 
const mock = new MockAdapter(axios);
 
const mockNavigate = jest.fn();
useNavigate.mockReturnValue(mockNavigate);
 
 
it("renders 'Login Name text' " , () =>{
  render(<Login />);
const linkElement = screen.getByRole("userlabel");
expect(linkElement).toBeInTheDocument();
})
 
it("renders 'User Type text' " , () =>{
  render(<Login />);
const linkElement = screen.getByRole("usertypelabel");
expect(linkElement).toBeInTheDocument();
})

it("renders 'Password text' " , () =>{
    render(<Login />);
  const linkElement = screen.getByRole("pwddlabel");
  expect(linkElement).toBeInTheDocument();
  })
 
it("renders 'submit button' ", () => {
  render(<Login />);
  const loginButton = screen.getByRole('button', { name: "Login" });
  expect(loginButton).toBeInTheDocument();
});
 
it("renders 'continue with Google button' ", () => {
  render(<Login />);
  const loginButton = screen.getByRole('button', { name: "Continue with Google" });
  expect(loginButton).toBeInTheDocument();
});
 
it("renders 'Navigate Back' ", () => {
  render(<Login />);
  const loginButton = screen.getByRole('button', { name: "Go Back" });
  expect(loginButton).toBeInTheDocument();
});