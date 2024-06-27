import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import View from "./View";
import PayView from "./Payroll/PayView"
import Add from "./Add";
import Edit from "./Edit";
import ColorSchemesExample, { CardComp } from "./ColorSchemesExample";
import Search from "./Search";
import PayAdd from "./Payroll/PayAdd";
import PayEdit from "./Payroll/PayEdit";
// import Registration from "./Registration";

function Approuter() {
  return (
    <Router>
      <ColorSchemesExample/>
      {/* <CardComp /> */}
     <Routes>
        {/* <Route path="/" element={<ColorSchemesExample/>}/> */}
        <Route path="/" element={<CardComp/>}/>
        <Route path="/view" element={<View/>}/>
        <Route path="/create" element={<Add/>}/>
        <Route path="/update/:id" element={<Edit/>}/>
        <Route path="/payupdate/:id" element={<PayEdit/>}/>
        <Route path="/search" element={<Search/>}/>
        <Route path="/payroll" element={<PayView/>}/>
        <Route path="/insertpay" element={<PayAdd/>}/>

        {/* <Route path="login" element={<Registration/>}/> */}
        {/* <Route path="signin" element={<Signin/>}/> */}
        
        </Routes> 
    </Router>
  )
}

export default Approuter;
