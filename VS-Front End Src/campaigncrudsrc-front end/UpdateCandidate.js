import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function UpdateCandidate() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:7010/candidate/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:7010/candidate/" + id, data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewcandidate");
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
            <h1>UPDATE CANDIDATE DATA'S</h1>
            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="id"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, candidateName: e.target.value })}
              />
            </div>

            <div>
                <lable htmlFor="candidatename">Candidate Name :</lable>
                <input
                type="text"
                name="candidatename"
                className="form-control"
                value={data.candidateName}
                onChange={(e) =>
                    setData({ ...data, candidateName: e.target.value })
                }
                />
            </div>

            <div>
                <lable htmlFor="age">Age :</lable>
                <input
                type="text"
                name="age"
                className="form-control"
                value={data.Age}
                onChange={(e) =>
                    setData({ ...data, Age: e.target.value })
                }
                />
            </div>
            

            <div>
                <lable htmlFor="gender">Gender :</lable>
                <input
                type="text"
                name="gender"
                className="form-control"
                value={data.Gender}
                onChange={(e) =>
                    setData({ ...data, Gender: e.target.value })
                }
                />
            </div>

            <div>
                <lable htmlFor="email">Email :</lable>
                <input
                type="email"
                name="email"
                className="form-control"
                value={data.Email}
                onChange={(e) =>
                    setData({ ...data, Email: e.target.value })
                }
                />
            </div>

            <div>
                <lable htmlFor="partyname">Party Name :</lable>
                <input
                type="text"
                name="partyname"
                className="form-control"
                value={data.partyName}
                onChange={(e) =>
                    setData({ ...data, partyName: e.target.value })
                }
                />
            </div>

            <br />

            <button className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default UpdateCandidate;
