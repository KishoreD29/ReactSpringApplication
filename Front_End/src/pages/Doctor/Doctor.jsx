import React,{useState} from 'react'
import {useLocation} from 'react-router-dom'
import axios from 'axios'
import './Doctor.css'
function Doctor(){
    
    const [available,setAvailable]=React.useState(false);
    const location=useLocation();
    const data=location.state;
    const toogleActivity= async()=>{
        ( setAvailable(!available))
        const res= await axios.put("http://localhost/5000/Doctor/{data.id}",{available});
    }
    
    

    return(

        <div>

            <h1 className='header'>Doctor DashBoard</h1>
            <p>HI Doctor ! {data.name}</p>
            
            <button onClick={toogleActivity} className={available ? "available" : "not-available"}> 
                {available ?"Available":"Notavaialable"}
            </button>

        </div>
    )
}
export default Doctor;
