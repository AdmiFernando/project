'use client'
import React from "react";
import Header from "./components/header";
import Image from "next/image";
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
          const response = await fetch('http://localhost:8080/hl7tojson', {
            method: 'POST',
            headers: { 'Content-Type': 'text/plain' },
            body: hl7Data
          });
    
          if (!response.ok) {
            throw new Error(`Error enviando HL7 data: ${response.status}`);
          }
          const jsonData = await response.json();
          setJsonData(jsonData);


          console.log(jsonData.msh)
        } catch (error) {
          console.error('Error:', error);
        }
      };


  return (
    <div>

      <header>
        <Header />
      </header> 
      
      <main className="flex flex-col gap-3 px-1">
     
        {/* First section - Home */}
        <section className="flex lg:h-auto h-[100vh] md:h-[600px] relative shadow-section">

          <article className="w-[60%] md:w-[40%] lg:w-[30%] h-auto flex flex-col justify-center px-4 md:px-1 text-center gap-5 md:gap-10 bg-white">
            <h2 className="text-[rgba(0,0,0,0.6)] font-extrabold md:text-3xl text-2xl pb-5">
              We’re here to help you  
            </h2>
            <p className="md:text-4xl text-3xl">
              Lorem Ipsum est simplement du faux text.
            </p>
          </article>    

          <div className="w-[40%] md:w-[60%] lg:w-[70%] h-100 opacity-40">
            <Image
              src="/banner.jpg"
              alt="Vercel Logo"
              width={1920}
              height={1080}
              className="w-full h-full object-cover"
            />
          </div>


        </section>

        {/* Second section - About */}
        <section className="bg-[#062132] w-full py-10 shadow-section text-white" id="about">  
          <header className="text-center">
            <h1 className="text-5xl">About Us</h1>
          </header>
          <article className="mt-14 flex lg:flex-row flex-col-reverse lg:items-start items-center justify-center gap-4 lg:gap-28">
            <div className="mt-16">
              <Image
                src="/tech-img.svg"
                alt="Vercel Logo"
                width={350}
                height={350}
                className="md:px-0 px-4"
              />
            </div>
            <section className="grid grid-cols-2 w-[100%] lg:w-[50%] gap-16 text-center">
              <article className="col-span-2 lg:col-start-2 flex flex-col gap-2 w-full lg:w-64">
                <h5 className="text-center text-4xl tracking-widest font-thin">
                  Who we are
                </h5>
                <p className="leading-7 text-[rgba(255,255,255,0.55)] text-lg">     
                On sait depuis longtempsque travailler avec du textelisible et contenant du sensest source de distractions,et empêche de seconcentrer sur la mise enpage elle-même.
                </p>
              </article>
              <article className="col-start-1 md:col-span-1 col-span-2 flex flex-col gap-2 -mt-0 lg:-mt-[100px] w-full lg:w-64 md:row-start-2 row-start-3">
                <h5 className="text-center text-4xl tracking-widest font-thin lg:text-start">
                  Mission
                </h5>
                <p className="leading-7 text-[rgba(255,255,255,0.55)] text-lg">
                On sait depuis longtempsque travailler avec du textelisible et contenant du sensest source de distractions,et empêche de seconcentrer sur la mise enpage elle-même.
                </p>  
              </article>
              <article className="col-start-1 md:col-start-2 md:col-span-1 col-span-2 md:row-start-2 row-start-2 flex flex-col gap-2 w-full lg:w-64">
                <h5 className="text-center text-4xl tracking-widest font-thin">
                  Vision
                </h5>
                <p className="leading-7 text-[rgba(255,255,255,0.55)] text-lg">
                  On sait depuis longtemps
                  que travailler avec du texte
                  lisible et contenant du sens
                  est source de distractions,
                  et empêche de se.
                </p>
              </article>
            </section>
          </article>
        </section>

        {/* Third section - Expertise */}
        <section className="bg-white w-full h-auto shadow-section p-4" id="expertise"> 

         {items.map((item, index) => (
        <article className="flex flex-col gap-4">
          
          <header>
           <button onClick={() => handleClick(index)}>
            <h1 className="flex gap-4 text-xl font-semibold items-center">
              Title
              <span className="block">
                <svg className="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
                  <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19 14l-7 7-7-7m14-8l-7 7-7-7"/>
                </svg>
              </span>
            </h1>
           </button>
          </header>
          {showMenu[index] && (
            <section className="flex gap-2">
              <form className="">
                <textarea className="w-52 h-48 bg-black text-white p-2" id="hl7Data" name="hl7Data" onKeyUp={handleHL7Change}></textarea>
              </form>
              <div className="w-[700px] h-48 bg-black text-white p-2 overflow-y-scroll">
                <p>{JSON.stringify(jsonData, null, 2)}</p>
              </div>
            </section>
          )}
        </article>
        ))}


        <section>
        {jsonData && (
          <ul className="flex flex-col gap-4">
            <p className="-mb-2 mt-3">
              MSH:
            </p>
            <li className="flex flex-col gap-1 h-auto">
              <span className="ml-8">{jsonData.msh.msh_1_fieldSeparator}</span>
              <span className="ml-8">{jsonData.msh.msh_2_encodingCharacters}</span>
              <span className="ml-8">SENDING_APPLICATION</span>
              <span className="ml-8">SENDING_FACILITY</span>
              <span className="ml-8">RECEIVING_APPLICATION</span>
              <span className="ml-8">RECEIVING_FACILITY</span>
              <span className="ml-8">202403242034-04</span>
              <span className="ml-8">ADT</span>
              <span className="ml-8">76833</span>
              <span className="ml-8">P</span>
              <span className="ml-8">2.5</span>
              <span className="ml-8">AL</span>
              <span className="ml-8">NE</span>
              <span className="ml-8">AUS</span>
              <span className="ml-8">ASCII</span>
              <span className="ml-8">EN</span>
            </li>
            <p className="-mb-2 mt-3">
              PID:
            </p>
            <li class="flex flex-col gap-1 h-auto">
              <span className="ml-8">1</span>
              <span className="ml-8">PATIENT_ID</span>
              <span className="ml-8">PATIENT_NAME</span>
            </li>
          </ul>
          )}
        </section>


        </section>

        

        {/* Section - Footer */}
        <section className="flex w-full h-full relative shadow-section" id="contact">
          <article className="w-[40%] flex flex-col justify-center px-16 gap-10 bg-[#062132] text-left pt-48 pb-24">
            <h2 className="text-white font-extrabold text-5xl pb-6">
              Get in touch.
            </h2>
            <p className="text-lg text-[rgba(255,255,255,0.75)]">
              On sait depuis longtemps que travailleravec du texte lisible et contenant dusens est source de distractions, etempêche de se concentrer sur la miseen page elle-même
            </p>

            <div className="flex flex-col">
              <a href="#" className="text-lg font-thin text-[rgba(255,255,255,0.75)]">
                +19143386828
              </a>
              <a href="#" className="text-lg font-thin text-[rgba(255,255,255,0.75)]">
                Codecraft@gmail.com
              </a>
            </div>
          </article>    

          <div className="w-[60%] h-100 opacity-40">
            <Image
              src="/banner.jpg"
              alt="Vercel Logo"
              width={1920}
              height={1080}
              className="w-full h-full object-cover   "
            />
          </div>
        </section>

      </main>
      
    </div>
  );
};


const items = [
  {
    id: 1,
    label: "Languages/Frameworks",
    content: [
      {
        id: 2,
        sub_content: "Contenido",
      },
      {
        id: 3,
        sub_content: "Ejemplo",
      },
    ],
  },
  {
    id: 4,
    label: "Languages/Frameworks",
    content: [
      {
        id: 5,
        sub_content: "Contenido",
      },
      {
        id: 6,
        sub_content: "Ejemplo",
      },
    ],
  },
  {
    id: 7,
    label: "Languages/Frameworks",
    content: [
      {
        id: 8,
        sub_content: "Contenido",
      },
      {
        id: 9,
        sub_content: "Ejemplo",
      },
    ],
  },
];



export default App;
