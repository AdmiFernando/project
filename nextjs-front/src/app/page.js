'use client'
import React from "react";
import Header from "./components/header";
import ExcludeWindows from "./components/modalexclude";
import LanguaguesWindows from "./components/modallanguages";
import ControlWindows from "./components/modalcontrol";
import DatabaseWindows from "./components/modaldatabase";
import ExpertiseWindows from "./components/modalexpertise";
import ProjectWindows from "./components/modalproject";
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
      const response = await fetch('http://localhost:3000/hl7tojson', {
        method: 'POST',
        headers: { 'Content-Type': 'text/plain' },
        body: hl7Data
      });

      if (!response.ok) {
        throw new Error(`Error enviando HL7 data: ${response.status}`);
      }
      const jsonData = await response.json();
      setJsonData(jsonData);

      console.log(jsonData)
    } catch (error) {
      console.error('Error:', error);
    }
  };

  return (
    <div>

      <header>
        <Header />
      </header>

      <main className="flex flex-col">

        {/* First section - Home */}
        <section className="flex h-[100vh] relative shadow-section">

          <article className="w-[80%] md:w-[40%] lg:w-[30%] flex flex-col justify-center px-4 md:px-1 text-center gap-5 md:gap-10 bg-white">
            <h2 className="text-[rgba(0,0,0,0.6)] font-extrabold md:text-3xl text-2xl pb-3 md:pt-[0vh] pt-[5vh]">
              We’re here to help you
            </h2>
            <p className="md:text-4xl text-3xl">
              Lorem Ipsum est simplement du faux text.
            </p>
          </article>

          <div className="w-[20%] md:w-[60%] lg:w-[70%] h-100 opacity-40">
            <Image
              src="/banner.jpg"
              alt="Vercel Logo"
              width={1920}
              height={1080}
              className="w-full h-full object-cover"
            />
          </div>


        </section>
        
        {/* Section - About Us */}
        <section id="about" className="w-full h-[100vh] max-sm:h-[1720px] relative shadow-section text-white bg-[#062132] ">
        <div className="flex flex-col max-sm:m-4 justify-center items-center  text-white">
            <header className="text-center p-4">
              <h1 className="md:text-4xl text-3xl">About Us</h1>
            </header>
            <h2 className="text-center md:text-3xl text-2xl tracking-widest font-thin m-3">
              Our company work to offer a innovative and efficient solution in the field of web
              development. We have the following abilities:
            </h2>
            <div className="flex justify-center items-center self-center w-[90%] gap-2 flex-grow[2] flex-wrap m-4">
            <article id="frame" className="flex flex-col justify-center items-center w-[25%] max-sm:w-[100%] m-3 ">
                  <Image
                    src="/pngwing.com.png"
                    alt="More Logo"
                    width={1920}
                    height={1080}
                    className="w-[45%] object-cover"
                  />
                  <LanguaguesWindows/>
            </article>
            <article id="card" className="flex flex-col justify-center items-center w-[25%] max-sm:w-[100%] m-3">
                  <Image
                    src="/control.png"
                    alt="Project Logo"
                    width={1920}
                    height={1080}
                    className="w-[55%] object-cover"
                  />
                <ControlWindows/>
            </article>
            <article id="card" className="flex flex-col justify-center items-center w-[25%] max-sm:w-[100%] m-3">
                  <Image
                    src="/project.png"
                    alt="Project Logo"
                    width={1920}
                    height={1080}
                    className="w-[50%] object-cover"
                  />
                <ProjectWindows/>
            </article>
            <article id="card" className="flex flex-col justify-center items-center w-[25%] max-sm:w-[100%] m-3">
                  <Image
                    src="/database.png"
                    alt="database Logo"
                    width={1920}
                    height={1080}
                    className="w-[40%] object-cover"
                  />
                <DatabaseWindows/>
            </article>
            <article id="card" className="flex flex-col justify-center items-center w-[25%] max-sm:w-[100%] m-2">
                  <Image
                    src="/expertise.png"
                    alt="Expertise Logo"
                    width={1920}
                    height={1080}
                    className="w-[40%] object-cover"
                  />
                <ExpertiseWindows/>
            </article>
            <article id="card" className="flex flex-col justify-center items-center w-[25%] max-sm:w-[100%] m-3">
                  <Image
                    src="/excluded.png"
                    alt="Exclude Logo"
                    width={500}
                    height={500}
                    className="w-[40%] object-cover"
                  />
                <ExcludeWindows/>
            </article>
          </div>
        </div>
            
        </section>

        {/* Third section - Expertise
        <section className="bg-white w-full shadow-section p-4" id="expertise">
          <section>

            <section className="flex gap-2 flex-col md:flex-row w-full">
              <form className="lg:w-[60%] w-full">
                <p className="text-2xl my-2">
                  Original HL7
                </p>
                <textarea className="w-full md:w-full h-96 border-[#000] whitespace-nowrap text-black p-2 overflow-x-scroll border-2" id="hl7Data" name="hl7Data" onKeyUp={handleHL7Change}></textarea>
              </form>
              <article className="flex flex-col w-full lg:w-[40%]">
                <p className="text-2xl my-2">
                  Parsed HL7
                </p>
                <div className="w-full h-96 text-black p-2 overflow-y-scroll">
                  <pre className="">
                    <code>
                      {JSON.stringify(jsonData, null, 2)}
                    </code>
                  </pre>
                </div>
              </article>
            </section>

          </section>

          <section>
            {jsonData && (
              <ul className="flex flex-col gap-4">

                <p className="-mb-2 mt-3">
                  ce_msh_19_principalLanguageOfMessage:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.ce_msh_19_principalLanguageOfMessage.ce_1_identifier || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.ce_msh_19_principalLanguageOfMessage.ce_2_text || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.ce_msh_19_principalLanguageOfMessage.ce_3_nameOfCodingSystem || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.ce_msh_19_principalLanguageOfMessage.ce_4_alternateIdentifier || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.ce_msh_19_principalLanguageOfMessage.ce_5_alternateText || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.ce_msh_19_principalLanguageOfMessage.ce_6_nameOfAlternateCodingSystem || "null"}
                  </span>
                </li>

                <p className="-mb-2 mt-3">
                  cm_msh_9_messageType:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.cm_msh_9_messageType.cm_msg_1_messageType || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.cm_msh_9_messageType.cm_msg_2_triggerEvent || "null"}
                  </span>
                </li>

                <p className="-mb-2 mt-3">
                  hd_msh_3_sendingApplication:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_3_sendingApplication.hd_1_namespaceId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_3_sendingApplication.hd_2_universalId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_3_sendingApplication.hd_3_universalIdType || "null"}
                  </span>
                </li>

                <p className="-mb-2 mt-3">
                  hd_msh_3_sendingApplication:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_3_sendingApplication.hd_1_namespaceId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_3_sendingApplication.hd_2_universalId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_3_sendingApplication.hd_3_universalIdType || "null"}
                  </span>
                </li>


                <p className="-mb-2 mt-3">
                  hd_msh_4_sendingFacility:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_4_sendingFacility.hd_1_namespaceId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_4_sendingFacility.hd_2_universalId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_4_sendingFacility.hd_3_universalIdType || "null"}
                  </span>
                </li>


                <p className="-mb-2 mt-3">
                  hd_msh_5_receivingApplication:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_5_receivingApplication.hd_1_namespaceId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_5_receivingApplication.hd_2_universalId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_5_receivingApplication.hd_3_universalIdType || "null"}
                  </span>
                </li>

                <p className="-mb-2 mt-3">
                  hd_msh_6_receivingFacility:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_6_receivingFacility.hd_1_namespaceId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_6_receivingFacility.hd_2_universalId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_6_receivingFacility.hd_3_universalIdType || "null"}
                  </span>
                </li>

                <p className="-mb-2 mt-3">
                  MSH:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.msh_1_fieldSeparator}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_2_encodingCharacters}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_8_security || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_13_sequenceNumber || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_14_continuationPointer || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_3_sendingApplication.hd_1_namespaceId}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_4_sendingFacility.hd_1_namespaceId}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_5_receivingApplication.hd_1_namespaceId}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.hd_msh_6_receivingFacility.hd_1_namespaceId}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.ts_msh_7_dateTimeOfMessage.ts_1_time}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.cm_msh_9_messageType.cm_msg_1_messageType}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.cm_msh_9_messageType.cm_msg_2_triggerEvent}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_10_messageControlId}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_12_versionId}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_15_acceptAcknowledgementType}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_16_applicationAcknowledgementType}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_18_characterSet || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.msh_17_countryCode || "null"}
                  </span>
                </li>


                <p className="-mb-2 mt-3">
                  pt_msh_11_processingId:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.pt_msh_11_processingId.pt_1_processingId || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.pt_msh_11_processingId.pt_2_processingMode || "null"}
                  </span>
                </li>

                <p className="-mb-2 mt-3">
                  ts_msh_7_dateTimeOfMessage:
                </p>
                <li className="flex flex-col gap-1 h-auto">
                  <span className="ml-8">
                    {jsonData.msh.ts_msh_7_dateTimeOfMessage.ts_1_time || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.ts_msh_7_dateTimeOfMessage.ts_1_timeOfAnEvent || "null"}
                  </span>
                  <span className="ml-8">
                    {jsonData.msh.ts_msh_7_dateTimeOfMessage.ts_2_degreeOfPrecision || "null"}
                  </span>
                </li>

              </ul>

            )}
          </section>
        </section> */}

        {/* Section - Footer */}
        <section className="flex h-[100vh] relative shadow-section" id="contact">
          <article className="w-[80%] md:w-[60%] lg:w-[30%] flex flex-col justify-center px-4 md:px-16 gap-10 bg-white text-[#062132] text-left pt-48 pb-24">
            <h2 className=" font-extrabold text-5xl pb-6">
              Get in touch.
            </h2>
            <p className="text-lg">
              On sait depuis longtemps que travailleravec du texte lisible et contenant dusens est source de distractions, etempêche de se concentrer sur la miseen page elle-même
            </p>

            <div className="flex flex-col">
              <a href="#" className="text-lg font-thin">
                +19143386828
              </a>
              <a href="#" className="text-lg font-thin">
                Codecraft@gmail.com
              </a>
            </div>
          </article>

          <div className="w-[20%] md:w-[40%] lg:w-[70%] h-100 opacity-40">
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
