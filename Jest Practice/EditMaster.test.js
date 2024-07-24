import React from 'react';
import { render, screen,fireEvent } from '@testing-library/react';
import "@testing-library/jest-dom";
import EditMaster from './EditMaster';
import { BrowserRouter } from 'react-router-dom';
// import { BrowserRouter } from 'react-router-dom';

describe('Testing edit masters', () => {

    test('should have title of master updation', () => {
        render(<BrowserRouter>
            <EditMaster />
            </BrowserRouter>);
        expect(screen.getByTitle("headingMaster")).toBeInTheDocument();
      })


      test('should have master-id', () => {
        render(<BrowserRouter>
            <EditMaster />
            </BrowserRouter>);
        expect(screen.getByRole("masterId")).toBeInTheDocument();
      })

    test('should have masters name', () => {
        
      render(<BrowserRouter>
      <EditMaster />
      </BrowserRouter>);
      expect(screen.getByRole("Mastername")).toBeInTheDocument();
    })
  
    test('should have specialities', () => {
        render(<BrowserRouter>
            <EditMaster />
            </BrowserRouter>);
      expect(screen.getByRole("speciality")).toBeInTheDocument();
    })
  
    test('should have availability', () => {
        render(<BrowserRouter>
            <EditMaster />
            </BrowserRouter>);
      expect(screen.getByRole("availability")).toBeInTheDocument();
    })
    test('should have Mastercity', () => {
        render(<BrowserRouter>
            <EditMaster />
            </BrowserRouter>);
        expect(screen.getByRole("mastercity")).toBeInTheDocument();
      })

})