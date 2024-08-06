// import React from 'react';
// import { render, screen } from '@testing-library/react';
// import UpdateBoutique from './UpdateBoutique';
// import UpdateProduct from './UpdateProduct';
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
 
// describe('Update boutique Tests', () => {
//   test('renders boutique id, name, email, address and description', () => {
//     render(<UpdateBoutique />);
    
//     const id = screen.getByRole('boutiqueID');
//     const nameInput = screen.getByRole('boutiqueName');
//     const emailInput = screen.getByRole('email');
//     const addressInput = screen.getByRole('address');
//     const descriptionInput = screen.getByRole('description');

//     expect(id).toBeInTheDocument();
//     expect(nameInput).toBeInTheDocument();
//     expect(emailInput).toBeInTheDocument();
//     expect(addressInput).toBeInTheDocument();
//     expect(descriptionInput).toBeInTheDocument();
//   });
// });

// describe('Update product Tests', () => {
//   test('renders product id, name, type, stockleft, price and boutiqueID', () => {
//     render(<UpdateProduct />);
    
//     const productid = screen.getByRole('productID');
//     const nameInput = screen.getByRole('productName');
//     const typeInput = screen.getByRole('productType');
//     const stockleftInput = screen.getByRole('stockLeft');
//     const priceInput = screen.getByRole('price');
//     const boutiqueid = screen.getByRole('boutiqueID');

//     expect(productid).toBeInTheDocument();
//     expect(nameInput).toBeInTheDocument();
//     expect(typeInput).toBeInTheDocument();
//     expect(stockleftInput).toBeInTheDocument();
//     expect(priceInput).toBeInTheDocument();
//     expect(boutiqueid).toBeInTheDocument();

//   });
// });
