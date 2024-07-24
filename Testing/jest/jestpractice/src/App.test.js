import { render, screen } from '@testing-library/react';
import App from './App';

// test('renders learn react link', () => {
//   render(<App />);
//   const linkElement = screen.getByText(/learn react/i);
//   expect(linkElement).toBeInTheDocument();
// });

describe('Test Suite', ()=>{

test('renders Nandha', () => {

  render(<App />);
  const linkElement = screen.getByText("Nandha");
  expect(linkElement).toBeInTheDocument();
});

test.skip('renders Ponraj', () => {
  render(<App />);
  const linkElement = screen.getByText("Ponraj");
  expect(linkElement).toBeInTheDocument();
});

it('renders Ponraj2', () => {
  render(<App />);
  const linkElement = screen.getByText("Ponraj");
  expect(linkElement).toBeInTheDocument();
});

});