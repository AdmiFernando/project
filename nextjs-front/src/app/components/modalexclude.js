import React, { useState } from 'react'
import Image from 'next/image';

export default function ExcludeWindows() {

  const [isActive, setIsActive] = useState(false);
  return (
    <>
      <button id='button-modal' onClick={() => setIsActive(!isActive)}>
      <h5>
       Exclude Services
      </h5>
        </button>

        {/* Modal Pop-Up */}
        <div id='modal' className={isActive ? "modal-active" : "modal-desactive"}>

        <div id='content-modal'>
        {/* Content Text */}
        <div className='content-text'>

        <div id='title-modal-text'>

            <h5 className="w-[50%] text-center m-0 text-3xl hover:text-[#12487E]">
                    Version Control
                  </h5>
  
                  <button className="w-[5%] max-sm:w-[15%] hover:scale-125 p-0 font-bold" onClick={() => setIsActive(!isActive)}>
                        
                        <svg className='fill-black w-full hover:fill-[#12487E]' xmlns="http://www.w3.org/2000/svg" id="arrow-circle-down" viewBox="0 0 24 24"><path d="M12,24A12,12,0,1,0,0,12,12.013,12.013,0,0,0,12,24ZM12,8a2.993,2.993,0,0,1,1.987.752c.327.291.637.574.84.777L17.7,12.353a1,1,0,1,1-1.4,1.426L13.42,10.95c-.188-.187-.468-.441-.759-.7a1,1,0,0,0-1.323,0c-.29.258-.57.512-.752.693L7.7,13.779a1,1,0,0,1-1.4-1.426L9.178,9.524c.2-.2.507-.48.833-.769A2.99,2.99,0,0,1,12,8Z"/><path xmlns="http://www.w3.org/2000/svg" d="M12,24A12,12,0,1,0,0,12,12.013,12.013,0,0,0,12,24ZM12,8a2.993,2.993,0,0,1,1.987.752c.327.291.637.574.84.777L17.7,12.353a1,1,0,1,1-1.4,1.426L13.42,10.95c-.188-.187-.468-.441-.759-.7a1,1,0,0,0-1.323,0c-.29.258-.57.512-.752.693L7.7,13.779a1,1,0,0,1-1.4-1.426L9.178,9.524c.2-.2.507-.48.833-.769A2.99,2.99,0,0,1,12,8Z"/>
                        </svg>
                  </button>
              </div>
                  

                  <div className='m-0 flex flex-col justify-center'>
                    <div className='m-0'>

                    <p className='md:text-3xl text-2xl text-justify max-sm:m-0 m-5'>
                    Please note that we do not provide network and server infrastructure Services<i className='text-4xl'>.</i>
                    </p>
                  </div>
                  </div>
              </div>
              <div id='content-image'>
                  <Image
                    src="/excluded.png"
                    alt="Excluded Logo"
                    width={1920}
                    height={1080}
                    className="w-full object-cover"
                  />
              </div>

            </div>
              <div>
              
              </div>
            </div>
    </>
  );
}