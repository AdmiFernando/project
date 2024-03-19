'use client'
import React from "react";
import NavLink from 'next/link';
import Image from "next/image";
import { useState } from "react";
const Header = () => {   

  const [isActive, setIsActive] = useState(false);
  return (
    
      <header className="py-4 px-14 flex absolute items-center justify-between w-full z-50 top-0">

        <div className="flex items-center">
          <a href="/" className="text-2xl font-bold text-black">
          <Image
                src="/untitled.png"
                alt=""
                width={100}
                height={100}
              />
          </a>
        </div>
        <ul className="hidden gap-10 items-center uppercase text-black lg:text-white md:flex font-semibold tracking-wider">
          <NavLink href='#about'>About Us</NavLink>
          <NavLink href='#expertise'>Expertise</NavLink>
          <NavLink href='#contact'>Contact</NavLink>
        </ul>
        <nav className="z-50 ">
          <button onClick={() => setIsActive(!isActive)} className="flex items-center flex-col gap-2 ">
            <div className="h-0.5 w-10 bg-white"></div>
            <div className="h-0.5 w-10 bg-white"></div>
            <div className="h-0.5 w-10 bg-white"></div>
          </button>
        </nav>

        <div onClick={() => setIsActive(!isActive)} className={isActive ? "fixed h-[100vh] w-full bg-[rgba(0,0,0,.7)] left-0 bottom-0 duration-500 transition-all translate-y-[0vh]" : "duration-700 w-full h-[100vh] left-0 bottom-0 transition-all absolute -translate-y-[100vh]"}>
          <ul className="flex justify-center items-center flex-col h-full text-white gap-8 text-2xl">
            <ul className="flex md:hidden gap-4 md:gap-10 items-center uppercase text-base text-white lg:text-white font-semibold tracking-wider">
              <NavLink className="border-b-2 pb-0.5" href='#about'>About Us</NavLink>
              <NavLink className="border-b-2 pb-0.5" href='#expertise'>Expertise</NavLink>
              <NavLink className="border-b-2 pb-0.5" href='#contact'>Contact</NavLink>
            </ul>
            <NavLink href="#">Languages/Frameworks</NavLink>
            <NavLink href="#">Database Management</NavLink>
            <NavLink href="#">Version Control</NavLink>
            <NavLink href="#">Expertise</NavLink>
            <NavLink href="#">Project Management</NavLink>
            <NavLink href="#">Excluded Services</NavLink>
          </ul>
        </div>

      </header>
  );
};

export default Header;