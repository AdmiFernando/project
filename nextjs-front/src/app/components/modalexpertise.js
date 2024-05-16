import React, { useState } from 'react'
import Image from 'next/image';

export default function ExpertiseWindows() {

  const [isActive, setIsActive] = useState(false);
  return (
    <>
      <button id='button-modal' onClick={() => setIsActive(!isActive)}>
      <h5>
        Expertise
      </h5>
        </button>

        {/* Modal Pop-Up */}
              <div id='modal' className={isActive ? "modal-active" : "modal-desactive"}>

              <div id='content-modal'>
              {/* Content Text */}
              <div className='content-text'>

              <div id='title-modal-text'>

                  <h5 className="w-[50%] text-center m-0 text-3xl hover:text-[#12487E]">
                    Expertise
                  </h5>

                  <button className="w-[5%] hover:scale-125 p-0 font-bold" onClick={() => setIsActive(!isActive)}>
                        
                        <svg className='fill-black w-full hover:fill-[#12487E]' xmlns="http://www.w3.org/2000/svg" id="arrow-circle-down" viewBox="0 0 24 24"><path d="M12,24A12,12,0,1,0,0,12,12.013,12.013,0,0,0,12,24ZM12,8a2.993,2.993,0,0,1,1.987.752c.327.291.637.574.84.777L17.7,12.353a1,1,0,1,1-1.4,1.426L13.42,10.95c-.188-.187-.468-.441-.759-.7a1,1,0,0,0-1.323,0c-.29.258-.57.512-.752.693L7.7,13.779a1,1,0,0,1-1.4-1.426L9.178,9.524c.2-.2.507-.48.833-.769A2.99,2.99,0,0,1,12,8Z"/><path xmlns="http://www.w3.org/2000/svg" d="M12,24A12,12,0,1,0,0,12,12.013,12.013,0,0,0,12,24ZM12,8a2.993,2.993,0,0,1,1.987.752c.327.291.637.574.84.777L17.7,12.353a1,1,0,1,1-1.4,1.426L13.42,10.95c-.188-.187-.468-.441-.759-.7a1,1,0,0,0-1.323,0c-.29.258-.57.512-.752.693L7.7,13.779a1,1,0,0,1-1.4-1.426L9.178,9.524c.2-.2.507-.48.833-.769A2.99,2.99,0,0,1,12,8Z"/>
                        </svg>
                  </button>
              </div>
                
              <div className='m-0 flex flex-col justify-center'>

                      <h6 className='text-2xl text-justify'>
                        Relational DataBases:
                      </h6>
                      <p className='text-[9px] text-justify'>
                          ºExtensive experience in designing relational data models<i className='text-2xl'>.</i><br/>
                          ºAdeptness in crafting Metadata Desings, including Entity-Attribute-Value (EAV) structures<i className='text-2xl'>.</i><br/>
                          ºSkill in optimizing existing databases for enhanced performance<i className='text-2xl'>.</i> <br/>
                          ºCapacity to scale up databases to accommodate growing needs<i className='text-2xl'>.</i> <br/>
                      </p>
              
                  <h6 className='text-2xl text-justify'>
                    Healthcare Interoperability:
                  </h6>
                  <p className='text-[9px] text-justify'>
                      ºProficiency in implementing healthcare interoperability standars such as HL7 or FHIR/HAPI<i className='text-2xl'>.</i> <br/>
                  </p>

                  <h6 className='text-2xl text-justify'>
                      Microservices:
                    </h6>
                    <p className='text-[9px] text-justify'>
                      ºKnowledgeable in designing and implementing microservices architecture<i className='text-2xl'>.</i> <br/>
                    </p>

                  <h6 className='text-2xl text-justify'>
                      Application Security:
                    </h6>
                    <p className='text-[9px] text-justify'>
                      ºExpertise in fortiying applications with security measures, including OAuth2 and LDAP integration<i className='text-2xl'>.</i> <br/>
                    </p>

                  <h6 className='text-2xl text-justify'>
                      End-to-End Development:
                    </h6>
                    <p className='text-[9px] text-justify '>
                      ºCapability to steer application development through all stagers, ensuring holistic solutions<i className='text-2xl'>.</i> <br/>
                    </p>
                </div>
                </div>
              
              <div id='image'>
                  <Image
                    src="/expertise.png"
                    alt="Expertise Logo"
                    width={1920}
                    height={1080}
                    className="w-full object-cover"
                  />
              </div>

              </div>

            </div>
    </>
  );
}