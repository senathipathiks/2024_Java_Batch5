import React from 'react';
import { render, screen } from '@testing-library/react';
import axios from 'axios';
import { useNavigate, useParams, MemoryRouter } from 'react-router-dom';
import MockAdapter from 'axios-mock-adapter';
import ViewUser from './pages/ViewUser';

jest.mock('axios');

jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));

//   const mock = new MockAdapter(axios);
      
  const mockNavigate = jest.fn();
  useNavigate.mockReturnValue(mockNavigate);

describe('ViewUser tests', () => {
  test('renders ViewUser table without input data', () => {
    render(<MemoryRouter><ViewUser /></MemoryRouter>);
    expect(screen.getByRole('userid')).toBeInTheDocument();
    expect(screen.getByRole('name')).toBeInTheDocument();
    expect(screen.getByRole('email')).toBeInTheDocument();
    expect(screen.getByRole('address')).toBeInTheDocument();
    expect(screen.getByRole('phn')).toBeInTheDocument();
    expect(screen.getByRole('donation')).toBeInTheDocument();
    expect(screen.getByRole('status')).toBeInTheDocument();
    expect(screen.getByRole("action")).toBeInTheDocument(); 
  });

  test("renders 'Add Button' ", () => {
    render(<MemoryRouter><ViewUser /></MemoryRouter>);
    expect(screen.getByRole("button", {name: "Add +"})).toBeInTheDocument();
  });
});