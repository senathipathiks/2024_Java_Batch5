import React from 'react';
import { render, screen } from '@testing-library/react';
import Hero from './components/Hero';

describe('Hero Component', () => {

    beforeEach(() => {
        render(<Hero />);
      });

  test('should render Hero component', () => {

    expect(screen.getByRole('heading')).toBeInTheDocument();
    expect(screen.getByRole('button', {name: "Log in"})).toBeInTheDocument();
    expect(screen.getByRole('button', {name: "Sign Up"})).toBeInTheDocument();
    expect(screen.getByRole('textbox')).toBeInTheDocument();
    expect(screen.getByRole('button', {name: "Get Started"})).toBeInTheDocument();
    
  });

 
});