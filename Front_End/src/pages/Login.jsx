import React,{useState} from "react";
import axios from "axios";
import {useNavigate,Link} from "react-router-dom";
import './Login.css'

function Login(){
    
    const [email,setEmail]=React.useState("");
    const [password,setPassword]=React.useState("");

    const navigate=useNavigate();

    const onSubmit = async (e)=>{
        e.preventDefault();
        const res=await axios.post("http://localhost:5000/login",{email,password});
        console.log("HI");
        console.log(res);

        const data= res.data;
        const token=data.token;
        localStorage.setItem("token",token);
        if (data.role=="Doctor"){
            navigate("/Doctor",{state:data});
        }
        
        else if(data.role=="Patient"){
            navigate("/Patient");
        }
        console.log("submitted",res.data);

    }
    const onClick=()=>{
        navigate("/signup")
    }

    return(

        <div>
            <h1>React+sping project </h1>
            <p>Login Page</p>

            <form onSubmit={onSubmit} className="container">
                
                <div className="field">
                <label>Email:</label>
                
                <input className="input" value={email} onChange={e=>setEmail(e.target.value)}/>
                </div>
                <div className="field">
                <label>Password:</label>
                
                <input className="input" value={password} onChange={e=>setPassword(e.target.value)}/>
                </div>

                
                <button type="submit">Submit</button>

                <Link to="/signup">Sign Up</Link>
            </form>

        </div>
    );



}
export default Login;

