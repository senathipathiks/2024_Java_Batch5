import { render, screen } from '@testing-library/react';
import Add from './Add';
import { useNavigate } from 'react-router-dom'
import axios from 'axios';
import MockAdapter from 'axios-mock-adapter';
import { act } from 'react-dom/test-utils';

  
jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));
  const mock = new MockAdapter(axios);
 
test('renders Add orders title ', () => {
    render(<Add />);
    const linkElement = screen.getByTestId("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("ADD EB BILL DETAILS");
});
 
test('renders Add EB TYPE ', () => {
    render(<Add />);
    const linkElement = screen.getByRole("type");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add Mobile number field', () => {
    render(<Add />);
    const linkElement = screen.getByRole("mobile");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add City field ', () => {
    render(<Add />);
    const linkElement = screen.getByRole("city");
    expect(linkElement).toBeInTheDocument();
    
});
 
test('renders Add Due Date Field', () => {
    render(<Add />);
    const linkElement = screen.getByRole("date");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add Price per units', () => {
    render(<Add />);
    const linkElement = screen.getByRole("price");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 

test('renders Add Bill Field', () => {
    render(<Add />);
    const linkElement = screen.getByRole("bill");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 

test('renders submit button', () => {
    render(<Add />);
    const linkElement = screen.getByRole("submitbutton");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Submit");
});


test('renders select option', () => {
    render(<Add />);
   
    const selectedOption = screen.getByTestId('opt');
    expect(selectedOption).toBeInTheDocument();
});
