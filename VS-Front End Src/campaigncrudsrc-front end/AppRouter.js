import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import ViewCampaign from "./ViewCampaign";
import ViewCandidate from "./ViewCandidate";
import AddCampaign from "./AddCampaign";
import AddCandidate from "./AddCandidate";
import UpdateCampaign from "./UpdateCampaign"
import UpdateCandidate from "./UpdateCandidate";
import Home from "./Home";


function AppRouter() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/viewcandidate" element={<ViewCandidate />} />
        <Route path="/viewcampaign" element={<ViewCampaign/>} />
        <Route path="/addcandidate" element={<AddCandidate/>} />
        <Route path="/addcampaign" element={<AddCampaign/>} />
        <Route path="/updatecandidate/:id" element={<UpdateCandidate/>} />
        <Route path="/updatecampaign/:id" element={<UpdateCampaign/>} />
      </Routes>
    </Router>
  );
}

export default AppRouter;
