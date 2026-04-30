import React,{useState} from 'react'
import axios from 'axios'



function Three() {
  const [name,setname]=useState("");
  const [email,setEmail]=useState("");
  const Login = async ()=>{

    const res= await axios.post("http://localhost:5000/login",{name,email});
    console.log(res.data);
  }
  return (
    <div>
        
        <input name="Name" placeholder='Enter name' value={name} onChange={(e)=>setname(e.target.value)}/>
        <input name="Email" placeholder='Enter Email' value={email} onChange={(e)=>setEmail(e.target.value)}/>
        <button> Login </button>
        

    </div>
    

  )
}

export default Three
