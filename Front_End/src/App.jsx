import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import {BrowserRouter,Routes,Route} from "react-router-dom"
import Login from './pages/Login'
import SignUp from './pages/SignUp'
import Doctor from './pages/Doctor/Doctor'
import Patient from './pages/Patient/Patient'
import DoctorDashboard from './pages/Patient/DoctorDetails'
import AiSuggestion from './pages/Patient/AiSuggestion'
import Header from './components/Header'
import Footer from './components/Footer'


import './App.css'
import DocotorDetails from './pages/Patient/DoctorDetails'


function App() {
  

  return (
    <div>
      
      <BrowserRouter>
      <Header/>
      <Routes>
        
        <Route path="/" element={<Login/>}/>
        <Route path="/signup" element={<SignUp/>}/>
        <Route path="/patient" element={<Patient/>}/>
        <Route path="/doctor" element={<Doctor/>}/>
        <Route path="/doctordetails" element={<DocotorDetails/>}/>
        <Route path="/askai" element={<AiSuggestion/>}/>

      </Routes>
      <Footer/>
      </BrowserRouter>
      

    </div>
  )
}

export default App
