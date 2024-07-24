import { render, screen } from '@testing-library/react';
import Viewuser from './Viewuser';



 
jest.mock("axios");
jest.mock('react-router-dom');
 
 
test('renders  title ', () => {
    render(<Viewuser/>);
    const linkElement = screen.getByTestId("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("MATCH MAKER DETAILS");
});


 
test('renders NAME HEADING in TAble', () => {
    render(<Viewuser />);
    const linkElement = screen.getByRole("Name");
    expect(linkElement).toBeInTheDocument();
   
});
 
test('renders MOBILE HEADING  in table', () => {
    render(<Viewuser />);
    const linkElement = screen.getByRole("mobile");
    expect(linkElement).toBeInTheDocument();
    
});
 



test('renders ADDRESS in table ', () => {
    render(<Viewuser />);
    const linkElement = screen.getByRole("Addr");
    expect(linkElement).toBeInTheDocument();
   
});


// test('renders ADD button', () => {
//     render(<Viewuser />);
//     const linkElement = screen.getByTestId("Add");
//     expect(linkElement).toBeInTheDocument();
//     expect(linkElement).toHaveTextContent("Add");
// });

// test('renders Update button', () => {
//     render(<Viewuser />);
//     const linkElement = screen.getByTestId("update");
//     expect(linkElement).toBeInTheDocument();
//     expect(linkElement).toHaveTextContent("Update");
// });


// test('renders Delete button', () => {
//     render(<Viewuser />);
//     const linkElement = screen.getByTestId("del");
//     expect(linkElement).toBeInTheDocument();
//     expect(linkElement).toHaveTextContent("Delete");
// });
