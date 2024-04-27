import React, { useState } from 'react'
import Image from 'next/image';

export default function DatabaseWindows() {

  const [isopen, setIsopen] = useState(false)
  return (
    <>
    <div className='flex flex-row justify-center items-center text-white'>

      <h5 className="w-[83%] max-sm:w-[70%] max-sm:m-3  text-center m-0 text-3xl tracking-widest font-thin hover:text-[#1F803F]">
        DataBase Magnagement 
      </h5>

      <button className="w-[12%] max-sm:w-[100%] max-sm:m-4 hover:scale-125  m- p-0 font-bold" onClick={()=>setIsopen(true)}>
      <svg className='fill-white w-full hover:fill-[#1F803F]' xmlns="http://www.w3.org/2000/svg" id="arrow-circle-down" viewBox="0 0 24 24">
          <path d="M12,0A12,12,0,1,0,24,12,12.013,12.013,0,0,0,12,0Zm0,16a2.993,2.993,0,0,1-1.987-.752c-.327-.291-.637-.574-.84-.777L6.3,11.647a1,1,0,0,1,1.4-1.426L10.58,13.05c.188.187.468.441.759.7a1,1,0,0,0,1.323,0c.29-.258.57-.512.752-.693L16.3,10.221a1,1,0,1,1,1.4,1.426l-2.879,2.829c-.2.2-.507.48-.833.769A2.99,2.99,0,0,1,12,16Z"/><path xmlns="http://www.w3.org/2000/svg" d="M12,0A12,12,0,1,0,24,12,12.013,12.013,0,0,0,12,0Zm0,16a2.993,2.993,0,0,1-1.987-.752c-.327-.291-.637-.574-.84-.777L6.3,11.647a1,1,0,0,1,1.4-1.426L10.58,13.05c.188.187.468.441.759.7a1,1,0,0,0,1.323,0c.29-.258.57-.512.752-.693L16.3,10.221a1,1,0,1,1,1.4,1.426l-2.879,2.829c-.2.2-.507.48-.833.769A2.99,2.99,0,0,1,12,16Z"/>
        </svg>
      </button>
    </div>
      {
        isopen && (
          <div className="inset-0 absolute backdrop-blur-sm flex justify-center items-center max-sm:w-[100%] max-sm:h-[100%]">

            <div className="bg-[#062132] text-white flex flex-col items-center p-5 rounded w-full h-[100%] max-sm:w-[100%]">

            <header className="text-center p-5">
              <h1 className="text-5xl">About Us</h1>
            </header>

            <div className='flex flex-row items-center max-sm:flex-col'>
              <div className='flex flex-col'>
                

              <div className='flex flex-row gap-0 text-white'>

              <h5 className="w-[50%] max-sm:w-[80%] text-center m-0 text-3xl tracking-widest font-thin hover:text-[#1F803F]">
                DataBase Magnagement 
              </h5>

              <button className="w-[4%] max-sm:w-[13%] hover:scale-125  m- p-0 font-bold" onClick={()=>setIsopen(false)}>
                    
                    <svg className='fill-white w-full hover:fill-[#1F803F]' xmlns="http://www.w3.org/2000/svg" id="arrow-circle-down" viewBox="0 0 24 24"><path d="M12,24A12,12,0,1,0,0,12,12.013,12.013,0,0,0,12,24ZM12,8a2.993,2.993,0,0,1,1.987.752c.327.291.637.574.84.777L17.7,12.353a1,1,0,1,1-1.4,1.426L13.42,10.95c-.188-.187-.468-.441-.759-.7a1,1,0,0,0-1.323,0c-.29.258-.57.512-.752.693L7.7,13.779a1,1,0,0,1-1.4-1.426L9.178,9.524c.2-.2.507-.48.833-.769A2.99,2.99,0,0,1,12,8Z"/><path xmlns="http://www.w3.org/2000/svg" d="M12,24A12,12,0,1,0,0,12,12.013,12.013,0,0,0,12,24ZM12,8a2.993,2.993,0,0,1,1.987.752c.327.291.637.574.84.777L17.7,12.353a1,1,0,1,1-1.4,1.426L13.42,10.95c-.188-.187-.468-.441-.759-.7a1,1,0,0,0-1.323,0c-.29.258-.57.512-.752.693L7.7,13.779a1,1,0,0,1-1.4-1.426L9.178,9.524c.2-.2.507-.48.833-.769A2.99,2.99,0,0,1,12,8Z"/>
                    </svg>
              </button>
              </div>

                <div className='m-5 flex flex-col justify-center'>
                  <div className='m-2'>

                    <p className='text-3xl text-justify max-sm:m-0 m-5'>
                    Proficiency in handling Oracle, MySQL, and PostgreSQL databases
                    </p>
                  </div>
                  </div>
              </div>
              <div>
              <Image
                    src="/database.png"
                    alt="database Logo"
                    width={1920}
                    height={1080}
                    className="w-full h-full object-cover"
                  />
              </div>

            </div>
                
              </div>
              
            </div>
        )
      }
    </>
  );
}