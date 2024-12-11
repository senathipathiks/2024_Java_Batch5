import { render, screen } from '@testing-library/react';
import Adduser from './Adduser';
import { useNavigate } from 'react-router-dom'
import axios from 'axios';
import MockAdapter from 'axios-mock-adapter';
import { act } from 'react-dom/test-utils';

  
jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));
  const mock = new MockAdapter(axios);
 
test('renders  title ', () => {
    render(<Adduser/>);
    const linkElement = screen.getByTestId("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("ADD MATCHMAKER DATA");
});

 
test('renders Add  NAME field', () => {
    render(<Adduser />);
    const linkElement = screen.getByRole("name");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add Contact field ', () => {
    render(<Adduser />);
    const linkElement = screen.getByRole("mobile");
    expect(linkElement).toBeInTheDocument();
    
});
 


test('renders Add ADDRESS', () => {
    render(<Adduser />);
    const linkElement = screen.getByRole("addr");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});


test('renders submit button', () => {
    render(<Adduser />);
    const linkElement = screen.getByTestId("submitbutton");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Submit");
});



