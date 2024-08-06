// import React from 'react';
// import { render, screen } from '@testing-library/react';
// import AddBoutique from './AddBoutique';
// import AddProduct from './AddProduct';
// import { useNavigate } from 'react-router-dom'
// import axios from 'axios';
// import MockAdapter from 'axios-mock-adapter';
 
// jest.mock('react-router-dom', () => ({
//     ...jest.requireActual('react-router-dom'),
//     useNavigate: jest.fn(),
// }));
 
// const mock = new MockAdapter(axios);
 
// const mockNavigate = jest.fn();
// useNavigate.mockReturnValue(mockNavigate);
 
// afterEach(() => {
//     mock.reset();
// });
 
// describe('Add boutique Tests', () => {
//   test('renders boutique name, email, address and description', () => {
//     render(<AddBoutique />);
 
//     const nameInput = screen.getByRole('boutiquename');
//     const emailInput = screen.getByRole('boutiqueemail');
//     const addressInput = screen.getByRole('address');
//     const descriptionInput = screen.getByRole('description');

//     expect(nameInput).toBeInTheDocument();
//     expect(emailInput).toBeInTheDocument();
//     expect(addressInput).toBeInTheDocument();
//     expect(descriptionInput).toBeInTheDocument();
//   });
// });

// describe('Add Product Tests', () => {
//   test('renders product name, type, stockleft and price', () => {
//     render(<AddProduct />);
 
//     const nameInput = screen.getByRole('productname');
//     const typeInput = screen.getByRole('producttype');
//     const stockleftInput = screen.getByRole('stockleft');
//     const priceInput = screen.getByRole('price');
//     const boutiqueidInput = screen.getByRole('boutiqueID');

//     expect(nameInput).toBeInTheDocument();
//     expect(typeInput).toBeInTheDocument();
//     expect(stockleftInput).toBeInTheDocument();
//     expect(priceInput).toBeInTheDocument();
//     expect(boutiqueidInput).toBeInTheDocument();
//   });
// });
