import React,{useState} from "react";
import axios from "axios";
import {useNavigate} from "react-router-dom";
import './Login.css'

function Login(){
    const [name,setName]=React.useState("");
    const [email,setEmail]=React.useState("");
    const [role,setRole]=React.useState("Doctor");

    const navigate=useNavigate();

    const onSubmit = async (e)=>{
        e.preventDefault();
        const res=await axios.post("http://localhost:5000/user",{name,email,role});
        const data= res.data;
        if (data.role=="Doctor"){
            navigate("/Doctor",{state:data});
        }
        
        else if(data.role=="Patient"){
            navigate("/Patient");
        }
        console.log("submitted",res.data);

    }

    return(

        <div>
            <h1>React+sping project </h1>
            <p>Login Page</p>

            <form onSubmit={onSubmit} className="container">
                <div className="field">
                <label>Name:</label>
                
                <input className="input" value={name} onChange={e=>setName(e.target.value)}/>
                </div>

                <div className="field">
                <label>Email:</label>
                
                <input className="input" value={email} onChange={e=>setEmail(e.target.value)}/>
                </div>
                <div className="field">
                <label>Role:</label>
                <select  placeholder=" " className="input" value={role} onChange={e=>setRole(e.target.value)}>
                <option value="Doctor">
                    Doctor
                </option>
                <option value="Patient">
                    Patient
                </option>
                </select>
                </div>
                <button type="submit">Submit</button>
            </form>

        </div>
    );



}
export default Login;

