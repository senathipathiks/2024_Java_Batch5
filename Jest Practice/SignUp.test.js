import React from 'react';
import { render, screen,fireEvent } from '@testing-library/react';
import "@testing-library/jest-dom";
import { BrowserRouter } from 'react-router-dom';

import Signup from './SignUp';


describe('Testing view Member table', () => {

    test('should have username', () => {
        render(<BrowserRouter>
            <Signup />
            </BrowserRouter>);
        expect(screen.getByRole("username")).toBeInTheDocument();
      })

      test('should have emailID', () => {
        render(<BrowserRouter>
            <Signup />
            </BrowserRouter>);
        expect(screen.getByRole("emailID")).toBeInTheDocument();
      })

      test('should have password', () => {
        render(<BrowserRouter>
            <Signup />
            </BrowserRouter>);
        expect(screen.getByRole("password")).toBeInTheDocument();
      })

   

      test('renders link register', () => {
        render(<BrowserRouter>
        <Signup />
        </BrowserRouter>);
        const link = screen.getByText('Sign In');
        fireEvent.click(link);
        expect(window.location.pathname).toBe('/login');
      });

})