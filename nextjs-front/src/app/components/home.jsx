import React from 'react'
import Image from 'next/image';
import { useState, useEffect } from 'react';

export default function Home() {
  const [isVisible, setIsVisible] = useState(false);
  useEffect(() => {
    setIsVisible(true);
  }, []);
  return (
    <section id='home' className={`my-component ${isVisible ? 'fadeEnter' : 'fadeExit'}`}>

      {/* image */}
      <div id='image'>
        <Image
          src="/1.png"
          alt='home'
          width={1920}
          height={1080}
          className="w-[70%] object-cover"
        />
      </div>

    {/* line */}
    <div id="content">
      <div id='line1'></div>
    </div>

  {/* Container Line */}
    <div id='content-line2'>
      {/* Line two */}
      <div id='line2'>
        <p id='parraf-line2'>
          HOME
        </p>
      </div>
      {/* Line 3 */}
      <div id='line3'>
      <p id='parrafo-line3'>
        SEE MORE
      </p>
    </div> 
    </div>

  </section>
  )
}
