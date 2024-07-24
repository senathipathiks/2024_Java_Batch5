import React from 'react';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Add from './Add';
import View from './View';
import Edit from './Edit';

function AppRouter() {

  return (
    <BrowserRouter>
    <Routes>
        <Route path="/" element={<View/>}></Route>
        <Route path="/create" element={<Add/>}></Route>
        <Route path="/update/:id" element={<Edit/>}></Route>
        {/* <Route path="/delete" element={<App2/>}></Route> */}
    </Routes>
    </BrowserRouter>
  )
}

export default AppRouter;
