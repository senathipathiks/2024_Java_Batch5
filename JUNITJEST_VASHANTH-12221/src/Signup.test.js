import { render, screen} from '@testing-library/react';
import SignUp from './SignUp';
import { waitFor } from "@testing-library/react-native";
import axios from 'axios';
import { BrowserRouter,Routes } from 'react-router-dom';
jest.mock('axios');
jest.mock('react-router-dom');


describe("Testing the Input Fields", () => {
 test("Testing the Input Fields", () => {
 render(<SignUp />);
//  const namefield = screen.getAllByRole("namein");
//  expect(namefield).toBeInTheDocument();
 const nameFields = screen.getAllByTestId('namefield');

 
 nameFields.forEach(async (nameField) => {
   //expect(nameField).toBeInTheDocument();
  await waitFor(() => expect(getByTestId("namefield")).toBeInTheDocument());
 });
 

 const emailfield = screen.getAllByRole("emailin");
 expect(emailfield).toBeInTheDocument();
 const pwdfield = screen.getAllByRole("pwdin");
 expect(pwdfield).toBeInTheDocument();

 });
});
describe("Testing the input placeholder", () => {
 test("Testing the Placeholder", () => {
 render(<SignUp />);
 const nameplaceholder = screen.getByPlaceholderText("Name.....");
 expect(nameplaceholder).toBeInTheDocument();
 });

 test("Testing the Placeholder", () => {
 render(<SignUp />);
 const emailplaceholder = screen.getByPlaceholderText("Email.....");
 expect(emailplaceholder).toBeInTheDocument();
 });
 test("Testing the Placeholder", () => {
 render(<SignUp />);
 const pwdplaceholder = screen.getByPlaceholderText("Password.....");
 expect(pwdplaceholder).toBeInTheDocument();
 });

});


describe("Testing the Inputfield is empty", ()=>{
render(<SignUp />);
 const checkfname = screen.getByTestId('namefield');
 expect(checkfname).toBeInTheDocument();
 expect(checkfname).toHaveTextContent('');
 });

 test("Test the email field is empty or not ", () => {
 render(<SignUp />);
 const checkemail = screen.getByTestId('emailfield');
 expect(checkemail).toBeInTheDocument();
 expect(checkemail).toHaveTextContent('');
 });
 test("Test the password field is empty or not ", () => {
 render(<SignUp />);
 const checkfpassword = screen.getByTestId('pwdfield');
 expect(checkfpassword).toBeInTheDocument();
 expect(checkfpassword).toHaveTextContent('');
 });
 

