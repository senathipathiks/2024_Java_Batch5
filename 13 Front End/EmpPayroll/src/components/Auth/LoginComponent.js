import React, { useState } from 'react';
import { useNavigate, Link } from 'react-router-dom';
import AuthService from "./AuthService";
// import 'bootstrap/dist/css/bootstrap.min.css';
import "./login.css"

const LoginComponent = () => {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [message, setMessage] = useState('');
    const navigate = useNavigate();

    const handleLogin = async (e) => {
        e.preventDefault();
        try {
            const response = await AuthService.login({ email, password });
            if (response.data === "Login successful") {
                navigate('/');
            } else {
                setMessage('Invalid credentials');
            }
        } catch (error) {
            setMessage('Invalid credentials');
        }
    };

    return (
        <div class="body">
            <div className="container mt-5">
                <div className="row justify-content-center">
                    <div className="col-md-6">
                        <div className="cards">
                            <div className="card-header">Login Form</div>
                            <div className="card-body">
                                {message && <div className="alert alert-danger">{message}</div>}
                                <form onSubmit={handleLogin}>
                                    <div className="form-group">
                                        <label htmlFor="email" >Email</label>
                                        <input
                                            name="email"
                                            type="email"
                                            className="form-control"
                                            value={email}
                                            onChange={(e) => setEmail(e.target.value)}
                                        />
                                    </div>
                                    <div className="form-group">
                                        <label htmlFor="password" >Password</label>
                                        <input
                                            name="password"
                                            type="password"
                                            className="form-control"
                                            value={password}
                                            onChange={(e) => setPassword(e.target.value)}
                                        />
                                    </div>
                                    <div class="mb-3">
                                        <div class="form-check">
                                            <input type="checkbox" class="form-check-input" id="rememberMe" />
                                            <label class="form-check-label" for="rememberMe">Remember me</label>
                                            <a href="" class="text-decoration-none float-end">Forget Password</a>
                                        </div>

                                    </div>
                                    <center><button type="submit" className="btn btn-primary">Login</button></center><br />
                                    <div class="social-login mb-3 type--A">
                                        <h5 class="text-center mb-3">Social Login</h5>
                                        <center>  <button class="btn btn-outline-secondary  mb-3"><i class="fa-brands fa-google text-danger"></i> Sign With Google</button>
                                        <button class="btn btn-outline-secondary mb-3"><i class="fa-brands fa-facebook-f text-primary"></i> Sign With Facebook</button></center>
                                    </div>
                                </form>
                                <div className="mt-3">
                                    <span>Not registered? <Link to="/register">Register here</Link></span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default LoginComponent;
