import { render, screen } from '@testing-library/react';
import renderer from 'react-test-renderer';
import App from './App';

describe( 'All Test' ,() =>{
  test('renders learn react link', () => {
    render(<App />);
    const linkElement = screen.getByText(/Srienath/i);
    expect(linkElement).toBeInTheDocument();
  });
  
test('renders Hi', () => {
  render(<App />);
  const linkElement = screen.getByText('Hi !!!');
  expect(linkElement).toBeInTheDocument();
});
 
it('renders Welcome to Relevantz', () => {
  render(<App />);
  const linkElement = screen.getByText('Welcome to Relevantz');
  expect(linkElement).toBeInTheDocument();
});

});
 
// test("Snapshot test", () => {
//   render(<App />);
//   const comp = renderer.create(<App />);
//   const tree=comp.toJSON();
//   expect(tree).toMatchSnapshot();
// })

