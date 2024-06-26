import React, { useState } from "react";
import { BiMenuAltRight } from "react-icons/bi";
import OutsideClickHandler from "react-outside-click-handler";
import "./Header.css";
const Header = () => {
  const [menuOpened, setMenuOpened] = useState(false)

  const getMenuStyles =(menuOpened)=>{
    if(document.documentElement.clientWidth <=800){
        return {right: !menuOpened && "-100%"}
    }
  }
  return (
    <section className="h-wrapper">
      <div className="h-container flexCenter paddings innerWidth">
        <img src="./employee.png" alt="logo" width={50} className="images" />

        <OutsideClickHandler
        onOutsideClick={()=>setMenuOpened(false)}
        >
        <div className="h-menu flexCenter" style={getMenuStyles(menuOpened)}>
            
          <a href="/">VIEW EMPLOYEE</a>
          <a href="/viewpayrolls">VIEW PAYROLL </a>
          <a href="/viewaccount">VIEW ACCOUNT</a>
          <a href="/create">ADD EMPLOYEE</a>
          <a href="/addpayroll">ADD PAYROLL</a>
          <a href="/addaccount">ADD ACCOUNT</a>
          
          <button className="button">
            <a href="">View ALL</a>
          </button>
        </div>
        </OutsideClickHandler>
        <div
          className="menu-icon"
          onClick={() => setMenuOpened((prev) => !prev)}
        >
          <BiMenuAltRight size={30} />
        </div>
      </div>
    </section>
  );
};

export default Header;
