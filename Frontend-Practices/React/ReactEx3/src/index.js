// import React from 'react';
// import ReactDOM from 'react-dom/client';
// import './index.css';
// import App from './App';
// import reportWebVitals from './reportWebVitals';
// import Hello from './components/HelloWorld';
// import { Greet } from './components/Greet';
// import MyFun1 from './components/MyFun1';
// import PropsEx from './components/PropsEx';
// import PropsClass from './components/PropsClass';
// import StateClass from './components/StateClass';
// import StateFn from './components/StateFn';
// import List from './components/List';
// import Events from './components/Events';
// import ConditionalsFn from './components/ConditionalsFn';
// import ListsFn from './components/ListsFn';
// import Hooks from './components/Hooks';
// import UseEffects from './components/UseEffects';
// import UseForms from './components/UseForms';
// import User from './components/User';
// import ValidationForm from './components/ValidationForm';

// var fruits = ['Apple','Mango','Grapes', 'Orange', 'Banana'];

// const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(
//   <React.StrictMode>
//     {/* <App />  */}
//     {/* <Hello />
//     <Greet/> */}
//     {/* <MyFun1/> */}
//     {/* <PropsEx name="Nandhakumaran" city="Madurai"/> 
//     <PropsClass name="Nandhakumaran H" city="London"/>
//     <StateClass/>
//     <StateFn/>
//     <List/> */}
//     {/* <Events/> */}
//     {/* <ConditionalsFn result={true} fruits={fruits}/> */}
//     {/* <ListsFn/>
//     <Hooks/> */}
//     {/* <StateClass/>
//     <UseEffects/> */}
//     <ValidationForm/>
//     {/* <UseForms/> */}
//     {/* <User/> */}
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




