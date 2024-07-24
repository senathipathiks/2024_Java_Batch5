import React from 'react';
import { render, screen,fireEvent } from '@testing-library/react';
import "@testing-library/jest-dom";
import { BrowserRouter } from 'react-router-dom';
import EditUser from './EditUser';


describe('Testing edit members', () => {

    test('should have title of member updation', () => {
        render(<BrowserRouter>
            <EditUser />
            </BrowserRouter>);
        expect(screen.getByTitle("headingMember")).toBeInTheDocument();
      })


      test('should have member-id', () => {
        render(<BrowserRouter>
            <EditUser />
            </BrowserRouter>);
        expect(screen.getByRole("mId")).toBeInTheDocument();
      })

    test('should have member name', () => {
        
      render(<BrowserRouter>
      <EditUser />
      </BrowserRouter>);
      expect(screen.getByRole("Membername")).toBeInTheDocument();
    })
  
    test('should have city', () => {
        render(<BrowserRouter>
            <EditUser />
            </BrowserRouter>);
      expect(screen.getByRole("mcity")).toBeInTheDocument();
    })
  
    test('should have email', () => {
        render(<BrowserRouter>
            <EditUser />
            </BrowserRouter>);
      expect(screen.getByRole("eMail")).toBeInTheDocument();
    })
    test('should have age', () => {
        render(<BrowserRouter>
            <EditUser />
            </BrowserRouter>);
        expect(screen.getByRole("Age")).toBeInTheDocument();
      })

      test('renders link add test', () => {
        render(<BrowserRouter>
        <EditUser />
        </BrowserRouter>);
        const link = screen.getByText('Cancel');
        fireEvent.click(link);
        expect(window.location.pathname).toBe('/ViewUser');
      });

})