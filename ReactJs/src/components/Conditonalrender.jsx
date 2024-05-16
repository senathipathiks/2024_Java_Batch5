import React,{useState} from 'react';

function Conditonalrender() {

    const [flag,setFlag] = useState(true);
    const trueEle = <div>Welcome Aravind!</div>
    const falseEle = <div>Welcome Guest</div>

    //   if(flag)
    //     return (trueEle)
      
    //   else
    //     return (falseEle)

    return(flag ? trueEle : falseEle)
      
}

export default Conditonalrender;
