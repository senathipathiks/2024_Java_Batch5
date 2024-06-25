import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import ViewPetShop from "./ViewPetShop";
import AddPetShop from "./AddPetShop";
import UpdatePetShop from "./UpdatePetShop";
import ViewPets from "./ViewPets";
import AddPets from "./AddPets";
import UpdatePets from "./UpdatePets"
import Home from "./Home";


function AppRouter() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/viewpetshop" element={<ViewPetShop />} />
        <Route path="/addpetshop" element={<AddPetShop/>} />
        <Route path="/updatepetshop/:id" element={<UpdatePetShop/>} />
        <Route path="/viewpets" element={<ViewPets />} />
        <Route path="/addpets" element={<AddPets/>} />
        <Route path="/updatepets/:id" element={<UpdatePets/>} />
      </Routes>
    </Router>
  );
}

export default AppRouter;
