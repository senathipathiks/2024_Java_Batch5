import React from 'react';
import { render, screen,fireEvent } from '@testing-library/react';
import "@testing-library/jest-dom";
import { BrowserRouter } from 'react-router-dom';

import Login from './Login';


describe('Testing Login Page', () => {

   
      test('should have emailID', () => {
        render(<BrowserRouter>
            <Login />
            </BrowserRouter>);
        expect(screen.getByRole("EmailID")).toBeInTheDocument();
      })

      test('should have password', () => {
        render(<BrowserRouter>
            <Login />
            </BrowserRouter>);
        expect(screen.getByRole("Password")).toBeInTheDocument();
      })

   

      test('renders link login', () => {
        render(<BrowserRouter>
        <Login />
        </BrowserRouter>);
        const link = screen.getByText('Sign up');
        fireEvent.click(link);
        expect(window.location.pathname).toBe('/Signup');
      });

})