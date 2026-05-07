import React,{useState} from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import "./SignUp.css";

function SignUp(){
    const [name,setName]=React.useState("");
    const [email,setEmail]=React.useState("");
    const [password,setPassword]=React.useState("");

    const onSubmit= async()=>{
        
        const res=axios.post('http://localhost:5000/signup',{name,email,password});


    }
    return(
        <div >
            <h1>Sign UP</h1>

            <div className='form'>
                <label>Name</label>
                <input value={name} onChange={e=>setName(e.target.value)}/>

                <label>Email</label>
                <input value={email} onChange={e=>setEmail(e.target.value)}/>

                <label>Password</label>
                <input value={password} onChange={e=>setPassword(e.target.value)}/>

                <button onClick={onSubmit}>Submit</button>
            </div>



        </div>
    )
}
export default SignUp;