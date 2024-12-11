import React from 'react'
import Hero from './Components/Hero'

import AppBar from './Components/Appbar'
import Footer from './Components/Footer'
import Contact from './Components/Contact'
import Banner from './Components/Banner'


function Landing() {
  return (
    <div>
        <AppBar/>
        <Banner/>
      <Hero/>
      {/* <Product/> */}
      <Contact/>
      <Footer/>
    </div>
  )
}

export default Landing
