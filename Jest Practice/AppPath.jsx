import React from 'react'

import Entry from './Entry'

import {BrowserRouter as Router,Routes,Route } from "react-router-dom";
import AddMaster from './AddMaster';
import AddUser from './AddUser';
import EditMaster from './EditMaster';
import EditUser from './EditUser';
import ViewMaster from './ViewMaster';
import ViewUser from './ViewUser';
import SignUp from './SignUp';

import Login from './Login';
import AppRoute from './AppRoute';

const AppPath = () => {
  return (
    <div>
      <Router>
      <Routes>
        <Route path="/" element={<Entry />} />
        <Route path="/AppRoute" element={<AppRoute />} />
        
        <Route path="/AddMaster" element={<AddMaster />}/>
        <Route path="/AddUser" element={<AddUser />}/>
        <Route path="/EditMaster/:id" element={<EditMaster />}/>
        <Route path="/EditUser/:id" element={<EditUser />}/>
        <Route path="/ViewMaster" element={<ViewMaster/>}/>
        <Route path="/ViewUser" element={<ViewUser />}/>
        <Route path="/SignUp" element={<SignUp />}/>
        <Route path="/login" element={<Login />}/>



      </Routes>
    </Router>
    </div>
  )
}

export default AppPath
