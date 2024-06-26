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
        <img src="./fur.jpg" alt="logo" width={60} className="images" />

        <OutsideClickHandler
        onOutsideClick={()=>setMenuOpened(false)}
        >
        <div className="h-menu flexCenter" style={getMenuStyles(menuOpened)}>
            
          <a href="/">SOLD FURNITURE</a>
          <a href="/viewsales">VIEW SALES </a>
          <a href="/addfurniture">ADD FURNITURE</a>
          <a href="/addsales">ADD SALES</a>

          
          <button className="button">
            <a href="viewavailablefurniture">View Availabale Furniture</a>
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
