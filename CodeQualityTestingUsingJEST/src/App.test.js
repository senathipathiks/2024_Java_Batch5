import { render, screen } from '@testing-library/react';
import App from './App';
import renderer from 'react-test-renderer';

describe('All Tests',()=>{
  test('renders learn react link', () => {
    render(<App />);
    const linkElement = screen.getByText('Learn Reactjs');
    expect(linkElement).toBeInTheDocument();
  });
});


test('renders learn react link', () => {
  render(<App />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});


test("Snapshot test", () => {
  render(<App/>);
  const comp = renderer.create(<App/>)
  const tree = comp.toJSON();
  expect(tree).toMatchSnapshot();

});


