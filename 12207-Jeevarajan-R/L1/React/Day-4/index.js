import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';
import {HelloWorldComponents} from './components/HelloWorldComponents';
// import { Greet } from './components/HelloWorldComponents';
import Login from './components/Login';
// import { LoginF } from './components/Login';

import New from './components/HelloWorldComponents';
import PropEx,{Child} from './components/PropEx.jsx';
import StateClass from './components/StateClass.jsx';
import StateFnc from './components/StateFnc.jsx';
import ListRendering from './components/ListRendering.jsx';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    <ListRendering/>
    <HelloWorldComponents />
    <div>
      <center>
        {/* <Greet/> */}
        {/* <LoginF/> */}
        <PropEx name="Jeeva" city="Chennai" />        
        {/* <DeStruct name="Prince" city="Madurai" /> */}
      </center>
    </div>
    <New/>
    <Login/>
    <div>
      <center>
        <Child name="Jason" city="Sydney"><b> I am very <i>Happy to See you all</i></b></Child>
        <StateFnc/>
      </center>
      <StateClass/>
    </div>

  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
