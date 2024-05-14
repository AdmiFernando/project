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
        <div id="logo" className="flex items-center">
          <a href="#home">
          <Image
                src="/Untitled.png"
                alt=""
                width={100}
                height={100}
              />
              
          </a>
        </div>
        <ul id="nav">
          <NavLink id="link" to="/home" activeClass="active">HOME</NavLink>
          <NavLink id="link" to="/about" activeClass="active">ABOUT US</NavLink>
          <NavLink id="link" to="/service" activeClass="active">SERVICE</NavLink>
          <NavLink id="link" to="work" activeClass="active" >WORK</NavLink>
          <NavLink id="link" to="/contact" activeClass="active">CONTACT</NavLink>
        </ul> 

         {/* <nav className="">
          <button onClick={() => setIsActive(!isActive)} className="flex items-center flex-col gap-2 ">
            <div className="h-0.5 w-10 bg-white"></div>
            <div className="h-0.5 w-10 bg-white"></div>
            <div className="h-0.5 w-10 bg-white"></div>
          </button>
        </nav> */}

        <div onClick={() => setIsActive(!isActive)} className={isActive ? "fixed h-[100vh] w-full bg-[rgba(0,0,0,.8)] left-0 bottom-0 duration-500 transition-all translate-y-[0vh]" : "duration-700 w-full h-[100vh] left-0 bottom-0 transition-all absolute -translate-y-[100vh]"}>
          <nav className="z-50 absolute right-0 pt-[53px] md:pt-[70px] pr-3 md:pr-8">
            <button onClick={() => setIsActive(!isActive)} className="flex items-center flex-col gap-2 ">
              <div className="h-0.5 w-10 bg-white"></div>
              <div className="h-0.5 w-10 bg-white"></div>
              <div className="h-0.5 w-10 bg-white"></div>
            </button>
          </nav>
            <ul className="flex justify-center items-center flex-col h-full text-white gap-8 text-lg sm:text-xl md:text-2xl">
              <ul className="flex flex-wrap justify-center md:hidden gap-4 md:gap-10 items-center uppercase text-sm text-white lg:text-white font-semibold tracking-wider">
                <NavLink className="border-b-2 pb-0.5" href='#about'>About Us</NavLink>
                {/* <Link className="border-b-2 pb-0.5" href='#expertise'>Expertise</Link> */}
                <NavLink className="border-b-2 pb-0.5" href='#contact'>Contact</NavLink>
              </ul>
              <NavLink href="#about">Languages/Frameworks</NavLink>
              <NavLink href="#about">Database Management</NavLink>
              <NavLink href="#about">Version Control</NavLink>
              <NavLink href="#about">Expertise</NavLink>
              <NavLink href="#about">Project Management</NavLink>
              <NavLink href="#about">Excluded Services</NavLink>
            </ul>
        </div>

      </header>
  );
};

export default Header;