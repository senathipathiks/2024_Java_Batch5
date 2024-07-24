import React from 'react';

const styles = {
    container: {
        maxWidth: '400px',
        margin: '0 auto',
        padding: '20px',
        border: '1px solid #ccc',
        borderRadius: '8px',
        boxShadow: '0 4px 10px rgba(0, 0, 0, 0.1)',
        backgroundColor: '#f9f9f9',
    },
    title: {
        textAlign: 'center',
        marginBottom: '20px',
        color: '#333',
    },
    form: {
        display: 'flex',
        flexDirection: 'column',
    },
    formGroup: {
        marginBottom: '15px',
    },
    label: {
        marginBottom: '5px',
        fontWeight: 'bold',
        color: '#555',
    },
    input: {
        padding: '10px',
        border: '1px solid #ccc',
        borderRadius: '4px',
        fontSize: '16px',
    },
    inputFocus: {
        borderColor: '#007bff',
        outline: 'none',
    },
    button: {
        padding: '10px',
        border: 'none',
        borderRadius: '4px',
        backgroundColor: '#007bff',
        color: 'white',
        fontSize: '16px',
        cursor: 'pointer',
        transition: 'background-color 0.3s',
    },
    buttonHover: {
        backgroundColor: '#0056b3',
    },
};

function Login() {
    return (
        <div style={styles.container}>
            <h2 style={styles.title}>Login</h2>
            <form style={styles.form}>
                <div style={styles.formGroup} role='unamelabel'>
                    <label htmlFor="uname" style={styles.label}>Username</label>
                    <input 
                        id="uname" 
                        type="text" 
                        style={styles.input} 
                        placeholder="Enter your username" 
                        role='username'
                        required 
                    />
                </div>
                <div style={styles.formGroup}>
                    <label htmlFor="pwd" style={styles.label} role='pwdlabel'>Password</label>
                    <input 
                        id="pwd" 
                        type="password" 
                        style={styles.input} 
                        placeholder="Enter your password" 
                        role='pwd'
                        required 
                    />
                </div>
                <button 
                    type="submit" role='login'
                    style={styles.button}
                    onMouseOver={e => e.currentTarget.style.backgroundColor = styles.buttonHover.backgroundColor}
                    onMouseOut={e => e.currentTarget.style.backgroundColor = styles.button.backgroundColor}
                >
                    Login
                </button>
            </form>
        </div>
    );
}

export default Login;