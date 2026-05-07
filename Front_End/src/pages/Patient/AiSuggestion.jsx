import React,{useState} from 'react'
import axios from 'axios'
import './AiSuggestion.css'

function AiSuggestion() {
    const[message,Setmessage]=React.useState("")
    const[reply,Setreply]=React.useState("")
    const onSubmit= async()=>{
        const res=await axios.post('http://localhost:5000/askai',{message});
        Setreply(res.data);
    }
  return (
    
    <div className='container'>
        <h1>AI SUGGESTION</h1>
        <div className='form'>
            <p>ASK AI WRITE SYMPTOMS</p>
            <input value={message} onChange={e=>Setmessage(e.target.value)} />
            <button onClick={onSubmit}> ASK AI</button>
            <p>{reply}</p>

        </div>
    </div>


  )
}

export default AiSuggestion;