import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import HomePage from "./HomePage";
import Footer2 from "./Footer2";
import Navbarss from "./Navbarss";
import ViewCourse from "../Pages/ViewCourse";
import ViewUsers from "../Pages/ViewUsers";
import ViewCard from "./ViewCard";
import AddUser from "../Pages/AddUser";
import UpdateUser from "../Pages/UpdateUser";
import UpdateCourse from "../Pages/UpdateCourse";
import AddCourse from "../Pages/AddCourse";


function AppRouter() {
  return (
    <div>
      <Navbarss />
      <Router>
        <Routes>

          {/*                Home Page Components                   */} 
          <Route path="/" element={<HomePage />} />

          {/*                View Components                        */}
          <Route path="/viewCard" element={<ViewCard />} />
          <Route path="/viewUser" element={<ViewUsers />} />
          <Route path="/viewCourse" element={<ViewCourse />} />


          {/*                Add Components                         */}
          
          <Route path="/addUser" element={<AddUser />} />
          <Route path="/addCourse" element={<AddCourse />} />

          {/*                Update Components                         */}
          <Route path="/updateUser/:id" element={<UpdateUser/>}/>
          <Route path="/updateCourse/:id" element={<UpdateCourse/>}/>

        </Routes>
      </Router>
      <Footer2 />
    </div>
  )
}

export default AppRouter;