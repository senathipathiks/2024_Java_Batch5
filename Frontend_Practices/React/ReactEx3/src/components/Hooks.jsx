// import React, { useState } from 'react'

// function Hooks() {

//     var [color,setColor] = useState("Transparent");

//   return (
//     <>
//     <h1>
//         My Favorite color is {color}!
//     </h1>
//     <button onClick={()=>setColor("Blue")}>Blue</button>
//     <button onClick={()=>setColor("Red")}>Red</button>
//     <button onClick={()=>setColor("Green")}>Green</button>
//     <button onClick={()=>setColor("Yellow")}>Yellow</button>
//     </>
   
//   )
// }

// export default Hooks

import React, { useState } from 'react'

function Hooks() {

    var [car,setCar] = useState({

        brand: "RollRoyce",model: "Boat",year: "2022", color: "Red"

    });

    function updateColor(){
        setCar(previousState=>{
            return{...previousState,color:"Blue"}
        });
    }
  return (

        <>
        <h1>My {car.brand}</h1>
    <h3>
        It is a {car.color} {car.model} from {car.year}.
    </h3>
    <button onClick={updateColor}>Change color of the car</button>
    </>
    
    
  )
}

export default Hooks;

