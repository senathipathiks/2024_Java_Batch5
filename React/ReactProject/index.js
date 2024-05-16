import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
// import FetchEx from './components/FetchEX';
// import Main from './components/Main'
// import AxiEX from './AxiEX';
// import List from './components/List1';
// import TextField from './components/TextField';
// import Demo from './components/Demo';
// import AkEmail from './components/AkEmail';
// import User from './components/User';
// import UserEmail from './components/UserEmail'
// import Hello from './components/HelloWorld';
// import Greet from './components/Greet';
// import MyFun1 from './components/MyFun1';
// import Greeting from './components/Greeting';
// import Login from './components/Login';
// import Login1 from './components/Login1';
// import PropsEx from './components/PropsEx';
// import PropsEX1 from './components/PropsEX1';
// import StateClass from './components/StateClass';
// import StateClass1 from './components/StateClass1';
// import StateFn from './components/StateFn';
import List from './components/List';
// import ConditionalRend from './components/ConditionalRend';
// import ConditionalClass from './components/ConditionalClass';
// import HandlerClass from './components/HandlerClass';
// import UseEffect from './components/UseEffect';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <Hello />
    <Greet/>
    <MyFun1/>
    <Greeting/>
    <Login/>
    <Login1/>
    <PropsEx name="ANI" city="Tirunelveli" ID="123">This is ANi's functional components</PropsEx>
    <PropsEX1 name="Kingsetha" city="Tirunelveli"/>
    <StateClass/>
    <StateClass1/>
    <StateFn/>
    <List/>
    <ConditionalRend/>
    <ConditionalClass/>
    <HandlerClass/>
    <UseEffect/> */}
  {/* <TextField/> */}
  {/* <User/> */}
  {/* <UserEmail/> */}
  {/* <Demo/> */}
  {/* <Main/> */}
    {/* <AkEmail/> */}
    {/* <FetchEx/> */}
    {/* <AxiEX/> */}
    <List/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
