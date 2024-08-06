import axios from "axios";
import React from "react";
import { useState } from "react";
import { useEffect} from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function AddProduct() {
  const [records, setRecords] = useState([]);
 
  
 
  const [inputData, setInputData] = useState({
    productID:"-1",
    productName: "",
    productType: "",
    stockLeft: "",
    price: "",
    boutique:
    {
      boutiqueID: '',
      boutiqueName: '',
      email: '',
      address: '',
      description: ''
    }
  });

  useEffect(() => {
    loadData();
  }, []);

  const loadData = async () => {
    await axios.get("http://localhost:4444/boutique/idlist")
      .then((res) => {
        console.log(res.data);
        setRecords(res.data);
        return res.data;
      })
      .catch((err) => console.error(err));
  };
 
  let handleChange = (e) => {
    if (e.target.name === "boutiqueID") {
        console.log(e.target.value);
        setInputData({ ...inputData, boutique: { boutiqueID: e.target.value } });
        axios.get("http://localhost:4444/boutique/"+e.target.value)
        .then((res)=>{
            console.log(res.data);
            setInputData({ ...inputData, boutique: res.data });
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
        .post("http://localhost:4444/products", inputData)
        .then((res) => {
          alert("Product Data added Successfully !!!");
          naviget("/viewproducts");
          console.log(res.data);
        })
        .catch((err) => console.log(err));
  
  };


  // const validateValues = (inputData) => {
  //   if (inputData.productName.length === 0) {
  //     alert("Please enter Product Name !!! ");
  //     return false;
  //   } else if (inputData.productType.length === 0) {
  //     alert("Please enter Product Type !!!");
  //     return false;
  //   } else if (inputData.stockLeft.length === 0) {
  //     alert("Please enter Stock Left !!!");
  //     return false;
  //   } else if (inputData.price.length === 0) {
  //     alert("Please enter Price !!!");
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
          <h1>ADD PRODUCTS DATA</h1>
          <div>
            <label htmlFor="productName">Product Name :</label>
            <input
              type="text"
              name="productName"
              role="productname"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, productName: e.target.value})
              }
            />
          </div>

          <div>
            <label htmlFor="productType">Product Type :</label>
            <input
              type="text"
              name="productType"
              role="producttype"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, productType: e.target.value})
              }
            />
          </div>

          <div>
            <label htmlFor="stockLeft">Stock Left :</label>
            <input
              type="text"
              name="stockLeft"
              role="stockleft"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, stockLeft: e.target.value})
              }
            />
          </div>

          <div>
            <label htmlFor="price">Price :</label>
            <input
              type="text"
              name="price"
              role="price"
              className="form-control"
              onChange={(e)=>
                setInputData({ ...inputData, price: e.target.value})
              }
            />
          </div>
    
          <div>
          <label htmlFor="boutiqueID">Boutique Id</label>
          
                  <select
                    class="form-select"
                    required="required"
                    name="boutiqueID"
                    role="boutiqueID"
                    title="Select ID "
                    onChange={handleChange}
                  >
                    <option name="boutiqueID" selected="selected">
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


export default AddProduct
