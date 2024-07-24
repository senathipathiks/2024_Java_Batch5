import { render, screen } from '@testing-library/react';
import Home from './Home';

// test('renders home ', () => {
//     render(<Home/>);
//     const linkElement = screen.getByRole("abcd");
//     expect(linkElement).toBeInTheDocument();
//    // expect(linkElement).toHaveTextContext();
//   });

// test('renders Home Text Content', () => {
//     render(<Home />);
//     const linkElement = screen.getByText("Welcome");
//     expect(linkElement).toBeInTheDocument();
//   });
  test('renders  title ', () => {
    render(<Home />);
    const linkElement = screen.getByTestId("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("Welcome To TNEB Online Billing");
});