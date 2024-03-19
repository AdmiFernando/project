'use client'
import React from "react";
import Header from "../components/header";
import Image from "next/image";
import { useState } from "react";


const App = () => {
  return (
    <div>

      <header>
        <Header />
      </header> 

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
