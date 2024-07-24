import React from 'react';
import { render, screen } from '@testing-library/react';
import Navbar2 from './components/Navbar2';
import { useNavigate } from 'react-router-dom'


jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));
      
  const mockNavigate = jest.fn();
  useNavigate.mockReturnValue(mockNavigate);


describe('Navbar2 Component', () => {
  test('should render Navbar2 component', () => {
    render(<Navbar2 />);

    expect(screen.getByRole('navigation')).toBeInTheDocument();
    expect(screen.getByRole('button', {name: "Handle Requests"})).toBeInTheDocument();
    expect(screen.getByRole('button', {name: "View notifications"})).toBeInTheDocument();
  });
});