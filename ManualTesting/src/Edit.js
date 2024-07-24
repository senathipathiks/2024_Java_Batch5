import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
// import "./App2.css";

function Edit() {
  const { uid } = useParams();
  const [data, setData] = useState([]);
  const [datas, setDatas] = useState([]);
  const [pid, setPid] = useState([]);
  const [inputData,setInputdata]=useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:1000/user/" + uid)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  useEffect(() => {
    axios
      .get("http://localhost:1000/match/all")
      .then((response) => setDatas(response.data))
      .catch((err) => console.log(err));
  }, []);
  
  
  const handleChange = (e) => {
    setPid(e.target.value);
    axios
      .get("http://localhost:1000/match/" + e.target.value)
      .then((response) => {
        setData((data) => ({
          ...data,
          matchmaker: response.data
        }));
        console.log(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
};

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:1000/user/"+data.uid , data).then((res) => {
      alert(" Updated Successfully");
      navigate("/landing");
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
            <h1 data-testid="heading">UPDATE USER  DETAILS</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="id"
                className="form-control"
                value={data.uid}
              />
            </div>

            {/* <div>
              <lable htmlFor="name">Name :</lable>
              <input
                type="text"
                name="name"
                className="form-control"
                value={data.name}
                onChange={(e) => setData({ ...data, name: e.target.value })}
              />
            </div> */}
            <div>
            <lable htmlFor="uname"> Name</lable>
            <input
              type="text"
              name="uname"
              role="name"
              value={data.uname}
              className="form-control"
              onChange={(e) =>
                setData({ ...data, uname: e.target.value })
              }
            />
          </div>
          <div>
            <lable htmlFor="actype">Account Type :</lable>
            <input
              type="text"
              name="actype"
role="type"
              className="form-control"
              value={data.actype}
              onChange={(e) =>
                setData({ ...data, actype: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="addr">Address/City  :</lable>
            <input
              type="text"
              name="addr"
              role="addr"
              value={data.addr}
              className="form-control"
              onChange={(e) =>
                setData({ ...data, addr: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="age">Age :</lable>
            <input
            role="age"
              type="number"
              name="age"
              value={data.age}
              className="form-control"
              onChange={(e) =>
                setData({ ...data, age: e.target.value })
              }
            />
          </div>


          <div>
            <lable htmlFor="sal">Salary :</lable>
            <input
            role="sal"
              type="number"
              name="sal"
              className="form-control"
              value={data.sal}
              onChange={(e) =>
                setData({ ...data, sal: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="job">Profession :</lable>
            <input
              type="text"
              name="job"
              role="job"
              value={data.job}
              className="form-control"
              onChange={(e) =>
                setData({ ...data, job: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="payment">Payment :</lable>
            <input
              type="text"
              role="pay"
              name="payment"
              value={data.payment}
              className="form-control"
              onChange={(e) =>
                setData({ ...data, payment: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="religion">Religion :</lable>
            <input
              type="text"
              name="religion"
              role="religion"
              value={data.religion}
              className="form-control"
              onChange={(e) =>
                setData({ ...data, religion: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="sts">Marital Status :</lable>
            <input
              type="text"
              name="sts"
              role="sts"
              value={data.sts}
              className="form-control"
              onChange={(e) =>
                setData({ ...data, sts: e.target.value })
              }
            />
          </div>




            <div>
        <label htmlFor="selectId">Select Match Maker  ID:</label>
        <select id="selectId" onChange={handleChange}>
          <option value="" data-testid="opt">Select an ID</option>
          {datas.map((item) => (
            <option key={item.mid} value={item.mid}>
              {item.mid} 
            </option>
          ))}
        </select>
        
      </div>
           

            <br />

            <button className="btn btn-info " role="submitbutton" id="submit">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Edit;
