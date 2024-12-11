import React, { Component } from 'react';
import ReactDOM from 'react-dom/client';
//import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Simple1 from './Simple';
import Defaultconv from './component/Sample';
import { Sample1 } from './component/Sample1'; //namedconvention
import PropsEx from './component/PropsEx';
import Propsclass from './component/Propsclass';
import StateClass from './component/StateClass';
import Statefn from './component/Statefn';
import List from './component/List';
//import Login from './component/Login';
import ConditionalRenderingfn from './component/ConditionalRenderingfn';
import Timer from './component/Timer';
import Forms from './component/Forms';
import Formvalidation from './component/Formvalidation';
import Component1 from './component/Component1';
import Reducer from './component/Reducer';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <Simple1/> */}
    {/* <App /> */}
    {/* <Defaultconv/>
    <Sample1/>
    <PropsEx name="Vashanth" city="Madurai"/>
    <Propsclass name="Vasi" city="Florida"/>
    <StateClass/>
    
    <List/> */}
    {/* <Login/> */}
    {/* <Statefn/>
    <ConditionalRenderingfn/> */}
    {/* <Timer/> */}
    {/* <Forms/> */}
    <Reducer/>
    <Component1/>
    {/* <usercontext/> */}
    {/* <Formvalidation/> */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
