import React from 'react'
import './RouterCss.css';  // import css file 
import {
    BrowserRouter as  Router,
    Routes,
    Route,
    Link,
} from 'react-router-dom'
import Home from './Home'
import Aboutus from './Aboutus'

function RouterExample() {
  return (
    <div>
        
        <Router>
            <header>
                <nav>           
                    <ul>
                        <li>
                            <Link to='/'>Home</Link>
                        </li>
                        <li>
                            <Link to='/about'>About Us</Link>
                        </li>
                    </ul>
                </nav>                
            </header>
            <Routes>
                <Route path='/' element={<Home />} />
                <Route path='/about' element={<Aboutus />} />
            </Routes>
        </Router>
      
    </div>
  )
}
export default RouterExample
