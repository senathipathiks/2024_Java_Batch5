import React from 'react'

function ExamPass(){
    return <h1>You are Pass</h1>
}

function ExamFail(){
    return <h1>You are Fail</h1>
}

// function ConditionalsFn(props) {

//     var result = props.result;

//     if(result){
//         return <ExamPass/>
//     }
//     return <ExamFail/>
  
// }

function ConditionalsFn(props){

    var result = props.result;

    return(

        <>
        {result ? <ExamPass/> : <ExamFail/>}
        </>
    )

}

export default ConditionalsFn;

// // import React from 'react'

// // function ConditionalsFn(props) {

// //     var fruits = props.fruits;
// //   return (
// //     <>

// //     <h1>Fruits</h1>
// //     {fruits.length > 0 && <h3>I have {fruits.length} fruits in my Refridgerator.</h3>}
      
// //     </>
// //   );
// // }


// // export default ConditionalsFn;

// import React from 'react'
// import { useState } from 'react';

// function ConditionalsFn() {

//     const [flag,setFlag]=useState(true);
//     const trueEle = <div>Welcome Nandhakumaran H</div>
//     const falseEle = <div>Welcome Guest</div>

//     if(flag){
//         return (trueEle)
//     }
//     else{
//         return (falseEle)
//     }
// //   return (flag ? trueEle : falseEle);
// }

// export default ConditionalsFn;




