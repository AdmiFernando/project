import React from 'react'
import { useState, useEffect } from 'react';

export default function Service() {
  const [isVisible, setIsVisible] = useState(false);
  useEffect(() => {
    setIsVisible(true);
  }, []);
  return (
    <section id='service' className={`my-component ${isVisible ? 'fade-enter-active' : 'fade-exit-active'}`}>
      
    <div class="service">
    
    <h2>SERVICE</h2>

    <article id='conter-princ'>
      <b><h3>GROW YOUR BRAND!</h3></b>
      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. </p>

      <div id='cont-selec'>

          <div id='offert'>
            <article>
              <div id='icons'>
                <svg className='w-[100%] fill-white' stroke="currentColor" fill="currentColor" strokeWidth="0" viewBox="0 0 24 24" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M24 12L18.3431 17.6569L16.9289 16.2426L21.1716 12L16.9289 7.75736L18.3431 6.34315L24 12ZM2.82843 12L7.07107 16.2426L5.65685 17.6569L0 12L5.65685 6.34315L7.07107 7.75736L2.82843 12ZM9.78845 21H7.66009L14.2116 3H16.3399L9.78845 21Z"></path></svg>
              </div>
              <p id='parraf'>WEB DEVELOPMENT</p>
            </article>

          <div id="linea"></div>

            <article>
              <div id='icons'>
                <svg className='w-[100%] fill-white' stroke="currentColor" fill="currentColor" strokeWidth="0" viewBox="0 0 24 24" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path fill="none" d="M0 0h24v24H0z"></path><path d="m18.85 10.39 1.06-1.06c.78-.78.78-2.05 0-2.83L18.5 5.09c-.78-.78-2.05-.78-2.83 0l-1.06 1.06 4.24 4.24zm-5.66-2.83L4 16.76V21h4.24l9.19-9.19-4.24-4.25zM19 17.5c0 2.19-2.54 3.5-5 3.5-.55 0-1-.45-1-1s.45-1 1-1c1.54 0 3-.73 3-1.5 0-.47-.48-.87-1.23-1.2l1.48-1.48c1.07.63 1.75 1.47 1.75 2.68zM4.58 13.35C3.61 12.79 3 12.06 3 11c0-1.8 1.89-2.63 3.56-3.36C7.59 7.18 9 6.56 9 6c0-.41-.78-1-2-1-1.26 0-1.8.61-1.83.64-.35.41-.98.46-1.4.12a.992.992 0 0 1-.15-1.38C3.73 4.24 4.76 3 7 3s4 1.32 4 3c0 1.87-1.93 2.72-3.64 3.47C6.42 9.88 5 10.5 5 11c0 .31.43.6 1.07.86l-1.49 1.49z"></path></svg>
              </div>
              <p id='parraf'>DESIGN</p>
            </article>

          <div id="linea"></div>

            <article>
              <div id='icons'>
                <svg className='w-[100%] fill-white' stroke="currentColor" fill="currentColor" strokeWidth="0" viewBox="0 0 512 512" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M241.406 21l-15.22 34.75c-7.864.478-15.703 1.472-23.467 2.97l-23.282-30.064-25.094 8.532-.125 38.25c-10.63 5.464-20.817 12.07-30.44 19.78L88.313 79.25 70.156 98.563 88.312 133c-5.852 8.346-10.925 17.072-15.218 26.094l-38.938 1.062-7.906 25.28 31.438 23.158c-1.505 9.38-2.24 18.858-2.282 28.344L20.5 254.625l3.656 26.25 38.313 7.5c2.284 7.982 5.107 15.826 8.5 23.5L45.72 343.22l14.093 22.436 39.25-9.187c2.47 2.895 5.037 5.757 7.718 8.53 5.643 5.835 11.565 11.206 17.72 16.125l-7.625 39.313 22.938 13.25 29.968-26.094c8.606 3.462 17.435 6.23 26.407 8.312l9.782 38.406 26.405 2.157 15.875-36.22c10.97-.66 21.904-2.3 32.656-4.938l25.22 29.22 24.593-9.844-.72-14.813-57.406-43.53c-16.712 4.225-34.042 5.356-51.063 3.436-31.754-3.58-62.27-17.92-86.218-42.686-54.738-56.614-53.173-146.67 3.438-201.406 27.42-26.513 62.69-39.963 98-40.344 37.59-.406 75.214 13.996 103.438 43.187 45.935 47.512 52.196 118.985 19.562 173.095l31.97 24.25c3.997-6.28 7.594-12.75 10.75-19.375l38.655-1.063 7.906-25.28-31.217-23c1.513-9.457 2.262-19.035 2.28-28.594l34.688-17.625-3.655-26.25-38.28-7.5c-3.196-10.993-7.444-21.762-12.75-32.125l22.81-31.594-15.25-21.657-37.56 10.906c-.472-.5-.93-1.007-1.408-1.5-5.998-6.205-12.33-11.89-18.937-17.064l7.188-37.125L334 43.78l-28.5 24.814c-9.226-3.713-18.702-6.603-28.313-8.75l-9.343-36.688L241.406 21zM183.25 174.5c-10.344.118-20.597 2.658-30 7.28l45.22 34.314c13.676 10.376 17.555 30.095 7.06 43.937-10.498 13.85-30.656 15.932-44.53 5.408l-45.188-34.282c-4.627 24.793 4.135 51.063 25.594 67.344 19.245 14.597 43.944 17.33 65.22 9.688l4.78-1.72 4.03 3.063 135.19 102.564 4.03 3.062-.344 5.063c-1.637 22.55 7.59 45.61 26.844 60.217 21.46 16.28 49.145 17.63 71.78 6.5l-45.186-34.28c-13.874-10.526-17.282-30.506-6.78-44.344 10.5-13.84 30.537-15.405 44.217-5.032l45.188 34.283c4.616-24.784-4.11-51.067-25.563-67.344-19.313-14.658-43.817-17.562-64.968-10.033l-4.75 1.688-4.03-3.063-135.19-102.562-4.03-3.063.344-5.03c1.55-22.387-7.85-45.194-27.157-59.845-12.544-9.516-27.222-13.978-41.78-13.812zm43.563 90.25l163.875 124.344L379.406 404 215.5 279.625l11.313-14.875z"></path></svg>
              </div>
              <p id='parraf'>SUPPORT AND MAINTENANCE</p>
            </article>
          
          <div id="linea"></div>

            <article>
              <div id='icons'>
                <svg className='w-[100%] fill-white' stroke="currentColor" fill="none" strokeWidth="2" viewBox="0 0 24 24" stroke-linecap="round" stroke-linejoin="round" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M19.875 12c.621 0 1.125 .512 1.125 1.143v5.714c0 .631 -.504 1.143 -1.125 1.143h-15.875a1 1 0 0 1 -1 -1v-5.857c0 -.631 .504 -1.143 1.125 -1.143h15.75z"></path><path d="M9 12v2"></path><path d="M6 12v3"></path><path d="M12 12v3"></path><path d="M18 12v3"></path><path d="M15 12v2"></path><path d="M3 3v4"></path><path d="M3 5h18"></path><path d="M21 3v4"></path></svg>
              </div>
              <p id='parraf'>CUSTOM SOFTWARE</p>
            </article>

        </div>

         <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempora magni porro ullam vel enim architecto voluptatibus quae non.?</p>

         <div id='links'>
          <a href='#' >START NOW</a>
         </div>

         <div id='links2'>
            <a href='#'>CUSTOM PLAN</a>
            
            <a href='#'>PLAN 1</a>
            
            <a href='#'>PLAN 2</a>
         </div>

         <div id='links3'>              
          <a href='#'>STANDARD MOBILE APP</a>
          
          <a href='#'>COMPLETE MOBILE APP</a>
         </div>

      </div>

     
      

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

     <div id='content-line'>
        <div id='line3'></div>
      </div>

    </section>
  )
}
