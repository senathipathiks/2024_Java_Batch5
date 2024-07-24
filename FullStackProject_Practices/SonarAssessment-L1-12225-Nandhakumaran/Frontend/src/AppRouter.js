import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Main from "./Components/Main";
import Login from "./Components/Login";
import Signup from './Components/Signup'; 
// import Home from "./Components/User/Home";

import HomeAdmin from "./Components/Admin/HomeAdmin";
import Footer from "./Components/Admin/Footer";

import Restaurant from "./Components/Admin/Restaurant/Restaurant";
import RestAdd from "./Components/Admin/Restaurant/RestAdd";
import RestEdit from "./Components/Admin/Restaurant/RestEdit";

import FoodView from "./Components/Admin/Food/FoodView";
import FoodAdd from "./Components/Admin/Food/FoodAdd";
import FoodEdit from './Components/Admin/Food/FoodEdit';
function AppRouter() {
  return (
   
    <Router>
      <Routes>
        <Route path="/" element={<Main/>} />

        <Route path="/Login" element={<Login/>} />
        <Route path="/Signup" element={<Signup/>} />
        <Route path="/Admin" element={<HomeAdmin/>} />
      
        <Route path="/Footer" element={<Footer/>} />

        <Route path="/Restaurant" element={<Restaurant/>} />
        <Route path="/RestAdd" element={<RestAdd/>} />
        <Route path="/RestEdit/:restaurant_id" element={<RestEdit/>} />

        <Route path="/FoodView" element={<FoodView/>} />
        <Route path="/FoodEdit/:fid" element={<FoodEdit/>} />
        <Route path="/FoodAdd" element={<FoodAdd/>} />
      </Routes>
    </Router>
    
  );
}

export default AppRouter;