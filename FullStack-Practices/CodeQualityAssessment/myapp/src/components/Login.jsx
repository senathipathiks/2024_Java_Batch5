import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";

function Login() {
  const navigate = useNavigate();
  const [inputData, setInputData] = useState({
    name: "",
    password: ""
  });

  const [registeredUsers, setRegisteredUsers] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  useEffect(() => {
    const fetchUsers = async () => {
      setLoading(true);
      try {
        const response = await axios.get(
          "http://localhost:1010/registration/all"
        );
        setRegisteredUsers(response.data);
      } catch (err) {
        console.error("Error fetching users:", err);
        setError("Failed to fetch users. Please try again later.");
      } finally {
        setLoading(false);
      }
    };

    fetchUsers();
  }, []);

  const handleSubmit = async (e) => {
    e.preventDefault();
    const { name, password } = inputData;

    const user = registeredUsers.find(
      (user) =>
        user.name === name && user.password === password
    );

    if (user) {
      if (user.type === "employee") {
        sessionStorage.setItem("UserName", name);
        navigate("/main");
      } else if (user.type === "donator") {
        sessionStorage.setItem("UserName", name);
        navigate("/usermain");
      }
    } else {
      setError("Invalid credentials. Please try again.");
    }
  };

  return (
    <main className="w-full h-screen flex flex-col items-center justify-center px-4">
      <div className="max-w-sm w-full text-gray-600 space-y-5">
        <div className="text-center pb-8">
          <h3 className="text-gray-800 text-2xl font-bold sm:text-3xl">
            Log in to your account
          </h3>
        </div>
        <form onSubmit={handleSubmit} className="space-y-5">
          <div>
            <label className="font-medium" htmlFor="username">Username</label>
            <input
              type="text"
              required
              id="username"
              name="name"
              className="w-full mt-2 px-3 py-2 text-gray-500 bg-transparent outline-none border focus:border-indigo-600 shadow-sm rounded-lg"
              value={inputData.name}
              onChange={(e) =>
                setInputData({ ...inputData, name: e.target.value })
              }
            />
          </div>
         
          <div>
            <label className="font-medium" htmlFor="password">Password</label>
            <input
              type="password"
              required
              id="password"
              name="password"
              className="w-full mt-2 px-3 py-2 text-gray-500 bg-transparent outline-none border focus:border-indigo-600 shadow-sm rounded-lg"
              value={inputData.password}
              onChange={(e) =>
                setInputData({ ...inputData, password: e.target.value })
              }
            />
          </div>
          {error && <p className="text-red-500">{error}</p>}
          <button
            type="submit"
            className="w-full px-4 py-2 text-white font-medium bg-indigo-600 hover:bg-indigo-500 active:bg-indigo-600 rounded-lg duration-150"
            disabled={loading}
          >
            {loading ? "Logging in..." : "Login"}
          </button>
        </form>
        <button
          className="w-full flex items-center justify-center gap-x-3 py-2.5 border rounded-lg text-sm font-medium hover:bg-gray-50 duration-150 active:bg-gray-100"
          onClick={() => {
            // Implement Google login functionality if needed
          }}
        >
          <svg
            className="w-5 h-5"
            viewBox="0 0 48 48"
            fill="none"
            xmlns="http://www.w3.org/2000/svg"
          >
            {/* Add Google login SVG icon if needed */}
          </svg>
          Continue with Google
        </button>
        <p className="text-center">
          Don't have an account?{" "}
          <a
            href="/signup"
            className="font-medium text-indigo-600 hover:text-indigo-500"
          >
            Sign up
          </a>
        </p>
      </div>
      <button onClick={() => navigate(-1)}>Go Back</button>
    </main>
  );
}

export default Login;
