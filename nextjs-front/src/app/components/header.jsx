'use client'
import React from "react";
import { NavLink } from "react-router-dom";
import Image from "next/image";
import "./header.css";
import { useState } from 'react';

const Header = () => {   

  const [isActive, setIsActive] = useState(false);

  return (
    
      <header>
        {/* logo */}
        <div id="logo">
          <Image
                src="/Untitled.png"
                alt="logo"
                width={100}
                height={100}
              />
        </div>

        {/* Nav */}
        <ul id="nav">
          <NavLink id="link" to="/home" activeClass="active">HOME</NavLink>
          <NavLink id="link" to="/about" activeClass="active">ABOUT US</NavLink>
          {/* <NavLink id="link" to="/service" activeClass="active">SERVICE</NavLink> */}
          <NavLink id="link" to="/capabilities" activeClass="active">CAPABILITIES</NavLink>
          {/* <NavLink id="link" to="work" activeClass="active" >WORK</NavLink> */}
          <NavLink id="link" to="/contact" activeClass="active">CONTACT</NavLink>
        </ul> 

        {/* space */}

        <div id="space-header">
        </div>

      </header>
  );
};

export default Header;