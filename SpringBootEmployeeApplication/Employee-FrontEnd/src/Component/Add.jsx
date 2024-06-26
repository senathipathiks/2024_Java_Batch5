import axios from "axios";
import React from "react";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import "./App2.css";

function Add() {
    const [columns, setColumns] = useState([]);
    const [records, setRecords] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:1224/payroll/all")
            .then((response) => {
                setColumns(Object.keys(response.data[0]));
                setRecords(response.data);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);

    const [employee, setEmployee] = useState({
        id: '',
        name: '',
        age: '',
        desig: '',
        dept: '',
        payroll: { pId: '', hre: '', ta: '', bp: '', pf: '', ctc: '' }
    });

    const handleSelectChange = (e) => {
        const selectedRecordId = e.target.value;
        if (selectedRecordId) {
            axios.get(`http://localhost:1224/payroll/${selectedRecordId}`)
                .then((response) => {
                    const selectedPayroll = response.data;
                    setEmployee((prevState) => ({
                        ...prevState,
                        payroll: {
                            pId: selectedPayroll.pId,
                            hre: selectedPayroll.hre,
                            ta: selectedPayroll.ta,
                            bp: selectedPayroll.bp,
                            pf: selectedPayroll.pf,
                            ctc: selectedPayroll.ctc
                        }
                    }));
                })
                .catch((err) => {
                    console.log(err);
                });
        }
    };

    const navigate = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault();
        let result = validateValues(employee);
        if (result === true) {
            axios.post("http://localhost:1224/employee", employee)
                .then((res) => {
                    alert("Data added Successfully");
                    navigate("/");
                })
                .catch((err) => console.log(err));
        } else {
            alert("Please Enter the Valid Inputs!!!");
        }
    };

    const validateValues = (employee) => {
        if (employee.name.length === 0) {
            alert("Please enter Student Name !!! ");
            return false;
        } else if (employee.age <= 18) {
            alert("Above 18 allowed !!!");
            return false;
        } else if (employee.desig.length === 0) {
            alert("Please enter designation !!!");
            return false;
        } else if (employee.dept.length === 0) {
            alert("Please Enter the Department!!!");
            return false;
        } else {
            return true;
        }
    };

    return (
        <div className='bod'>
            <div className="wrapper flexCenter paddings innerWidth">
                <div id="add2" className="d-flex w-100 vh-100 justify-content-center align-items-center">
                    <div className="w-50 border bg-light">
                        <form onSubmit={handleSubmit} className="formcolor">
                            <label><h3 className="text-center">ADD EMPLOYEE DATA</h3></label>
                            <div>
                                <label htmlFor="name">Name</label>
                                <input type="text" name="name" className="form-control"
                                    onChange={(e) => setEmployee({ ...employee, name: e.target.value })} />
                            </div>
                            <div>
                                <label htmlFor="age">Age :</label>
                                <input type="number" name="age" className="form-control"
                                    onChange={(e) => setEmployee({ ...employee, age: e.target.value })} />
                            </div>
                            <div>
                                <label htmlFor="desig">Desig :</label>
                                <input type="text" name="desig" className="form-control"
                                    onChange={(e) => setEmployee({ ...employee, desig: e.target.value })} />
                            </div>
                            <div>
                                <label htmlFor="dept">Dept :</label>
                                <input type="text" name="dept" className="form-control"
                                    onChange={(e) => setEmployee({ ...employee, dept: e.target.value })} />
                            </div>
                            <br />
                            <div>
                                <label>Select Payroll Record:</label>
                                <select onChange={handleSelectChange} className="form-control" name="pId">
                                    <option value="" name="pId" selected="selected">Select a record</option>
                                    {records.map((record) => (
                                        <option key={record.pId} value={record.pId}>{record.pId}</option>
                                    ))}
                                </select>
                            </div>
                            <button className="btn btn-info flexCenter button mt-3 ml-6">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Add;