import { render, screen, fireEvent, waitFor } from '@testing-library/react';
import { useNavigate } from 'react-router-dom'
import axios from 'axios';
import MockAdapter from 'axios-mock-adapter';
import AddUser from './pages/AddUser';



 
jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));
   
  const mock = new MockAdapter(axios);
   
  const mockNavigate = jest.fn();
  useNavigate.mockReturnValue(mockNavigate);
 
test('renders Add User title ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("DONATE");
});

test('renders Username Label ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("unamelabel");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Name");
});

test('renders Username  ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("uname");
    expect(linkElement).toBeInTheDocument();
});

test('renders Email Id Label ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("emaillabel");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Email ID");
});

test('renders Email Id  ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("email");
    expect(linkElement).toBeInTheDocument();
});

test('renders Address Label ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("addresslabel");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Address");
});

test('renders Address  ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("address");
    expect(linkElement).toBeInTheDocument();
});

test('renders Phone Number Label ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("phnlabel");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Phone Number");
});

test('renders Phone Number  ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("phn");
    expect(linkElement).toBeInTheDocument();
});

test('renders Donation Label ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("donationlabel");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Donation");
});

test('renders Donation  ', () => {
    render(<AddUser />);
    const linkElement = screen.getByRole("donation");
    expect(linkElement).toBeInTheDocument();
});

it("renders 'Donate' ", () => {
    render(<AddUser />);
    const loginButton = screen.getByRole('button', { name: "Submit" });
    expect(loginButton).toBeInTheDocument();
  });