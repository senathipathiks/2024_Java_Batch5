import React from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import View from './pages/View';
import Add from './pages/Add';
import Edit from './pages/Edit';
import Hero from './components/Hero';

function AppRouter() {

  return (
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<Hero/>}></Route>

        <Route path="/show" element={<View/>}></Route>
        <Route path="/create" element={<Add/>}></Route>
        <Route path="/update/:id" element={<Edit/>}></Route>
    </Routes>
    </BrowserRouter>
  )
}

export default AppRouter;
