import React from 'react'

function Menu(props){
    return <li>Tasty {props.food} ready!!</li>
}

function ListsFn() {

    // var foods=['Idli','Dosa', 'Pongal', 'Chappathi'];

var foods = [
    {item: 1,food: 'Idli'},{item: 2,food: 'Dosa'},{item: 3, food: 'Pongal'}, {item: 4, food:'Chappathi'}];

  return (
    <>
     <h1>What are the foods are available in this hotel?</h1>
    <ul>
        {/* {foods.map((menu) => <Menu food={menu}/> )} */}

        {foods.map((menu) => <Menu Key={menu.item} food={menu.food}/>)}
    </ul>
    </>
   
    
  )
}

export default ListsFn;
