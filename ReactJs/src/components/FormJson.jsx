import React,{useState} from 'react';

function FormJson() {
    const list_hobbies = [
        "swimming",
        "cricket",
        "football",
        "hockey",
        "tennis",
        "squash",
        "golf",
        "archery"
      ];

  const [enteredUsername, setEnteredUsername] = useState("");
  const [enteredAge, setEnteredAge] = useState("");
  const [enteredHobbies, setSelectedHobby] = useState("archery");

  const usernameChangeHandler = (event) => {
    setEnteredUsername(event.target.value);
  };
  const ageChangeHandler = (event) => {
    setEnteredAge(event.target.value);
  };
  const hobbiesChangeHandler = (event) => {
    setSelectedHobby(event.target.value);
  };

  // form submission
  const submitHandler = (event) => {
    event.preventDefault();
    // entered details user object
    const user = {
      username: enteredUsername,
      age: enteredAge,
      hobby: enteredHobbies
    };
   
    // fixme - remove the alert with proper implementation
    alert(JSON.stringify(user));
  };


  return (
    <div>
      <form onSubmit={submitHandler}>
        <label htmlFor='username'>UserName</label>
        <input
            id="username"
            type="text"
            value={enteredUsername}
            onChange={usernameChangeHandler}
        >
        </input>
        <br />

        <label htmlFor='age'>Age</label>
        <input 
            id="age"
            type="text"
            value={enteredAge}
            onChange={ageChangeHandler}
        >
        </input>
        <br />

        <label htmlFor='hobbies'>Hobbies</label>
        <select
            id="hobbies"
            value={enteredHobbies}
            onChange={hobbiesChangeHandler}
        >
            {list_hobbies.map((item, idx) => (
            <option key={idx} value={item}>
              {item}
            </option>
          ))}
            

        </select>

        <br />

        <button type="submit" >Add User</button>

      </form>
    </div>
  );
}

export default FormJson;
