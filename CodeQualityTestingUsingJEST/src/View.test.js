import { render, screen } from '@testing-library/react';
import axios from 'axios'; 
import View from './View'; 
import MockAdapter from 'axios-mock-adapter';
import { useNavigate } from 'react-router-dom'
jest.mock('axios'); 
 
jest.mock('react-router-dom', () => ({
    ...jest.requireActual('react-router-dom'),
    useNavigate: jest.fn(),
  }));

const mock = new MockAdapter(axios);
const mockNavigate = jest.fn();
useNavigate.mockReturnValue(mockNavigate);
 
afterEach(() => {
    mock.reset();
});
// test('Deletes a record',  () => {
//     render(<View />);

//     // Wait for axios GET request to resolve and component to update
//     // await waitFor(() => {
//       // Find the "Delete" button for the first record (John Doe)
//       const deleteButton = screen.getByText('Delete');
//       expect(deleteButton).toBeInTheDocument();
//     });
    //   // Mock window.confirm to return true
    //   window.confirm = jest.fn(() => true);

    //   // Simulate click on the "Delete" button
    //   fireEvent.click(deleteButton);

    //   // Wait for axios DELETE request to resolve
    //   return waitFor(() => {
    //     // Assert that "record has deleted" alert is shown
    //     expect(screen.getByText('record has deleted')).toBeInTheDocument();
    //     // Assert that navigate("/") is called
    //     expect(window.location.pathname).toBe('/');
    //   });
    // });


test('Filters records by customer name', async () => {
    render(<View />);

    
      const searchInput = screen.getByPlaceholderText('Search by Customer Name...');

    
});