import React from 'react'
import './App2.css'
// import Footer from './Footer'
// import  Grid  from './Grid'
// import CTA from './CTA'
// import Contact from './Contact'
import Menu  from './Menu'
function Home() {
  return (
    <div>
        {/* <CTA/> */}
        <section > <img src='https://cdn.prod.website-files.com/64ef69890f8c25d119ae1fb4/6514ab28de0a7b9736dda448_importance_of_electricity_bills-jpg.webp'></img>
        <div id='banner'>
          
        <h1> Welcome to TNEB  Electric Billing Portal !!</h1>
        </div>
        </section>
        <Menu/>
       {/* <Grid/> 

       <Contact/>
      <Footer/> */}
    </div>
  )
}

export default Home;
