import React from 'react';
import { render, screen } from '@testing-library/react';
import Navbar1 from './components/Navbar1';
import { useNavigate } from 'react-router-dom'


jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));
      
  const mockNavigate = jest.fn();
  useNavigate.mockReturnValue(mockNavigate);


describe('Navbar1 Component', () => {
  test('should render Navbar1 component', () => {
    render(<Navbar1 />);

    expect(screen.getByRole('navigation')).toBeInTheDocument();
    expect(screen.getByRole('button', {name: "Donate"})).toBeInTheDocument();
    expect(screen.getByRole('button', {name: "Donator Details"})).toBeInTheDocument();
    expect(screen.getByRole('button', {name: "View notifications"})).toBeInTheDocument();
  });
});