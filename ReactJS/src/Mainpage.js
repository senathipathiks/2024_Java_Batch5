import React from 'react';
import {BrowserRouter as Router, Routes , Route, Link} from 'react-router-dom';
import Home from './Home';
import Blog from './Blog';
import ContactUs from './ContactUs';
import './Mystyle.css'
import Fetch from './Fetch';

// import './Mystyle.css'
function Mainpage() { 
  return (
    <div>
      <Router>
        <header>
            <nav>
              
                        <Link to ="/"><button>Home</button></Link>
                    
                        <Link to ="/blog"><button>Blogs</button></Link>
                   
                        <Link to ="/contactus"><button>ContactUs</button></Link>
                   
            </nav>
        </header>
        <Routes>
        {/* <Route exact path="/" element={<Mainpage/>}/> */}
        <Route exact path="/" element={<Home/>}/>
        <Route exact path="/blog" element={<Blog/>}/>
        <Route exact path="/contactus" element={<ContactUs/>}/>
      </Routes>
      </Router>
      <Fetch/>

      <footer>
        copyrights@2024     
      </footer>
    </div>
    
      )
}

export default Mainpage;
