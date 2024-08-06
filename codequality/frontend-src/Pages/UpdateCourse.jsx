import axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function UpdateCourse() {

    const { id } = useParams();
    const [inputData, setInputData] = useState({
        cname: "",
        cdur: "",
        cost: ""
    });

    useEffect(() => {
        axios
            .get("http://localhost:3333/course/" + id)
            .then((response) => setInputData(response.data))
            .catch((err) => console.log(err));
    }, []);

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
                    naviget("/viewCourse");
                })
                .catch((err) => console.log(err));
        } else {
            alert("Please Enter the Valid Inputs!!!");
        }
    };

    const validateValues = (inputData) => {
        console.log("hi");

        if (inputData.cname === 0) {
            alert("Please enter Course Name !!! ");
            return false;
        } else if (inputData.cdur === "") {
            alert("please enter Course Duration !!!");
            return false;
        } else if (inputData.cost === "") {
            alert("Please enter Cost !!!");
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
                    <h1>Update Course Data</h1>
                    <div>
                        <label htmlFor="uname">Course Name</label>
                        <input type="text" name="uname" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, cname: e.target.value })
                            }
                            placeholder='Enter Course Name' required
                            value={inputData.cname}
                        />
                    </div>
                    <div>
                        <label htmlFor="age">Duration :</label>
                        <input type="text" name="age" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, cdur: e.target.value })
                            }
                            placeholder='Enter Course Duration' required value={inputData.cdur}
                        />
                    </div>

                    <div>
                        <lable htmlFor="qual">Cost :</lable>
                        <input type="text" name="qual" className="form-control"
                            onChange={(e) =>
                                setInputData({ ...inputData, cost: e.target.value })
                            }
                            placeholder='Enter Course Cost' required value={inputData.cost}
                        />
                    </div>
                    <br />
                    <br />
                    <div className="text-center">
                        <button className="btn btn-success text-center ">Update</button>
                    </div>
                </form>

            </div>
        </div>
    )
}

export default UpdateCourse
