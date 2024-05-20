import React from 'react'

function Events() {

    function shows(a){
        alert('This amount of text is enough for you,  '+a);
    }

  return (

    <button onClick={()=>shows('Sorry for the uappropriate text!!!')}>Show some text</button>
    
  )
}

export default Events;




