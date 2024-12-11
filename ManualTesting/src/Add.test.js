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
 
test('renders  title ', () => {
    render(<Add />);
    const linkElement = screen.getByTestId("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("ADD USER DETAILS");
});
 
test('renders Add Acc TYPE ', () => {
    render(<Add />);
    const linkElement = screen.getByRole("type");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add USER NAME field', () => {
    render(<Add />);
    const linkElement = screen.getByRole("name");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add City field ', () => {
    render(<Add />);
    const linkElement = screen.getByRole("city");
    expect(linkElement).toBeInTheDocument();
    
});
 
test('renders Add JOB', () => {
    render(<Add />);
    const linkElement = screen.getByRole("job");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add Salary', () => {
    render(<Add />);
    const linkElement = screen.getByRole("sal");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 

test('renders Add Reliogion', () => {
    render(<Add />);
    const linkElement = screen.getByRole("religion");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add AGE', () => {
    render(<Add />);
    const linkElement = screen.getByRole("age");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});

test('renders Add STATUS', () => {
    render(<Add />);
    const linkElement = screen.getByRole("sts");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});


test('renders Add PAYMENT TYPE', () => {
    render(<Add />);
    const linkElement = screen.getByRole("pay");
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
