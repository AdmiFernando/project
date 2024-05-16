import React from 'react'
import Image from "next/image";
import ExcludeWindows from "./modalexclude";
import LanguaguesWindows from "./modallanguages";
import ControlWindows from "./modalcontrol";
import DatabaseWindows from "./modaldatabase";
import ExpertiseWindows from "./modalexpertise";
import ProjectWindows from "./modalproject";
import { useState, useEffect } from 'react';

export default function Expertise() {

    const [isVisible, setIsVisible] = useState(false);
    useEffect(() => {
      setIsVisible(true);
    }, []);

  return (
    <section id="expertise" className={`my-component ${isVisible ? 'fade-enter-active' : 'fade-exit-active'}`}>
        <div className="expertise">

            <h2>EXPERTISE</h2>

        <article id='conter-princ'>
            <p>Our company work to offer a innovative and efficient solution in the field of web development. We have the following abilities: </p>

            <div id='cont-selec'>

                    <LanguaguesWindows/>

                    <ControlWindows/>

                    <ProjectWindows/>

                    <DatabaseWindows/>

                    <ExpertiseWindows/>

                    <ExcludeWindows/>


            </div>

        </article>


        </div>

        <footer id='email'>
      <div id='cont-princ-email'>
        <h4>SEND YOUR EMAIL!</h4>
      <div id='cont-email'>
        <button id='icon-send'><svg className='fill-white p-0 m-0' stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 24 24" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M21 3C21.5523 3 22 3.44772 22 4V20.0066C22 20.5552 21.5447 21 21.0082 21H2.9918C2.44405 21 2 20.5551 2 20.0066V19H20V7.3L12 14.5L2 5.5V4C2 3.44772 2.44772 3 3 3H21ZM8 15V17H0V15H8ZM5 10V12H0V10H5ZM19.5659 5H4.43414L12 11.8093L19.5659 5Z"></path></svg></button>
      <input id='input-send' type='text'></input>
      </div>
      </div>
    </footer>
{/* 
     <div id='content-line'>
        <div id='line3'></div>
      </div> */}
    </section>
  )
}
