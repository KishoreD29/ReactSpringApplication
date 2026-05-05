import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import {BrowserRouter,Routes,Route} from "react-router-dom"
import Login from './pages/Login'
import Doctor from './pages/Doctor/Doctor'
import Patient from './pages/Patient/Patient'
import DoctorDashboard from './pages/Patient/DoctorDetails'
import Header from './components/Header'
import Footer from './components/Footer'

import './App.css'
import DocotorDetails from './pages/Patient/DoctorDetails'

function App() {
  

  return (
    <div>
      <Header/>
      <BrowserRouter>
      <Routes>
        
        <Route path="/" element={<Login/>}/>
        <Route path="/patient" element={<Patient/>}/>
        <Route path="/doctor" element={<Doctor/>}/>
        <Route path="/doctordetails" element={<DocotorDetails/>}/>

      </Routes>
      </BrowserRouter>
      <Footer/>

    </div>
  )
}

export default App
