import React from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import About from './About';
import Homepage from './Homepage';
import Addshop from './Addshop';
import Editshop from './Editshop';
import Viewshop from './Viewshop';
import Addproduct from './Addproduct';
import Viewproduct from './Viewproduct';
import Editproduct from './Editproduct';

function Approuter() {
  return (
    <Router>
        <Homepage/>
        <Routes>
            <Route path="/" element={<About/>}/>
            <Route path="/home" element={<About/>}/>
            <Route path="/add" element={<Addshop/>} />
            <Route path="/edit/:id" element={<Editshop/>} />
            <Route path="/view" element={<Viewshop/>} />
            <Route path="/addproduct" element={<Addproduct/>} />
            <Route path="/viewproduct" element={<Viewproduct/>} />
            <Route path="/editproduct/:id" element={<Editproduct/>} />

        </Routes>
    </Router>
   
  )
}

export default Approuter
