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
       
        <div id='login'>
        <h1 data-testid="heading">Welcome To TNEB Online Billing</h1>
       
        </div>
        </section>
        <Menu/>
       {/* <Grid/> wcva

       <Contact/>
      <Footer/> */}
    </div>
  )
}

export default Home;