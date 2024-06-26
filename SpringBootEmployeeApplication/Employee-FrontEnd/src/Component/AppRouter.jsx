import React from 'react'
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";
import View from './View';
import Add from './Add';
import Edit from './Edit';
import ViewPayrolls from './ViewPayrolls';
import AddPayroll from './AddPayroll';
import EditPayroll from './EditPayroll';
import Header from './Header/Header';
import '../App.css'
import AddAccount from './AddAccount';
import ViewAccount from './ViewAccount';

function AppRouter() {
  return (
    <Router>
      <div className="App">
      <div className='h-Container'>
        <div className="white-gradient" />
        <Header />
      </div>
    </div>
        <Routes>
            <Route path="/" element={<View />} />
            <Route path="/create" element={<Add />} />
            <Route path="/update/:id" element={<Edit />} />
           <Route path='/viewpayrolls' element={<ViewPayrolls/>} />
           <Route path='/addpayroll' element={<AddPayroll/>}/>
           <Route path='/Editpayroll/:id' element={<EditPayroll/>}/>
           <Route path="/addaccount" element={<AddAccount />} />
           <Route path="/viewaccount" element={<ViewAccount />} />
        </Routes>
    </Router>
  )
}

export default AppRouter
