import React from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import View from './pages/View';
import ViewPayroll from './pages/ViewPayroll';

import Add from './pages/Add';
import AddPayroll from './pages/AddPayroll';

import Edit from './pages/Edit';
import Hero from './components/Hero';
import EditPayroll from './pages/EditPayroll';
import FindEmployee from './pages/FindEmployee';
import FindPayroll from './pages/FindPayroll';

import Main from './Main';



function AppRouter() {

  return (
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<Main/>}></Route>

    <Route path="/hero" element={<Hero/>}></Route>

        <Route path="/show" element={<View/>}></Route>
        <Route path="/showpay" element={<ViewPayroll/>}></Route>

        <Route path="/create" element={<Add/>}></Route>
        <Route path="/createpay" element={<AddPayroll/>}></Route>
        <Route path="/update/:id" element={<Edit/>}></Route>
        <Route path="/updatepay/:id" element={<EditPayroll/>}></Route>

        <Route path="/find" element={<FindEmployee/>}></Route>
        <Route path="/findpay" element={<FindPayroll/>}></Route>




    </Routes>
    </BrowserRouter>
  )
}

export default AppRouter;
