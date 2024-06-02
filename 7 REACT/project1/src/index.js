import React from 'react';
import ReactDOM from 'react-dom/client';
// import './index.css';
// // import App from './App';

import reportWebVitals from './reportWebVitals';
// import Hello from './components/HelloWorld';
// import Green from './components/Green';
// import MyFun1 from './components/MyFun1';
// import GreenFun1 from './components/GreenFun1';
// import Login from './components/Login';
// import Props from './components/Props';
// import PropsClass from './components/PropsClass';
// import StateClass from './components/StateClass';
// import Subs from './components/Subs';
// import StateFun from './components/StateFun';
// import List from './components/List';
// import Conditional from './components/Conditional';
// import ConClass from './components/ConClass';
// import Handler from './components/Handler';
// import UseEffect from './components/UseEffect';
// import TextField from './components/TextField'; 
// import User from './components/User';
// import Memo from './components/Memo';
// import ChildMemo from './components/ChildMemo';
// import Main from './components/Router/Main';
// import Fetch from './components/HTTPS/Fetch';
import Axios from './components/HTTPS/Axios';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}

    {/* <Hello />
    <Green />
    <MyFun1 />
    <GreenFun1 />
    <Login />
    <Props name="Gopikrishnan" city="Virudhunagar"> FROM FUNCTION : This sentence from children props HELLO ALL!!! </Props>
    <PropsClass name="Siva" city="Virudhunagar"> FROM CLASS: This sentence from children props HELLO ALL!!! </PropsClass>
    <Subs />
    <StateClass />
    <StateFun />
    <List />
    <Conditional />
    <ConClass />
    <Handler />
    <UseEffect /> */}
    {/* <Memo /> */}
    {/* <ChildMemo />
    <TextField />
    <User /> */}
    {/* <Main /> */}

    {/* <Fetch /> */}
    <Axios />
    
  </React.StrictMode>

);



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();