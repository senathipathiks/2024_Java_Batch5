import React from 'react';
import { render, screen,fireEvent } from '@testing-library/react';
import "@testing-library/jest-dom";
import AddMaster from './AddMaster';
// import { BrowserRouter } from 'react-router-dom';

describe('Testing add master', () => {

    test('should have heading', () => {
        render(<AddMaster/>)
    const textElement = screen.getByTitle("heading");
  expect(textElement).toBeInTheDocument();

})

    test('should have master id', () => {
      render(<AddMaster />);
      expect(screen.getByRole("master-name")).toBeInTheDocument();
    })
  
    test('should have speciality', () => {
      render(<AddMaster />);
      expect(screen.getByRole("special")).toBeInTheDocument();
    })
  
    test('should have availablity', () => {
      render(<AddMaster />);
      expect(screen.getByRole("available")).toBeInTheDocument();
    })
    test('should have cityname', () => {
        render(<AddMaster />);
        expect(screen.getByRole("cityname")).toBeInTheDocument();
      })

})