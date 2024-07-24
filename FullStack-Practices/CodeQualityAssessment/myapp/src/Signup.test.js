import React from 'react';
import axios from "axios";
import { render, screen, fireEvent } from '@testing-library/react';
import Signup from './components/Signup';
import { useNavigate } from 'react-router-dom'
import MockAdapter from 'axios-mock-adapter';

jest.mock('axios');

jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));
   
//   const mock = new MockAdapter(axios);
   
  const mockNavigate = jest.fn();
  useNavigate.mockReturnValue(mockNavigate);

describe('Register Component', () => {
  beforeEach(() => {
    render(<Signup />);
  });

  test('should render Register component', () => {
    expect(screen.getByRole('heading')).toBeInTheDocument();
    expect(screen.getByRole('namelabel')).toBeInTheDocument();
    expect(screen.getByRole('usertypelabel')).toBeInTheDocument();
    expect(screen.getByRole('emaillabel')).toBeInTheDocument();
    expect(screen.getByRole('pwdlabel')).toBeInTheDocument();
  });

  test('should update state on input change', () => {
    const nameInput = screen.getByRole('name');
    expect(nameInput).toBeInTheDocument();

    const typeInput = screen.getByRole('usertype');
    expect(typeInput).toBeInTheDocument();


    const emailInput = screen.getByRole('email');
    expect(emailInput).toBeInTheDocument();


    const passwordInput = screen.getByRole('pwd');
    expect(passwordInput).toBeInTheDocument();

  });

  it("renders 'submit button' ", () => {
    const signupButton = screen.getByRole('button', { name: "Sign Up" });
    expect(signupButton).toBeInTheDocument();
  });

  it("renders 'continue with Google button' ", () => {
    const signupButton = screen.getByRole('button', { name: "Continue with Google" });
    expect(signupButton).toBeInTheDocument();
  });
   
  it("renders 'Navigate Back' ", () => {
    const signupButton = screen.getByRole('button', { name: "Go Back" });
    expect(signupButton).toBeInTheDocument();
  });

  
});