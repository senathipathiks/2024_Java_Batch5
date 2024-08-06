import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

function AddCourse() {
    // const [records, setRecords] = useState([]);

    const [inputData, setInputData] = useState({
        cname: "",
        cdur: "",
        cost: ""
    });

    const naviget = useNavigate();

    let handleSubmit = (e) => {
        e.preventDefault();
        let result = validateValues(inputData);
        // setSubmitting(true);

        if (result === true) {
            axios
                .post("http://localhost:3333/course", inputData)
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

        if (inputData.cname === 0) {
            alert("Please enter Employee Name !!! ");
            return false;
        } else if (inputData.cdur === "") {
            alert("please enter Department !!!");
            return false;
        } else if (inputData.cost === "") {
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
                    <h1>Add New Course </h1>
                    <div>
                        <label htmlFor="uname">Course Name</label>
                        <input type="text" name="uname" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, cname: e.target.value })
                            }
                            placeholder='Enter Course Name' required
                        />
                    </div>
                    <div>
                        <label htmlFor="duration">Duration :</label>
                        <input type="text" name="duration" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, cdur: e.target.value })
                            }
                            placeholder='Enter Course Duration' required
                        />
                    </div>

                    <div>
                        <lable htmlFor="cost">Cost :</lable>
                        <input type="text" name="cost" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, cost: e.target.value })
                            }
                            placeholder='Enter Course Cost' required
                        />
                    </div>
                    <br />
                    <br />
                    <div className="text-center">
                        <button className="btn btn-info text-center ">Add</button>
                    </div>
                </form>

            </div>
        </div>
    )
}

export default AddCourse
