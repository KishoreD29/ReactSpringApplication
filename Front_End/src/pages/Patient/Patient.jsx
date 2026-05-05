import React from 'react'
import {useNavigate} from  'react-router-dom'

function Patient(){
    const navigate=useNavigate();
    const onClick =()=>{
        navigate("/DoctorDetails")
        

    }
    return (
        <div>
            <h1>Patient DashBoard</h1>
            <button onClick={onClick}>check doctor</button>
            

        </div>
    )

}
export default Patient;