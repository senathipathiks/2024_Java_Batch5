import { render, screen } from '@testing-library/react';
import Edit from './Edit';
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
    render(<Edit />);
    const linkElement = screen.getByTestId("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("UPDATE USER DETAILS");
});
 
test('renders Add Acc TYPE ', () => {
    render(<Edit/>);
    const linkElement = screen.getByRole("type");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add USER NAME field', () => {
    render(<Edit />);
    const linkElement = screen.getByRole("name");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add City field ', () => {
    render(<Edit/>);
    const linkElement = screen.getByRole("addr");
    expect(linkElement).toBeInTheDocument();
    
});
 
test('renders Add JOB', () => {
    render(<Edit/>);
    const linkElement = screen.getByRole("job");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add Salary', () => {
    render(<Edit/>);
    const linkElement = screen.getByRole("sal");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 


test('renders Add Reliogion', () => {
    render(<Edit/>);
    const linkElement = screen.getByRole("religion");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
 
test('renders Add AGE', () => {
    render(<Edit />);
    const linkElement = screen.getByRole("age");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});

test('renders Add STATUS', () => {
    render(<Edit />);
    const linkElement = screen.getByRole("sts");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});


test('renders Add PAYMENT TYPE', () => {
    render(<Edit />);
    const linkElement = screen.getByRole("pay");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("");
});
test('renders submit button', () => {
    render(<Edit />);
    const linkElement = screen.getByRole("submitbutton");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Update");
});


test('renders select option', () => {
    render(<Edit />);
   
    const selectedOption = screen.getByTestId('opt');
    expect(selectedOption).toBeInTheDocument();
});
