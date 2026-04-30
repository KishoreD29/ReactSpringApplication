import React,{useState} from "react";
import axios from "axios";
import './Four.css'

function Four(){
    const [name,setName]=React.useState("");
    const [email,setEmail]=React.useState("");

    const onSubmit = async (e)=>{
        e.preventDefault();
        const res=await axios.post("http://localhost:5000/user",{name,email});
        console.log("submitted",res.data);

    }

    return(

        <div>
            <h1>React+sping project </h1>
            <p>Login Page</p>
            <form onSubmit={onSubmit} className="container">
                <label>Name:</label>
                <div className="field">
                <input className="input" value={name} onChange={e=>setName(e.target.value)}/>
                </div>
                <label>Email:</label>
                <div className="field">
                <input className="input" value={email} onChange={e=>setEmail(e.target.value)}/>
                </div>
                <button type="submit">Submit</button>
            </form>

        </div>
    );



}
export default Four;

