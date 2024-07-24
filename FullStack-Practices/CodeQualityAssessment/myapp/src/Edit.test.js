import React from 'react';
import { render, screen } from '@testing-library/react';
import { useNavigate, useParams } from 'react-router-dom';
import axios from 'axios';
import Edit from './pages/Edit';
import MockAdapter from 'axios-mock-adapter';


jest.mock('axios');

jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));

//   const mock = new MockAdapter(axios);
      
  const mockNavigate = jest.fn();
  useNavigate.mockReturnValue(mockNavigate);

describe('Edit', () => {

//   beforeEach(() => {
//     render(<Edit />);
//   });


  test('Request Edit labels',  () => {
    render(<Edit />);
    expect(screen.getByRole('heading')).toBeInTheDocument();
    expect(screen.getByRole('requestlabel')).toBeInTheDocument();
    expect(screen.getByRole('useridlabel')).toBeInTheDocument();
    expect(screen.getByRole('namelabel')).toBeInTheDocument();
    expect(screen.getByRole('emaillabel')).toBeInTheDocument();
    expect(screen.getByRole('addresslabel')).toBeInTheDocument();
    expect(screen.getByRole('phnlabel')).toBeInTheDocument();
    expect(screen.getByRole('donationlabel')).toBeInTheDocument();
    expect(screen.getByRole('statuslabel')).toBeInTheDocument();

  });

  test('renders Edit Input Fields', () => {
    render(<Edit />);
    expect(screen.getByRole('request')).toBeInTheDocument();
    expect(screen.getByRole('userid')).toBeInTheDocument();
    expect(screen.getByRole('name')).toBeInTheDocument();
    expect(screen.getByRole('email')).toBeInTheDocument();
    expect(screen.getByRole('address')).toBeInTheDocument();
    expect(screen.getByRole('phn')).toBeInTheDocument();
    expect(screen.getByRole('donation')).toBeInTheDocument();
    expect(screen.getByRole('status')).toBeInTheDocument();
  });

  test('Update', () => {
    render(<Edit />);
    expect(screen.getByRole('button', {name: "Update Status"})).toBeInTheDocument();
  });

  
});