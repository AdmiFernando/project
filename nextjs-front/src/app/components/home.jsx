import React from 'react'
import { useState, useEffect } from 'react';

export default function Home() {
  const [isVisible, setIsVisible] = useState(false);
  useEffect(() => {
    setIsVisible(true);
  }, []);
  return (
    <section id='home' className={`my-component ${isVisible ? 'fade-enter' : 'fade-exit'}`}>

    <div id="content">
      <div id='line1'></div>
    </div>
    <div id='content-line2'>
      <div id='line2'>
        <p id='parraf-line2'>
          HOME
        </p>
      </div>
      <div id='line3'>
      <p id='parrafo-line3'>
        SEE MORE
      </p>
    </div> 
    </div>

  </section>
  )
}
