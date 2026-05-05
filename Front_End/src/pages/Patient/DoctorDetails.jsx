import React,{useEffect,useState} from 'react'
import axios from 'axios'
import './DoctorDetails.css'

function DocotorDetails(){
    const [doctors,setDoctors]=React.useState([]);
    
   
    useEffect(()=>{
        const get= async()=>{
            const res= await axios.get("http://localhost:5000/doctordetails");
            console.log(res);
            setDoctors(res.data);

        }
        get();
    },[]);
    
    
    

    return (
        <div>
            <h1>Doctor Dashboard</h1>
            <p>HI</p>
            <div className='Container'>
                {doctors.map((doc) => (
                    <div className='item' key={doc.id}>
                        <p>ID: {doc.doctor_id}</p>
                        <p>Name: {doc.user.name}</p>
                        <p>{console.log(doc.available)}</p>
                        <p className={doc.available ? "available" : "not-available"}>{doc.available ? "Available" : "Not Available"}</p>
                    </div>
                ))}


            </div>

        </div>
    )
}
export default DocotorDetails;