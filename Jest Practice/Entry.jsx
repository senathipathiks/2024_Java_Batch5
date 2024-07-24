import React from 'react';
import './Entry.css'

function Entry() {
  return (
    <div className="entry" style={{ height: '100vh', display: 'flex', justifyContent: 'center', alignItems: 'center' }}>
      <div className="text-block">
        <h4 style={{ fontSize: "40px", textDecoration: "none",color:"wheat" }}>This is Gym Center  System</h4>
        <p style={{ fontSize: "20px", textDecoration: "none", color: "gray" }}>Fit Body Leads To Healthy Life!!!</p>
        <a href="/SignUp" style={{ textDecoration: "none", color: "white" }}>
          <button className="entry-btn" name="entry-btn" style={{ fontSize: "20px", textDecoration: "none" }}> Get Started</button>
        </a>
      </div>
    </div>
  );
}

export default Entry;
