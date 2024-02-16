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
                src="/vercel.svg"
                alt="Vercel Logo"
                width={150}
                height={150}
              />
          </a>
        </div>
        <ul className="flex gap-10 items-center uppercase text-black lg:text-white font-semibold tracking-wider">
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
            <NavLink href="#">Home</NavLink>
            <NavLink href="#">Services</NavLink>
            <NavLink href="#">Expertise</NavLink>
            <NavLink href="#">Work</NavLink>
          </ul>
        </div>
      </header>
  );
};

export default Header;