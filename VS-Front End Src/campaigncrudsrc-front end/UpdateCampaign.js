import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function UpdateCampaign() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:7010/campaign/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:7010/campaign", data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewcampaign");
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
            <h1>UPDATE CAMPAIGN DATA</h1>

            <div>
              <lable htmlFor="id">ID :</lable>
              <input
                type="text"
                disabled
                name="id"
                className="form-control"
                value={data.id}
                onChange={(e) => setData({ ...data, campaignName: e.target.value })}
              />
            </div>

            <div>
            <lable htmlFor="campaignname">Campaign Name :</lable>
            <input
              type="text"
              name="campaignname"
              className="form-control"
              value={data.campaignName}
              onChange={(e) =>
                setData({ ...data, campaignName: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="venuelocation">Venue Location :</lable>
            <input
              type="text"
              name="venuelocation"
              className="form-control"
              value={data.venueLocation}
              onChange={(e) =>
                setData({ ...data, venueLocation: e.target.value })
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
            <lable htmlFor="starttime">Start Time :</lable>
            <input
              type="text"
              name="starttime"
              className="form-control"
              value={data.startTime}
              onChange={(e) =>
                setData({ ...data, startTime: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="endtime">End Time :</lable>
            <input
              type="text"
              name="endtime"
              className="form-control"
              value={data.endTime}
              onChange={(e) =>
                setData({ ...data, endTime: e.target.value })
              }
            />
          </div>

          <div>
            <lable htmlFor="email">Email :</lable>
            <input
              type="email"
              name="email"
              className="form-control"
              value={data.email}
              onChange={(e) =>
                setData({ ...data, email: e.target.value })
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

export default UpdateCampaign;
