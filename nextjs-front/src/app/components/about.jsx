import React from 'react'
import { useState, useEffect } from 'react';
import Image from 'next/image';

export default function About() {
  const [isVisible, setIsVisible] = useState(false);
  useEffect(() => {
    setIsVisible(true);
  }, []);
  return (
    <section id='about'  className={`my-component ${isVisible ? 'fadeEnter' : 'fadeExit'}`}>

    <div id='container-image'>
      <Image
          src="/NOSOTROS.png"
          width={1920}
          height={1080}
          className="w-[100%] object-cover"
        />
    </div>

  <div class="about">
    
    <h2>ABOUT US</h2>

    <article id='contentPrinc'>
      <h3>WHO ARE WE?</h3>

      <div id='container'>
        <article id='text'>
          <p>
          <b>We grow your business with the latest technologies so that it obtains the largest and best presence on the internet.</b>
            <br/>
          We are a team of professionals in constant evolution. We are passionate about developing innovative and efficient solutions. With transparent communication and focus on the end user, we are here to support you every step of the way, providing adivice and ongoing support even after the completion of your project.
          </p>
      </article>

      <article id='msg'>
        <p>
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempora magni porro ullam vel enim architecto voluptatibus quae non, quibusdam est dignissimos sed magnam! Ipsam, recusandae! Nulla quaerat laboriosam nostrum vel?
        <br />
        <i></i>
        </p>
        <p>
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempora magni porro ullam vel enim architecto voluptatibus quae non, quibusdam est dignissimos sed magnam! Ipsam, recusandae! Nulla quaerat laboriosam nostrum vel?
        <br />
        <i></i>
        </p>
      </article>
      </div>
      
      <article id='selection'>
      <h3>
        Why Choose Us?
      </h3>

      <div id='cont-selec'>

        <article>
          <div id='icons'>
          <svg className='fill-white items-center p-0 m-0 w-[90%]' xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M506.1 127.1c-17.97-20.17-61.46-61.65-122.7-71.1c-22.5-3.354-45.39 3.606-63.41 18.21C302 60.47 279.1 53.42 256.5 56.86C176.8 69.17 126.7 136.2 124.6 139.1c-7.844 10.69-5.531 25.72 5.125 33.57c4.281 3.157 9.281 4.657 14.19 4.657c7.406 0 14.69-3.375 19.38-9.782c.4062-.5626 40.19-53.91 100.5-63.23c7.457-.9611 14.98 .67 21.56 4.483L227.2 168.2C214.8 180.5 207.1 196.1 207.1 214.5c0 17.5 6.812 33.94 19.16 46.29C239.5 273.2 255.9 279.1 273.4 279.1s33.94-6.813 46.31-19.19l11.35-11.35l124.2 100.9c2.312 1.875 2.656 5.251 .5 7.97l-27.69 35.75c-1.844 2.25-5.25 2.594-7.156 1.063l-22.22-18.69l-26.19 27.75c-2.344 2.875-5.344 3.563-6.906 3.719c-1.656 .1562-4.562 .125-6.812-1.719l-32.41-27.66L310.7 392.3l-2.812 2.938c-5.844 7.157-14.09 11.66-23.28 12.6c-9.469 .8126-18.25-1.75-24.5-6.782L170.3 319.8H96V128.3L0 128.3v255.6l64 .0404c11.74 0 21.57-6.706 27.14-16.14h60.64l77.06 69.66C243.7 449.6 261.9 456 280.8 456c2.875 0 5.781-.125 8.656-.4376c13.62-1.406 26.41-6.063 37.47-13.5l.9062 .8126c12.03 9.876 27.28 14.41 42.69 12.78c13.19-1.375 25.28-7.032 33.91-15.35c21.09 8.188 46.09 2.344 61.25-16.47l27.69-35.75c18.47-22.82 14.97-56.48-7.844-75.01l-120.3-97.76l8.381-8.382c9.375-9.376 9.375-24.57 0-33.94c-9.375-9.376-24.56-9.376-33.94 0L285.8 226.8C279.2 233.5 267.7 233.5 261.1 226.8c-3.312-3.282-5.125-7.657-5.125-12.31c0-4.688 1.812-9.064 5.281-12.53l85.91-87.64c7.812-7.845 18.53-11.75 28.94-10.03c59.75 9.22 100.2 62.73 100.6 63.29c3.088 4.155 7.264 6.946 11.84 8.376H544v175.1c0 17.67 14.33 32.05 31.1 32.05L640 384V128.1L506.1 127.1zM48 352c-8.75 0-16-7.245-16-15.99c0-8.876 7.25-15.99 16-15.99S64 327.2 64 336.1C64 344.8 56.75 352 48 352zM592 352c-8.75 0-16-7.245-16-15.99c0-8.876 7.25-15.99 16-15.99s16 7.117 16 15.99C608 344.8 600.8 352 592 352z"/></svg>
          </div>
          <p id='number'><b>28+</b></p>
          <p id='parraf'>SATISFIED CUSTOMERS</p>
        </article>

        <div id="linea"></div>

        <article>
          <div id='icons'>
          <svg className='fill-white items-center p-0 m-0 w-[100%]' xmlns="http://www.w3.org/2000/svg" viewBox="0 0 48 48"><title>Uittreksel</title><path fill-rule="evenodd" d="M16 29h9v-1.5h-9V29zm0-4.5h14V23H16v1.5zm0-4.5h14v-1.5H16V20zm0-4.5h14V14H16v1.5zm1 21.531L14.977 35H17v2.031zm3-3.531a1.5 1.5 0 0 0-1.5-1.5H13V9h20v16h3V9c0-1.654-1.346-3-3-3H13c-1.654 0-3 1.346-3 3v24.045c0 .781.289 1.501.812 2.025l6.061 6.085a2.883 2.883 0 0 0 2.025.845H29v-3h-9v-5.5zm14.5-1c-.827 0-1.5-.673-1.5-1.5s.673-1.5 1.5-1.5 1.5.673 1.5 1.5-.673 1.5-1.5 1.5zM39 31c0-2.481-2.019-4.5-4.5-4.5A4.505 4.505 0 0 0 30 31c0 1.791 1.059 3.328 2.577 4.052l-2 5.999 2.846.949 1.077-3.231L35.577 42l2.846-.949-2-5.999C37.941 34.328 39 32.791 39 31z"/></svg>
          </div>
          <p id='number'><b>3+</b></p>
          <p id='parraf'>YEARS OF EXPERIENCE</p>
        </article>

        <div id="linea"></div>

        <article>
          <div id='icons'>
          <svg className='fill-white items-center p-0 m-0 w-[100%]' stroke="currentColor" fill="currentColor" strokeWidth="0" viewBox="0 0 24 24" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M21 3C21.5523 3 22 3.44772 22 4V20.0066C22 20.5552 21.5447 21 21.0082 21H2.9918C2.44405 21 2 20.5551 2 20.0066V19H20V7.3L12 14.5L2 5.5V4C2 3.44772 2.44772 3 3 3H21ZM8 15V17H0V15H8ZM5 10V12H0V10H5ZM19.5659 5H4.43414L12 11.8093L19.5659 5Z"></path></svg>
            
          </div>
          <p id='number'><b>32+</b></p>
          <p id='parraf'>FULFULLED PROJECTS</p>
        </article>

      </div>

    </article>

    </article>


  </div>

    <footer id='email'>
      <div id='cont-princ-email'>
        <h4>SEND YOUR EMAIL!</h4>
        <div id='cont-email'>
          <button id='icon-send'><svg className='fill-white p-0 m-0' stroke="currentColor" fill="currentColor" strokeWidth="0" viewBox="0 0 24 24" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M21 3C21.5523 3 22 3.44772 22 4V20.0066C22 20.5552 21.5447 21 21.0082 21H2.9918C2.44405 21 2 20.5551 2 20.0066V19H20V7.3L12 14.5L2 5.5V4C2 3.44772 2.44772 3 3 3H21ZM8 15V17H0V15H8ZM5 10V12H0V10H5ZM19.5659 5H4.43414L12 11.8093L19.5659 5Z"></path></svg></button>
        <input id='input-send' type='text'></input>
        </div>
      </div>
    </footer>

  </section>
  )
}
