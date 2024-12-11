import { render, screen} from '@testing-library/react';
import {MemoryRouter} from 'react-router-dom';
import View from './View';




 
jest.mock("axios");
jest.mock('react-router-dom');
 
 
test('renders  title ', () => {
    render(<MemoryRouter><View /></MemoryRouter>);
    const linkElement = screen.getByRole("heading");
    expect(linkElement).toBeInTheDocument();
    expect(linkElement).toHaveTextContent("MATRIMONIAL SERVICE - GROOMS AND BRIDES DETAILS");
});
 
