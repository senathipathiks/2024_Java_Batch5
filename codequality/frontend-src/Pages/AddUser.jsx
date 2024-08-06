import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

function AddUser() {
    const { id } = useParams();
    const [records, setRecords] = useState([]);

    const [inputData, setInputData] = useState({
        uid: "-1",
        uname: "",
        age: "",
        qual: "",
        course: {
            cid: "",
            cname: "",
            cdur: "",
            cost: ""
        }
    });

    useEffect(() => {
        axios
            .get("http://localhost:3333/course/allCourses")
            .then((response) => {
                setRecords(response.data);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);

    const naviget = useNavigate();

    const handleSelectChange = (e) => {
        const selectedRecordId = e.target.value;
        console.log(selectedRecordId);
        // console.log(assignPayrollId(selectedRecordId));
        if (selectedRecordId) {
            axios
                .get(`http://localhost:3333/course/` + selectedRecordId)
                .then((response) => {
                    console.log(response.data);
                    setInputData({ ...inputData, course: response.data });

                })
                .catch((err) => {
                    console.log(err);
                });
        }
    };

    let handleSubmit = (e) => {
        e.preventDefault();
        let result = validateValues(inputData);
        // setSubmitting(true);

        if (result === true) {
            axios
                .post("http://localhost:3333/user", inputData)
                .then((res) => {
                    console.log(inputData);
                    alert("Data added Successfully");
                    naviget("/viewCard");
                })
                .catch((err) => console.log(err));
        } else {
            alert("Please Enter the Valid Inputs!!!");
        }
    };

    const validateValues = (inputData) => {
        console.log("hi");

        if (inputData.uname.length === 0) {
            alert("Please enter Employee Name !!! ");
            return false;
        } else if (inputData.age === "") {
            alert("please enter Department !!!");
            return false;
        } else if (inputData.qual === "") {
            alert("Please enter designation of the employee !!!");
            return false;
        } else {
            // setInputData({ ...inputData, totalsal: sum })
            return true;
        }
    };

    return (
        <div className="d-flex w-100 vh-100 justify-content-center align-items-center" id='user-add'>
            <div className="w-50 border bg-light p-5" id='add3'>
                <form onSubmit={handleSubmit}>
                    <h1>Add New User Data</h1>
                    <div>
                        <label htmlFor="uname">Name</label>
                        <input type="text" name="uname" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, uname: e.target.value })
                            }
                            placeholder='Enter your Name' required
                        />
                    </div>
                    <div>
                        <label htmlFor="age">Age :</label>
                        <input type="text" name="age" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, age: e.target.value })
                            }
                            placeholder='Enter your Age' required
                        />
                    </div>

                    <div>
                        <lable htmlFor="qual">Qualification :</lable>
                        <input type="text" name="qual" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, qual: e.target.value })
                            }
                            placeholder='Enter your Qualification' required
                        />
                    </div>

                    <div className="text-center">
                        <div className='d-flex justify-content-evenly'>
                            <label>
                                Course Id:
                            </label>
                            <select name="selectedId" onChange={handleSelectChange}>
                                <option value="" selected>select id </option>
                                {records.map((d, i) => (
                                    <option key={i} value={d.cid}>{d.cid}</option>
                                ))}
                            </select>
                        </div>

                        <br />
                        <button className="btn btn-info text-center ">Add</button>
                    </div>
                </form>

            </div>
        </div>
    )
}

export default AddUser
