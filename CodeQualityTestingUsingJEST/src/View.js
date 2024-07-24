import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./App2.css";
import { Container, Row, Col, Form, Button } from "react-bootstrap";


function View() {
  const [columns, setColumns] = useState([]);
  const [records, setRecords] = useState([]);
  const navigate = useNavigate();
  const [find,setFind] = useState('');
  useEffect(() => { 
    axios
      .get("http://localhost:1000/bill/all")
      .then((response) => {
        setColumns(Object.keys(response.data[0]));
        setRecords(response.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  let handleSubmit = (id) => {
    const conf = window.confirm("Do you want to delete");
    if (conf) {
      axios
      
        .delete("http://localhost:1000/bill/" + id)
        .then((res) => {
          alert("record has deleted");
          navigate("/");
          window.location.reload();
        })
        .catch((err) => console.log(err));
    }
    
  };

  return (
      <Container className="py-4">
        <Row>
          <Col xs={12}>
            <h1 className="text-center mb-4">Bill Records</h1>
          </Col>
          <Col xs={12}>
            <Form className="mb-3">
              <Form.Control
                type="text"
                placeholder="Search by Customer Name..."
                value={find}
                onChange={(e) => {} /* Implement your search logic here */}
              />
            </Form>
          </Col>
          <Col xs={12}>
            <div className="table-responsive">
              <table className="table table-bordered table-striped table-dark shadow rounded">
                <thead>
                  <tr>
                    <th>Bill ID</th>
                    <th>EB Type</th>
                    <th>Contact Detail</th>
                    <th>Branch</th>
                    <th>Due Date</th>
                    <th>Consumed Units</th>
                    <th>Price Per Unit</th>
                    <th>Bill Amount</th>
                    <th>Customer ID</th>
                    <th>Customer Name</th>
                    <th>Action</th>
                  </tr>
                </thead>
                <tbody>
                  {records
                    .filter((item) =>
                      find.toLowerCase() === ""
                        ? true
                        : item.customer.uname
                            .toLowerCase()
                            .includes(find.toLowerCase())
                    )
                    .map((d, i) => (
                      <tr key={i}>
                        <td>{d.id}</td>
                        <td>{d.type}</td>
                        <td>{d.mobile}</td>
                        <td>{d.city}</td>
                        <td>{d.date}</td>
                        <td>{d.nos}</td>
                        <td>{d.price}</td>
                        <td>{d.totalBill}</td>
                        <td>{d.customer.cid}</td>
                        <td>{d.customer.uname}</td>
                        <td>
                          <Link
                            id="butt1"
                            to={`/update/${d.id}`}
                            className="btn btn-sm btn-outline-secondary me-2"
                          >
                            Update
                          </Link>
                          <button
                            id="butt2"
                            onClick={(e) => handleSubmit(d.id)}
                            className="btn btn-sm btn-danger"
                          >
                            Delete
                          </button>
                        </td>
                      </tr>
                    ))}
                </tbody>
              </table>
            </div>
          </Col>
        </Row>
      </Container>
  );
}

export default View;
