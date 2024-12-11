import { render, screen } from '@testing-library/react';
import Edituser from './Edituser';
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
    render(<Edituser/>);
    const linkElement = screen.getByTestId("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("UPDATE MATCH MAKER DATA'S");
});


 
test('renders Add  NAME field', () => {
    render(<Edituser />);
    const linkElement = screen.getByRole("name");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add Contact field ', () => {
    render(<Edituser />);
    const linkElement = screen.getByRole("mobile");
    expect(linkElement).toBeInTheDocument();
    
});
 


test('renders Add ADDRESS', () => {
    render(<Edituser />);
    const linkElement = screen.getByRole("addr");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});


test('renders submit button', () => {
    render(<Edituser />);
    const linkElement = screen.getByTestId("submitbutton");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Update");
});



