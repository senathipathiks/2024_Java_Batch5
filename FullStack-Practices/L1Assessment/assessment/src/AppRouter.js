import React from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";

import Add from './pages/Add';
import AddPayroll from './pages/AddUser';

import Edit from './pages/Edit';
import Hero from './components/Hero';
import EditUser from './pages/EditUser';
import ViewOrder from './pages/ViewOrder';
import ViewUser from './pages/ViewUser';

import Signin from './pages/Signin';
import Signup from './pages/Signup';
import AddUser from './pages/AddUser';
import Team from './pages/Team';

function AppRouter() {

  return (
    <BrowserRouter>
    
    <Routes>
    <Route path="/" element={<Hero/>}></Route>

       

        <Route path="/create" element={<Add/>}></Route>
        <Route path="/createuser" element={<AddUser/>}></Route>
        <Route path="/update/:id" element={<Edit/>}></Route>
        <Route path="/updateuser/:id" element={<EditUser/>}></Route>

        <Route path="/view" element={<ViewOrder/>}></Route>
        <Route path="/viewuser" element={<ViewUser/>}></Route>

        <Route path="/signin" element={<Signin/>}></Route>

        <Route path="/signup" element={<Signup/>}></Route>
        <Route path="/items" element={<Team/>}></Route>


    </Routes>
    </BrowserRouter>
  )
}

export default AppRouter;
