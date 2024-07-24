import React ,{useState,useEffect} from 'react'
import "./Navbar.css"
import wer from "./asset/wer.jpg"
import menu from "./asset/menu.jpg"



const Navbar = () => {

  const[sticky,setSticky]=useState(false);
useEffect(()=>{
  window.addEventListener('scroll',()=>{
    window.scrollY > 500 ? setSticky(true): setSticky(false);
})
},[])
const [mobileMenu,setMobileMenu]=useState(false);
const toggleMenu=()=>{
mobileMenu?setMobileMenu(false):setMobileMenu(true);

}

  return (
<nav className={sticky ? 'con dark-nav' : 'con'}>
   
        <img src={wer} className='logo' />
        <ul className={mobileMenu?'':'hide-menu'}>
            <li><a href="#main" >Home</a></li>

            <li><a href="/ViewMaster" >Trainers</a></li>
            <li><a href="/ViewUser" >Members</a></li>
            <li><a href="#campus"  className='offset-target'>About</a></li>
            <li><a href="#test"  className='offset-target'>Contact Us</a></li>
            <li><button className='btn'><a href="/login">Log Out</a></button></li>
        </ul>
        <img src={menu} className='menu' onClick={toggleMenu}/>
    </nav>
  )
}


export default Navbar
