import React from 'react'
import axios from "axios";
import { Link, useNavigate, useParams } from "react-router-dom";
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import { useEffect, useState } from "react";

function ViewRequest() {

    const {id} = useParams();
    const [records, setRecords] = useState([]);
    const navigate = useNavigate();
    const [search, setSearchData] = useState('');
  
    useEffect(() => { 
      axios
        .get("http://localhost:8080/request/all")
        .then((response) => {
          setRecords(response.data);
        })
        .catch((err) => {
          console.log(err);
        });
    }, []);
  
    let handleSubmit = (rid) => {
      const conf = window.confirm("Do you want to delete");
      if (conf) {
        axios
          .delete("http://localhost:8080/request/" + rid)
          .then((res) => {
            alert("record has deleted");
            navigate("/viewRequests");
            window.location.reload();
          })
          .catch((err) => console.log(err));
      }
    };
    
    const handleChange = (e) => {
      setSearchData(e.target.value);
    }

  return (
    <div id="body">
        <div className="container ">
          <h1 id="app2" className="text-center text-bg-success ">
            Blood Request Management System
          </h1>
  
          <div className="text-end d-flex justify-content-between">
            <Form inline>
              <Row>
                <Col xs="auto">
                  <Form.Control
                    type="text"
                    placeholder="Search by Name"
                    className=" mr-sm-2"
                    onChange={handleChange}
                  />
                </Col>
              </Row>
            </Form>
            <Link to={"/addRequest"} className="btn btn-primary text-end">Add +</Link>
          </div>
          <br />
          <table className="table table-bordered  table-striped w-100 border table-success shadow px-5 pb-5 rounded ">
            <thead>
              <tr>
                {/* {columns.map((c, i) => (
                  <th key={i}>{c}</th>
                ))} */}
                <th>Request ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Number</th>
                <th>Gender</th>
                <th>Blood Group</th>
                <th>Actions</th>
              </tr>
            </thead>
  
            <tbody>
              {records.filter((d) => {
                return search.toLowerCase() === '' ? d : d.Name.toLowerCase().includes(search)
              }).map((d, i) => (
                <tr key={i}>
                  <td>{d.id}</td>
                  <td>{d.name}</td>
                  <td>{d.age}</td>
                  <td>{d.number}</td>
                  <td>{d.gender}</td>
                  <td>{d.blood}</td>
                  <td>
                    {/* <Link
                      to={`/updateAttendee/${d.id}`}
                      className="btn btn-sm btn-success "
                    >
                      Update
                    </Link> */}
                    <button
                      onClick={(e) => handleSubmit(d.id)}
                      className="btn btn-sm ms-1 btn-danger"
                    >
                      Delete
                    </button>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
  )
}

export default ViewRequest
