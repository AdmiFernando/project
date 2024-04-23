'use client'
import React from "react";
import Header from "./components/header";
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
      const response = await fetch('http://localhost:5000/hl7tojson', {
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
        <section className="flex lg:h-screen md:h-[600px] relative shadow-section">

          <article className="w-[80%] md:w-[40%] lg:w-[30%] h-auto flex flex-col justify-center px-4 md:px-1 text-center gap-5 md:gap-10 bg-white">
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

        {/* Second section - About */}
        <section className="bg-[#062132] lg:h-screen w-full py-10 px-6 shadow-section text-white" id="about">
          <header className="text-center">
            <h1 className="text-5xl">About Us</h1>
          </header>
          <h2 className="text-center text-3xl tracking-widest font-thin py-10">
            Our company work to offer a innovative and efficient solution in the field of web
            development. We have the following abilities:
          </h2>
          <article className="mt-1 flex lg:flex-row flex-col-reverse lg:items-start items-center justify-center gap-4 lg:gap-28">
            <section className="grid grid-cols-3 w-[100%] lg:w-[50%] gap-10 text-center">
              <article id="intec" className=" flex flex-col gap-2 w-full lg:w-64 hover:scale-110 hover:text-[rgba(12,204,60,0.6)] cursor-pointer">
                <div className="">
                  <Image
                    src="/more.jpg"
                    alt="More Logo"
                    width={1920}
                    height={1080}
                    className="w-full h-full object-cover"
                  />
                </div>
                <h5 className="text-center text-3xl tracking-widest font-thin">
                Name 1
                </h5>
              </article>
              <article id="intec" className=" flex flex-col gap-2 w-full lg:w-64 hover:scale-110 hover:text-[rgba(12,204,60,0.6)] cursor-pointer">
              <div className="">
                  <Image
                    src="/more.jpg"
                    alt="More Logo"
                    width={1920}
                    height={1080}
                    className="w-full h-full object-cover"
                  />
                </div>
                <h5 className="text-center text-3xl tracking-widest font-thin">
                Name 2
                </h5>
              </article>
              <article id="intec" className=" flex flex-col gap-2 w-full lg:w-64 hover:scale-110 hover:text-[rgba(12,204,60,0.6)] cursor-pointer">
              <div className="">
                  <Image
                    src="/more.jpg"
                    alt="More Logo"
                    width={1920}
                    height={1080}
                    className="w-full h-full object-cover"
                  />
                </div>
                <h5 className="text-center text-3xl tracking-widest font-thin">
                Name 3
                </h5>
              </article>
              <article id="intec" className=" gap-2 md:col-span-1 col-span-2 md:row-start-2 row-start-2 flex flex-col  w-full lg:w-64 hover:scale-110 hover:text-[rgba(12,204,60,0.6)] cursor-pointer">
              <div className="">
                  <Image
                    src="/more.jpg"
                    alt="More Logo"
                    width={1920}
                    height={1080}
                    className="w-full h-full object-cover"
                  />
                </div>
                <h5 className="text-center text-3xl tracking-widest font-thin">
                Name 4
                </h5>
              </article>
              <article id="intec" className=" gap-2 md:col-span-1 col-span-2 md:row-start-2 row-start-2 flex flex-col w-full lg:w-64 hover:scale-110 hover:text-[rgba(12,204,60,0.6)] cursor-pointer">
              <div className="">
                  <Image
                    src="/more.jpg"
                    alt="More Logo"
                    width={1920}
                    height={1080}
                    className="w-full h-full object-cover"
                  />
                </div>
                <h5 className="text-center text-3xl tracking-widest font-thin">
                Name 5
                </h5>
              </article>
              <article id="intec" className=" gap-2 md:col-span-1 col-span-2 md:row-start-2 row-start-2 flex flex-col  w-full lg:w-64 hover:scale-110 hover:text-[rgba(12,204,60,0.6)] cursor-pointer">
              <div className="">
                  <Image
                    src="/more.jpg"
                    alt="More Logo"
                    width={500}
                    height={500}
                    className="w-full h-full object-cover"
                  />
                </div>
                <h5 className="text-center text-3xl tracking-widest font-thin">
                Name 6
                </h5>
              </article>
            </section>
          </article>
        </section>

        {/* Third section - Expertise */}
        <section className="bg-white w-full lg:h-screen shadow-section p-4" id="expertise">
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


        </section>

        {/* Section - Footer */}
        <section className="flex w-full lg:h-screen relative shadow-section" id="contact">
          <article className="w-[80%] md:w-[60%] lg:w-[30%] flex flex-col justify-center px-4 md:px-16 gap-10 bg-[#062132] text-left pt-48 pb-24">
            <h2 className="text-white font-extrabold text-5xl pb-6">
              Get in touch.
            </h2>
            <p className="text-lg text-[rgba(255,255,255,0.75)]">
              On sait depuis longtemps que travailleravec du texte lisible et contenant dusens est source de distractions, etempêche de se concentrer sur la miseen page elle-même
            </p>

            <div className="flex flex-col">
              <a href="#" className="text-lg font-thin text-[rgba(255,255,255,0.75)]">
                +19143386828
              </a>
              <a href="#" className="text-lg font-thin text-[rgba(255,255,255,0.75)]">
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
