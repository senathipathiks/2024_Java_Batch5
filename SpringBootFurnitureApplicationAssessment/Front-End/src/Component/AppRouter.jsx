import React from 'react'
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";

import AddSales from './AddSales';
import EditFurniture from './EditFurniture';
import ViewSales from './ViewSales';
import AddFurniture from './AddFurniture';
import Edit from './EditSale';
import Header from './Header/Header';
import '../App.css'
import ViewFurniture from './ViewFurniture';
import EditSale from './EditSale';
import ViewAvailableFurniture from './ViewAvailableFurniture';

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
            <Route path="/" element={<ViewFurniture />} />
            <Route path="/addsales" element={<AddSales />} />
            <Route path="/editfurniture/:id" element={<EditFurniture />} />
           <Route path='/viewsales' element={<ViewSales/>} />
           <Route path='/addfurniture' element={<AddFurniture/>}/>
           <Route path='/editsale/:id' element={<EditSale/>}/>
           <Route path="/viewavailablefurniture" element={<ViewAvailableFurniture />} />
        </Routes>
    </Router>
  )
}

export default AppRouter
