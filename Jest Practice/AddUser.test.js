import React from 'react';
import { render, screen,fireEvent } from '@testing-library/react';
import "@testing-library/jest-dom";
import AddUser from './AddUser';
import { BrowserRouter } from 'react-router-dom';
// import { BrowserRouter } from 'react-router-dom';

describe('Testing add members', () => {

    test('should have user haeding', () => {
        render(<BrowserRouter>
            <AddUser />
            </BrowserRouter>);
        expect(screen.getByTitle("headingUser")).toBeInTheDocument();
      })

    test('should have master name', () => {
        
      render(<BrowserRouter>
      <AddUser />
      </BrowserRouter>);
      expect(screen.getByRole("member-name")).toBeInTheDocument();
    })
  
    test('should have city', () => {
        render(<BrowserRouter>
            <AddUser />
            </BrowserRouter>);
      expect(screen.getByRole("city")).toBeInTheDocument();
    })
  
    test('should have email', () => {
        render(<BrowserRouter>
            <AddUser />
            </BrowserRouter>);
      expect(screen.getByRole("email")).toBeInTheDocument();
    })
    test('should have age', () => {
        render(<BrowserRouter>
            <AddUser />
            </BrowserRouter>);
        expect(screen.getByRole("age")).toBeInTheDocument();
      })

})