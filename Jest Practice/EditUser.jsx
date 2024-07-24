import React, { useState, useEffect } from "react";
import axios from "axios";
import { Link, useNavigate, useParams } from "react-router-dom";
import "./EditUser.css";

function EditUser() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const [employee, setEmployee] = useState({
    userID:"",
    username: "",
    city: "",
    email: "",
    age:""
  });

  useEffect(() => {
    axios
     .get(`http://localhost:7727/mem/${id}`)
     .then((response) => {
        setEmployee(response.data);
      })
     .catch((err) => {
        console.log(err);
      });
  }, [id]);

  const handleSubmit = (event) => {
    event.preventDefault();
    axios
     .put(`http://localhost:7727/mem/${id}`, employee)
     .then((res) => {
        alert("Record has been updated");
        window.location.href="/ViewUser";
      })
     .catch((err) => console.log(err));
  };

  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setEmployee({...employee, [name]: value });
  };

  return (
    <div className="edit-user-container">
    
      <div
        id="edit-job-form"
        className="d-flex w-100 vh-100 justify-content-center align-items-center "
        style={{ fontSize: "15px" }}
      >
        <div className="w-50 border bg-light p-5">
          <form onSubmit={handleSubmit}>
            <h1 id="h1" title="headingMember">Gym Center System</h1>
            <div className="form-group ">
              <label> ID:</label>
              <input
                type="number"
                name="userID"
                value={employee.userID}
                onChange={handleInputChange}
                role="mId"
                className="form-control"
                readOnly
              />
            </div>
            <div className="form-group">
              <label>username:</label>
              <input
                type="text"
                name="username"
                value={employee.username}
                onChange={handleInputChange}
                role="Membername"
                className="form-control"
              />
            </div>
           
            <div className="form-group">
              <label>city:</label>
              <input
                type="text"
                name="city"
                value={employee.city}
                onChange={handleInputChange}
                role="mcity"
                className="form-control"
              />
            </div>
           
            <div className="form-group">
              <label>email:</label>
              <input
                type="email"
                name="email"
                value={employee.email}
                onChange={handleInputChange}
                role="eMail"
                className="form-control"
              />
            </div>
            
            <div className="form-group">
              <label>age:</label>
              <input
                type="number"
                name="age"
                value={employee.age}
                onChange={handleInputChange}
                className="form-control"
                role="Age"
              />
            </div>
            
            <button type="submit" className="btn btn-info" name="updating">
              Update
            </button><br/>
            <Link to="/ViewUser" className="btn btn-secondary " id="cancel">
              Cancel
            </Link>
          </form>
        </div>
      </div>            
    </div>
  );
}

export default EditUser;