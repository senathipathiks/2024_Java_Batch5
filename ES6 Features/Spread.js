// let arr1 = [10,20,30];
// let min = Math.min(...arr1);
// console.log(min);

// let arr2 = [10,20,30];
// let max = Math.max(...arr2);
// console.log(max); 


// Spread Operator with Objects

// const myVehicle = {
//     brand: 'Ford',
//     model: 'Mustang',
//     color: 'red'
//   }
  
//   const updateMyVehicle = {
//     type: 'car',
//     year: 2021, 
//     color: 'yellow'
//   }
  
//   const myUpdatedVehicle = {...myVehicle, ...updateMyVehicle} 

  
//   console.log(myUpdatedVehicle);
  
//   It will also the Update the value with last given value

// function add(...arr1) {  // rest operator
//     var sum = 0;
//     arr1.forEach((element) => {
//         sum+=element;
//       });
//       return sum;
// }

// let arr=[1,2,3];
// let val = add(...arr);  // spread Operator

// console.log(val);



function add(a,b,c,d,...f) {  // rest operator
    
      return a+b+c+d;
}

let arr=[1,2,3,4,5,6,7,8];
let val = add(...arr);  // spread Operator

console.log(val);



