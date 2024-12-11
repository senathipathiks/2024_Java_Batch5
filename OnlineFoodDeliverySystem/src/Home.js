import React from 'react'
import Footer from './Footer'
import  Grid  from './Grid'
import CTA from './CTA'
import Contact from './Contact'
import Menu  from './Menu'
function Home() {
  return (
    <div>
        <CTA/>
        <Menu/>
       <Grid/> 

       <Contact/>
      <Footer/>
    </div>
  )
}

export default Home;
