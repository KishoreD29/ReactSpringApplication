import React,{useState} from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import "./SignUp.css";

function SignUp(){
    const [name,setName]=React.useState("");
    const [email,setEmail]=React.useState("");
    const [password,setPassword]=React.useState("");
    const [error,setError]=React.useState("");
    const [role,setRole]=React.useState("Doctor");
    const Navigate=useNavigate();
    const onSubmit= async()=>{
        try{
            console.log({name,email,password,role});
            const res=await axios.post('http://localhost:5000/signup',{name,email,password,role});
            console.log(res);
            Navigate("/");
        }
        catch(error){
            console.log("Error response",error.response?.data);
            setError(error.response?.data || {});

        }


    }
    return(
        <div >
            <h1>Sign UP</h1>

            <div className='form'>
                <label>Name</label>
                <input value={name} onChange={e=>setName(e.target.value)}/>
                {error.name && <p className="error-text">{error.name}</p>}

                <label>Email</label>
                <input value={email} onChange={e=>setEmail(e.target.value)}/>
                {error.email && <p className="error-text"> {error.email}</p>}

                <label>Password</label>
                <input value={password} onChange={e=>setPassword(e.target.value)}/>
                {error.password && <p className="error-text"> {error.password}</p>}
                <label>Role</label>
                <select onChange={e=>setRole(e.target.value)}>
                    <option value={"Doctor"}>
                        Doctor

                    </option>
                    <option value={"Patient"}>
                        Patient

                    </option>
                </select>
                

                <button onClick={onSubmit}>Submit</button>
            </div>



        </div>
    )
}
export default SignUp;