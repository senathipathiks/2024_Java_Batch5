import React, { useEffect, useRef, useState } from 'react';
import logos from './logos.png';
import './Navbar.css';

function Navbar() {

    const lastScrollTop = useRef(0);
    const [isNavbarVisible, setIsNavbarVisible] = useState(true);

    const handleScroll = () =>{
        const { pageYOffset } = window;
        if(pageYOffset > lastScrollTop.current){
            setIsNavbarVisible(false);
        }
        else if(pageYOffset < lastScrollTop.current){
            setIsNavbarVisible(true);
        }
        lastScrollTop.current = pageYOffset;
    }

    useEffect(() => {
        window.addEventListener("scroll", handleScroll,{ passive: true});
        return window.removeEventListener("scroll", handleScroll)
    }, []);

  return (
    <>
      <nav className={'${isNavbarVisible ? "visible" : ""}'}>

        <img src={logos} />
    <div className='Nav-items'>
        <a href="Portfolio">Portfolio</a>
        <a href="">Skills</a>
        <a href="">About</a>
    </div>

      </nav>
    </>
  )
}

export default Navbar;
