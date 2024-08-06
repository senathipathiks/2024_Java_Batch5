import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function UpdateProduct() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  const [records, setRecords] = useState([]);
 

  useEffect(() => {
    axios
      .get("http://localhost:4444/products/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:4444/products", data).then((res) => {
      alert("Product Data Updated Successfully !!!");
      navigate("/viewproducts");
    });
  };

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
        setData({ ...data, boutique: { boutiqueID: e.target.value } });
        axios.get("http://localhost:4444/boutique/"+e.target.value)
        .then((res)=>{
            console.log(res.data);
            setData({ ...data, boutique: res.data });
            
            return res.data;
        })
        .catch((err) => console.error(err));
    }; 
  }

  return (
    <div>
      <div
        id="edit2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center "
      >
        <div className="w-50 border bg-light p-5">
          <form onSubmit={handleSubmit}>
            <h1>UPDATE PRODUCTS DATA</h1>

            <div>
              <label htmlFor="productID">Product ID :</label>
              <input
                type="text"
                disabled
                name="productID"
                role="productID"
                className="form-control"
                value={data.productID}
                onChange={(e) => setData({ ...data, productName: e.target.value })}
              />
            </div>

            <div>
            <label htmlFor="productName">Product Name :</label>
            <input
              type="text"
              name="productName"
              role="productName"
              className="form-control"
              value={data.productName}
              onChange={(e) =>
                setData({ ...data, productName: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="productType">Product Type :</label>
            <input
              type="text"
              name="productType"
              role="productType"
              className="form-control"
              value={data.productType}
              onChange={(e) =>
                setData({ ...data, productType: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="stockLeft">Stock Left :</label>
            <input
              type="text"
              name="stockLeft"
              role="stockLeft"
              className="form-control"
              value={data.stockLeft}
              onChange={(e) =>
                setData({ ...data, stockLeft: e.target.value })
              }
            />
          </div>

          <div>
            <label htmlFor="price">Price :</label>
            <input
              type="text"
              name="price"
              className="form-control"
              role="price"
              value={data.price}
              onChange={(e) =>
                setData({ ...data, price: e.target.value })
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

            <button className="btn btn-info " role="button">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default UpdateProduct;
