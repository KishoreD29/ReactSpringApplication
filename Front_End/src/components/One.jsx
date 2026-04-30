import react from 'react'
import {useState} from 'react'


const One=()=>{
    const [state,setState]=react.useState(0)
    function Hello(props){
        return <p>Hello, World!{props.name}</p>
    }
     
    
    return(
        <div>
            <h1>One</h1>
            <p>Count: {state}</p>
            <button onClick={()=> setState(state+1)}>Increment</button>
            <Hello name="Kishore"/> 
            
        </div>
    )
}
export default One