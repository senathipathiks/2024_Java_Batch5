// import React from 'react';
// import ReactDOM from 'react-dom/client';
// import './index.css';
// import App from './App';
// import reportWebVitals from './reportWebVitals';
// import ValidationForm from './ValidationForm';
// import Memo from './Memo';
// import FetchApi from './components/FetchApi';

// const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(
//   <React.StrictMode>
//     {/* <App /> */}
//     {/* <ValidationForm/> */}
//     {/* <Memo/> */}
//     <FetchApi/>

//   </React.StrictMode>
// );

// // If you want to start measuring performance in your app, pass a function
// // to log results (for example: reportWebVitals(console.log))
// // or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
// reportWebVitals();

import React from 'react'
import ReactDOM from 'react-dom/client';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import Blog from "./pages/Blog";
import Contact from "./pages/Contact";
import NoPage from "./pages/NoPage";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App/>);


export default function App() {
  return (
    
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<Layout/>}>
      <Route index element={<Home/>}/>
      <Route path="blog" element={<Blog/>}/>
      <Route path="contact" element={<Contact/>}/>
      <Route path="*" element={<NoPage/>}/> 
    </Route>
    </Routes>
  

    </BrowserRouter>
  );
}