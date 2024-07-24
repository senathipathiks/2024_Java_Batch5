import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const [datas, setDatas] = useState([]);
  const [pid, setPid] = useState([]);
  // const [inputData,setInputdata]=useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1000/bill/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  useEffect(() => {
    axios
      .get("http://localhost:1000/customer/all")
      .then((response) => setDatas(response.data))
      .catch((err) => console.log(err));
  }, []);
  
  
  const handleChange = (e) => {
    setPid(e.target.value);
    axios
      .get("http://localhost:1000/customer/" + e.target.value)
      .then((response) => {
        setData((data) => ({
          ...data,
          customer: response.data
        }));
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
};

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1000/bill" , data).then((res) => {
      alert("Bill Updated Successfully");
      navigate("/");
    });
  };

  return (
    <div>
      <div
        id="edit2"
        className="d-flex w-100 vh-100 justify-content-center align-items-center "
      >
        <div className="w-50 border bg-light p-5">
          <form onSubmit={handleSubmit}>
            <h1>UPDATE BILL DETAILS</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="name"
                className="form-control"
                value={data.id}
              />
            </div>

            <div>
            <lable htmlFor="name">EB TYPE</lable>
            <input
              type="text"
              name="type"
              className="form-control"
              value={data.type}
              onChange={(e) =>
                setData({ ...setData, type: e.target.value })
              }
            />
          </div>
            <div>
              <lable htmlFor="mobile">Mobile :</lable>
              <input
                type="number"
                name="mobile"
                className="form-control"
                value={data.mobile}
                onChange={(e) => setData({ ...data, mobile: e.target.value })}
              />
            </div>

            <div>
              <lable htmlFor="city">Address/ City Branch :</lable>
              <input
                type="text"
                name="city"
                className="form-control"
                value={data.city}
                onChange={(e) => setData({ ...data, city: e.target.value })}
              />
            </div>


            <div>
            <lable htmlFor="desg">Bill Due Date :</lable>
            <input
              type="text"
              name="desg"
              className="form-control"
              value={data.date}
              onChange={(e) =>
                setData({ ...data, date: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="nos">Consumed Units :</lable>
            <input
              type="number"
              name="nos"
              className="form-control"
              value={data.nos}
              onChange={(e) =>
                setData({ ...data, nos: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="price">Price Per Unit :</lable>
            <input
              type="number"
              name="price"
              className="form-control"
              value={data.price}
              onChange={(e) =>
                setData({ ...data, price: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="price">Bill Amount :</lable>
            <input
              type="number"
              name="bill"
              className="form-control"
              value={parseInt(data.price)*parseInt(data.nos)}
              onChange={(e) =>
                setData({ ...data, bill:  e.target.value})
              }
            />
          </div>


            <div>
        <label htmlFor="selectId">Select Customer  ID:</label>
        <select id="selectId" onChange={handleChange}>
          <option value="" >Select an ID</option>
          {datas.map((item) => (
            <option key={item.cid} value={item.cid}>
              {item.cid} 
            </option>
          ))}
        </select>
        
      </div>
           

            <br />

            <button className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Edit;
