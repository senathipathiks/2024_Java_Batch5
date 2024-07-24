import { render, screen} from '@testing-library/react';
import SignUp from './SignUp';
import axios from 'axios';
import { BrowserRouter,Routes } from 'react-router-dom';
jest.mock('axios');
jest.mock('react-router-dom');

// describe("Registration TestCases", () => {
//  test("Testing Registration Heading", () => {
//  render(<SignUp />);
//  const registrationheading = screen.getAllByTestId("title");
//  expect(registrationheading).toBeInTheDocument();
//  expect(registrationheading).toHaveTextContent("Create an account and get access to all features for 30-days, No credit card required.");
//  })
// });
describe("Testing the Input Fields", () => {
 test("Testing the Input Fields", () => {
 render(<SignUp />);
 const namefield = screen.getByTestId("namefield");
 expect(namefield).toBeInTheDocument();

 const emailfield = screen.getByTestId("emailfield");
 expect(emailfield).toBeInTheDocument();
 const pwdfield = screen.getByTestId("pwdfield");
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
 

