import React, { useState } from 'react'
import Image from 'next/image';

export default function ProjectWindows() {

  const [isActive, setIsActive] = useState(false);
  return (
    <>
    {/* Button Extern */}
      <button id='button-modal' onClick={() => setIsActive(!isActive)}>
        Project Magnagement
      </button>


      {/* Pop-up window */}
      <div id='modal' className={isActive ? "modal-active" : "modal-desactive"}>

                {/* container Text */}
                <div className='container-text'>

                {/* Container Tittle modal */}
                <div id='title-modal-text'>

                <h5 className="w-[30%] text-center m-0 text-3xl hover:text-[#12487E]">
                Project Magnagement
                </h5>

                {/* Button Window off*/}

                <button className="w-[10%] hover:scale-110 m-0 p-0" onClick={() => setIsActive(!isActive)}>
                          
                          <svg className='fill-black w-[40%] hover:fill-[#12487E]' xmlns="http://www.w3.org/2000/svg" id="arrow-circle-down" viewBox="0 0 24 24"><path d="M12,24A12,12,0,1,0,0,12,12.013,12.013,0,0,0,12,24ZM12,8a2.993,2.993,0,0,1,1.987.752c.327.291.637.574.84.777L17.7,12.353a1,1,0,1,1-1.4,1.426L13.42,10.95c-.188-.187-.468-.441-.759-.7a1,1,0,0,0-1.323,0c-.29.258-.57.512-.752.693L7.7,13.779a1,1,0,0,1-1.4-1.426L9.178,9.524c.2-.2.507-.48.833-.769A2.99,2.99,0,0,1,12,8Z"/><path xmlns="http://www.w3.org/2000/svg" d="M12,24A12,12,0,1,0,0,12,12.013,12.013,0,0,0,12,24ZM12,8a2.993,2.993,0,0,1,1.987.752c.327.291.637.574.84.777L17.7,12.353a1,1,0,1,1-1.4,1.426L13.42,10.95c-.188-.187-.468-.441-.759-.7a1,1,0,0,0-1.323,0c-.29.258-.57.512-.752.693L7.7,13.779a1,1,0,0,1-1.4-1.426L9.178,9.524c.2-.2.507-.48.833-.769A2.99,2.99,0,0,1,12,8Z"/>
                          </svg>
                    </button>
              </div>
                

              <div id='container-parraf'>
                <div>
                    <h6 className='text-2xl text-justify'>
                      Comprehensive involvement across the entire system development life cycle (SDLC):<br/><br/>
                    </h6>
                    <p className='text-4xl text-justify '>
                      ºDiligent planning <br/>
                      ºThorough analisys <br/>
                      ºMeticulous design <br/>
                      ºPrecise execution <br/>
                    </p>
                  </div>
              </div>
              </div>

            </div>
    </>
  );
}