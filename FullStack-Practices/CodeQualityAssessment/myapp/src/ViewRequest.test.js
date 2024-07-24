import React from 'react';
import { render, screen, fireEvent, waitFor } from '@testing-library/react';
import ViewRequest from './pages/ViewRequest';
import { useNavigate, useParams, MemoryRouter } from 'react-router-dom';

jest.mock('axios');

jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));

//   const mock = new MockAdapter(axios);
      
  const mockNavigate = jest.fn();
  useNavigate.mockReturnValue(mockNavigate);

describe('ViewRequest', () => {

    test('should render Register component', () => {

    render(<MemoryRouter><ViewRequest /></MemoryRouter>);

      expect(screen.getByRole("Requests")).toBeInTheDocument();
      expect(screen.getByRole('request')).toBeInTheDocument();
      expect(screen.getByRole('userid')).toBeInTheDocument();
      expect(screen.getByRole('name')).toBeInTheDocument();
      expect(screen.getByRole('email')).toBeInTheDocument();
      expect(screen.getByRole('address')).toBeInTheDocument();
      expect(screen.getByRole('phn')).toBeInTheDocument();
      expect(screen.getByRole('donation')).toBeInTheDocument();
      expect(screen.getByRole('status')).toBeInTheDocument();
      expect(screen.getByRole("action")).toBeInTheDocument();
     
    });

    test('buttons in the Request Table', () => {
        render(<MemoryRouter><ViewRequest /></MemoryRouter>);
        expect(screen.getByRole("button", {name: "Update"})).toBeInTheDocument();
        expect(screen.getByRole("button", {name: "Delete"})).toBeInTheDocument();
    });

    
  });

  
