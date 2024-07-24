import React from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import AppliNavBar from './AppliNavBar';
import Home from './Home';
import ViewRequest from '../Request/ViewRequest';
import AddRequest from '../Request/AddRequest';
import ViewBlood from '../BloodBank/ViewBlood';
import AddBlood from '../BloodBank/AddBlood';
import UpdateBlood from '../BloodBank/UpdateBlood';

function AppRouter() {
  return (
    <div>
        <Router>
            <AppliNavBar />
            <Routes>
                <Route path='/' element={<Home />}/>
                <Route path='/viewRequests' element={<ViewRequest />}/>
                <Route path='/addRequest' element={<AddRequest />}/>
                <Route path='/viewBloods' element={<ViewBlood />}/>
                <Route path='/addBlood' element={<AddBlood />}/>
                <Route path='/updateBlood/:id' element={<UpdateBlood />}/>
            </Routes>
        </Router>
    </div>
  )
}

export default AppRouter
