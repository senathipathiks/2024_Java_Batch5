import React, { useState } from 'react'
 
export default function MyForm() {
 
    // const [inputFields, setInputFields] = useState({
    //     fname:"",
    //     lname:"",
    //     email:"", pcode: "",cpcode: ""
    //   });
 
  const [fname, setFname] = useState("");
  const [lname, setLname] = useState("");
  const [email, setEmail] = useState("");
  const [pcode, setPcode] = useState("");
  const [cpcode, setCpcode] = useState("");
 
 
 
// const handleChange = (e) => {
 
//     setInputFields({...inputFields, [e.target.name]: e.target.value });
//   };
 
 
 
 
 
  const fnamePrint = (e) => {setFname(e.target.value)};
  const lnamePrint = (e) => {setLname(e.target.value)};
  const emailPrint = (e) => {setEmail(e.target.value)};
  const pcodePrint = (e) => {setPcode(e.target.value)};
  const cpcodePrint = (e) => {setCpcode(e.target.value)};
 
 
const SubmitFunc = (e) => {
    e.preventDefault();
    // console.log('presentstate',inputFields);
    console.log(fname , lname , email , pcode , cpcode);
   
}
 
// const handleSubmit = (event) => {
//     event.preventDefault();
//     setErrors(validateValues(inputFields));
//     setSubmitting(true);
//   };
   
  return (
    <div>
      <form onSubmit={SubmitFunc}>
        <table>
            <th> Register </th>
            <tr>
                <td><label htmlFor="firstname"> First Name : </label></td>
                <td><input type="text"  id="fname" name='fname' onChange={fnamePrint}/></td>
            </tr>
            <tr>
                <td><label htmlFor="lastname"> Last Name : </label></td>
                <td><input type="text"  id="lname" name='lname' onChange={lnamePrint}/></td>
            </tr>
            <tr>
                <td><label htmlFor="email"> Email : </label></td>
                <td><input type="email"  id="email" name='email' onChange={emailPrint}/></td>
            </tr>
            <tr>
                <td><label htmlFor="password"> Password : </label></td>
                <td><input type="password"  id="passcode" name='pcode' onChange={pcodePrint}/></td>
            </tr>
            <tr>
                <td><label htmlFor="cpassword"> Confirm Password : </label></td>
                <td><input type='password' id="cpasscode" name='cpcode' onChange={cpcodePrint}/></td>
            </tr>
            <tr>
                <td><input type="submit" value="submit" /></td>
            </tr>
        </table>
      </form>
    </div>
  )
}