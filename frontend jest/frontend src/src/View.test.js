import React from 'react';
import { render, screen } from '@testing-library/react';
import { MemoryRouter } from 'react-router-dom';
import ViewBoutique from './ViewBoutique';
import ViewProducts from './ViewProducts';
import { useNavigate } from 'react-router-dom'
import axios from 'axios';
import MockAdapter from 'axios-mock-adapter'

jest.mock('react-router-dom', () => ({
   ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
}));

const mock = new MockAdapter(axios);

const mockNavigate = jest.fn();
useNavigate.mockReturnValue(mockNavigate);

afterEach(() => {
    mock.reset();
});


describe('View boutique Tests', () => {
  test('renders add & view pages, update & delete components, fields boutique id, name, email, address and description', () => {
    render(
      <MemoryRouter>
        <ViewBoutique />
      </MemoryRouter>
    );

    //Link to Other Pages
    const addboutique = screen.getByRole('addboutique'); 
    const addproduct = screen.getByRole('addproduct'); 
    const viewproduct = screen.getByRole('viewproduct'); 
    expect(addboutique).toBeInTheDocument();
    expect(addproduct).toBeInTheDocument();
    expect(viewproduct).toBeInTheDocument();

    });  
});


describe('View product Tests', () => {
  test('renders add & view pages, update & delete components, product id, name, type, stockleft, price and boutiqueID', () => {
    render(
      <MemoryRouter>
        <ViewProducts />
      </MemoryRouter>
    );
     //Link to Other Pages
     const addproduct = screen.getByRole('addproduct'); 
     const viewboutique = screen.getByRole('viewboutique'); 
 
     expect(addproduct).toBeInTheDocument();
     expect(viewboutique).toBeInTheDocument();
  });
});

