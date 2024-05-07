'use client'
import React from "react";
import Header from "./components/header";
import Image from "next/image";
import Home from "./components/home";
import Contact from "./components/contact";
import Work from "./components/work";
import Service from "./components/service";
import About from "./components/about";
import Footer from "./components/footer";
import Search from "./components/search";
import { useState, useEffect } from "react";


const App = () => {
  const [showMenu, setShowMenu] = useState(Array(3).fill(false));

  const handleClick = (index) => {
    const newShowMenu = [...showMenu];
    newShowMenu[index] = !showMenu[index];
    setShowMenu(newShowMenu);
  }


  const [hl7Data, setHL7Data] = useState('');
  const [jsonData, setJsonData] = useState('');

  const handleHL7Change = async (event) => {
    const hl7Data = event.target.value;
    setHL7Data(hl7Data);

    try {
      const response = await fetch('http://localhost:3000/hl7tojson', {
        method: 'POST',
        headers: { 'Content-Type': 'text/plain' },
        body: hl7Data
      });

      if (!response.ok) {
        throw new Error(`Error enviando HL7 data: ${response.status}`);
      }
      const jsonData = await response.json();
      setJsonData(jsonData);

      console.log(jsonData)
    } catch (error) {
      console.error('Error:', error);
    }
  };

  return (
    <div className="flex flex-col">

      <header>
        <Header />
      </header>

      <footer>
        <Footer/>
      </footer>

      <div>
        <Search/>
      </div>

      <Home/>

      <About/>
      
      <Service/>
      

      {/*<Work/>

      <Contact/> */}


    </div>
  );
};




export default App;
