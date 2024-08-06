import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import "./App2.css";

function Edit() {
  const { id } = useParams();
  const [data, setData] = useState([]);
  const navigate = useNavigate();
  useEffect(() => {
    axios
      .get("http://localhost:2222/meetroom/" + id)
      .then((response) => setData(response.data))
      .catch((err) => console.log(err));
  }, []);

  let handleSubmit = (e) => {
    e.preventDefault();
    axios.put("http://localhost:2222/meetroom", data).then((res) => {
      alert("User Updated Successfully");
      navigate("/viewmeetroom");
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
            <h1>UPDATE MEETING ROOM DATA</h1>
            <div>
              <label htmlFor="bookingID">bookingID :</label>
              <input
                type="text"
                disabled
                name="bookingID"
                className="form-control"
                value={data.bookingID}
                onChange={(e) => setData({ ...data, bookingID: e.target.value })}
              />
            </div>
            <div>
              <label htmlFor="roomNo">Room Number :</label>
              <input
                type="text"
                name="roomNo"
                className="form-control"
                value={data.roomNo}
                onChange={(e) => setData({ ...data, roomNo: e.target.value })}
              />
            </div>
            <div>
              <label htmlFor="teamName">Team Name :</label>
              <input
                type="text"
                name="teamName"
                className="form-control"
                value={data.teamName}
                onChange={(e) => setData({ ...data, teamName: e.target.value })}
              />
            </div>
            <div>
              <label htmlFor="startTime">Start Time :</label>
              <input
                type="text"
                name="startTime"
                className="form-control"
                value={data.startTime}
                onChange={(e) => setData({ ...data, startTime: e.target.value })}
              />
            </div>

            <div>
              <label htmlFor="endTime">End Time :</label>
              <input
                type="text"
                name="endTime"
                className="form-control"
                value={data.endTime}
                onChange={(e) => setData({ ...data, endTime: e.target.value })}
              />
            </div>
            <br/>

            <button className="btn btn-info ">Update</button>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Edit;
