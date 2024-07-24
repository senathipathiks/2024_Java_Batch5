import React from 'react';
import { render, screen,fireEvent } from '@testing-library/react';
import "@testing-library/jest-dom";
import { BrowserRouter } from 'react-router-dom';
import EditUser from './EditUser';
import ViewMaster from './ViewMaster';


describe('Testing view Master table', () => {

    test('should have title of view master', () => {
        render(<BrowserRouter>
            <ViewMaster />
            </BrowserRouter>);
        expect(screen.getByTitle("ViewPageMaster")).toBeInTheDocument();
      })
      test('should have body of view master table', () => {
        render(<BrowserRouter>
            <ViewMaster />
            </BrowserRouter>);
        expect(screen.getByRole("datamaster")).toBeInTheDocument();
      })

    
      test('renders link viwe master', () => {
        render(<BrowserRouter>
        <ViewMaster />
        </BrowserRouter>);
        const link = screen.getByText('Add +');
        fireEvent.click(link);
        expect(window.location.pathname).toBe('/AddMaster');
      });

})