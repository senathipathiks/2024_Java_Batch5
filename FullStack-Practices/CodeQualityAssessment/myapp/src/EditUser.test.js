
import React from 'react';
import { render, screen } from '@testing-library/react';
import axios from 'axios';
import { useNavigate, useParams } from 'react-router-dom';
import MockAdapter from 'axios-mock-adapter';
import EditUser from './pages/EditUser';

jest.mock('axios');

jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));

//   const mock = new MockAdapter(axios);
      
  const mockNavigate = jest.fn();
  useNavigate.mockReturnValue(mockNavigate);

describe('EditUser', () => {
//   beforeEach(() => {
//     render(<EditUser />);
//   });



  test('renders EditUser form',  () => {
    render(<EditUser />);
    expect(screen.getByRole('heading', { name: "UPDATE USER DATA" })).toBeInTheDocument();
    expect(screen.getByRole('userid')).toBeDisabled();
    expect(screen.getByRole('name')).toBeInTheDocument();
    expect(screen.getByRole('email')).toBeInTheDocument();
    expect(screen.getByRole('address')).toBeInTheDocument();
    expect(screen.getByRole('phn')).toBeInTheDocument();
    expect(screen.getByRole('donation')).toBeInTheDocument();
  });

  test('updates user data on form submission', async() => {
    render(<EditUser />);
    expect(screen.getByRole('name')).toBeInTheDocument();
    expect(screen.getByRole('email')).toBeInTheDocument();
    expect(screen.getByRole('address')).toBeInTheDocument();
    expect(screen.getByRole('phn')).toBeInTheDocument();
    expect(screen.getByRole('donation')).toBeInTheDocument();
  });

  test('Update User', () => {
    render(<EditUser />);
    expect(screen.getByRole('button', {name: "Update User"})).toBeInTheDocument();
  });
});