import axios from "axios";
import React from "react";
import { useState } from "react";
import { useEffect} from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddPetShop() {
  const [records, setRecords] = useState([]);
 
  
 
  const [inputData, setInputData] = useState({
    psid:"-1",
    psname: "",
    psaddress: "",
    psemail: "",
    psdesc: "",
    pets:
    {
      ppid: '',
      ppname : '',
      pptype : '',
      pgender : '',
      page : '',
      pstockLeft : '',
      price : ''
    }
  });

  useEffect(() => {
    loadData();
  }, []);

  const loadData = async () => {
    await axios.get("http://localhost:3333/pets/idlist")
      .then((res) => {
        console.log(res.data);
        setRecords(res.data);
        return res.data;
      })
      .catch((err) => console.error(err));
  };
 
  let handleChange = (e) => {
    if (e.target.name === "ppid") {
        console.log(e.target.value);
        setInputData({ ...inputData, pets: { ppid: e.target.value } });
        axios.get("http://localhost:3333/pets/"+e.target.value)
        .then((res)=>{
            console.log(res.data);
            setInputData({ ...inputData, pets: res.data });
            // setInputData({ ...inputData, payroll: { da: res.data.da } });
            // setInputData({ ...inputData, payroll: { basic: res.data.basic } });
            // setData(res.data);
            return res.data;
        })
        .catch((err) => console.error(err));
    }; 
  }

  
  const naviget = useNavigate();
 
  let handleSubmit = (e) => {
    e.preventDefault();
    // let result = validateValues(inputData);
    // setSubmitting(true);
 
    // if (result === true) {
      axios
        .post("http://localhost:3333/petShop", inputData)
        .then((res) => {
          console.log(inputData);
          alert("Data added Successfully");
          naviget("/viewpetshop");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
  
  };


  // const validateValues = (inputData) => {
  //   if (inputData.psname.length === 0) {
  //     alert("Please enter Pet Shop Name !!! ");
  //     return false;
  //   } else if (inputData.psaddress.length === 0) {
  //     alert("Please enter Address !!!");
  //     return false;
  //   } else if (inputData.psemail.length === 0) {
  //     alert("Please enter Email !!!");
  //     return false;
  //   } else if (inputData.psdesc.length === 0) {
  //     alert("Please enter Description !!!");
  //     return false;
  //   } 
  //     else {
  //     return true;
  //   }
  // };

  return (
    <div id="body">

    <div
      id="add2"
      className="d-flex w-100 vh-100 justify-content-center align-items-center "
    >
      <div className="w-50 border p-5 rounded" id="addemp">
        <form onSubmit={handleSubmit}>
          <h1>ADD EMPLOYEE DATA</h1>
          <div>
            <lable htmlFor="psname">Pet Shop Name :</lable>
            <input
              type="text"
              name="psname"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, psname: e.target.value})
              }
            />
          </div>

          <div>
            <lable htmlFor="psaddress">Address :</lable>
            <input
              type="text"
              name="psaddress"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, psaddress: e.target.value})
              }
            />
          </div>

          <div>
            <lable htmlFor="psemail">Email :</lable>
            <input
              type="text"
              name="psemail"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, psemail: e.target.value})
              }
            />
          </div>

          <div>
            <lable htmlFor="psdesc">Description :</lable>
            <input
              type="text"
              name="psdesc"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, psdesc: e.target.value})
              }
            />
          </div>
    
          <div>
          <label htmlFor="ppid">Pets Id</label>
          
                  <select
                    class="form-select"
                    required="required"
                    name="ppid"
                    title="Select ID "
                    onChange={handleChange}
                  >
                    <option name="ppid" selected="selected">
                      Select ID
                    </option>
                    {records.map((items) => (
                      <option value={items} key={items}>
                        {items}
                      </option>
                    ))}
                  </select>
            </div>

          <br />
          
          <button className="btn btn-info ">Submit</button>
        </form>

        
      </div>
    </div>
    </div>
  );
}


export default AddPetShop;
