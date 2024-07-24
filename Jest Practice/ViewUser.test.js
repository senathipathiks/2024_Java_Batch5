import React from 'react';
import { render, screen,fireEvent } from '@testing-library/react';
import "@testing-library/jest-dom";
import { BrowserRouter } from 'react-router-dom';

import ViewUser from './ViewUser';


describe('Testing view Member table', () => {

    test('should have title of view member', () => {
        render(<BrowserRouter>
            <ViewUser />
            </BrowserRouter>);
        expect(screen.getByTitle("ViewPageMember")).toBeInTheDocument();
      })

      test('should have body of view member table', () => {
        render(<BrowserRouter>
            <ViewUser />
            </BrowserRouter>);
        expect(screen.getByRole("data")).toBeInTheDocument();
      })


   

      test('renders link viwe member', () => {
        render(<BrowserRouter>
        <ViewUser />
        </BrowserRouter>);
        const link = screen.getByText('Add +');
        fireEvent.click(link);
        expect(window.location.pathname).toBe('/AddUser');
      });

})