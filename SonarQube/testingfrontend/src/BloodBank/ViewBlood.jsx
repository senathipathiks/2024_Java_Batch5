import React from 'react'
import axios from "axios";
import { Link, useNavigate, useParams } from "react-router-dom";
import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import { useEffect, useState } from "react";

function ViewBlood() {
    const [records, setRecords] = useState([]);
    const navigate = useNavigate();
    const [search, setSearchData] = useState('');
  
    useEffect(() => { 
      axios
        .get("http://localhost:8080/bloodBank/all")
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
          .delete("http://localhost:8080/bloodBank/" + rid)
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
                Blood Bank Management System
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
                <Link to={"/addBlood"} className="btn btn-primary text-end">Add +</Link>
              </div>
              <br />
              <table className="table table-bordered  table-striped w-100 border table-success shadow px-5 pb-5 rounded ">
                <thead>
                  <tr>
                    {/* {columns.map((c, i) => (
                      <th key={i}>{c}</th>
                    ))} */}
                    <th>Blood ID</th>
                    <th>Blood Group</th>
                    <th>Status</th>
                    <th>Actions</th>
                  </tr>
                </thead>
      
                <tbody>
                  {records.filter((d) => {
                    return search.toLowerCase() === '' ? d : d.Name.toLowerCase().includes(search)
                  }).map((d, i) => (
                    <tr key={i}>
                      <td>{d.id}</td>
                      <td>{d.bloodGroup}</td>
                      <td>{d.status}</td>
                      <td>
                        <Link
                          to={`/updateBlood/${d.id}`}
                          className="btn btn-sm btn-success "
                        >
                          Update
                        </Link>
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

export default ViewBlood
