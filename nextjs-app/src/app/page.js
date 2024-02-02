import React from "react";
import Header from "./components/header";
import Image from "next/image";



const App = () => {
  return (
    <div>

      <header>
        <Header />
      </header> 
      
      <main className="flex flex-col gap-3 px-1">

        {/* First section - Home */}
        <section className="flex lg:h-auto h-[100vh] md:h-[600px] relative shadow-section">

          <article className="w-[60%] md:w-[40%] lg:w-[30%] h-auto flex flex-col justify-center px-4 md:px-1 text-center gap-5 md:gap-10 bg-white">
            <h2 className="text-[rgba(0,0,0,0.6)] font-extrabold md:text-3xl text-2xl pb-5">
              We’re here to help you  
            </h2>
            <p className="md:text-4xl text-3xl">
              Lorem Ipsum est simplement du faux text.
            </p>
          </article>    

          <div className="w-[40%] md:w-[60%] lg:w-[70%] h-100 opacity-40">
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
        <section className="bg-[#062132] w-full py-10 shadow-section text-white">  
          <header className="text-center">
            <h1 className="text-5xl">About Us</h1>
          </header>
          <article className="mt-14 flex lg:flex-row flex-col-reverse lg:items-start items-center justify-center gap-4 lg:gap-28">
            <div className="mt-16">
              <Image
                src="/tech-img.svg"
                alt="Vercel Logo"
                width={350}
                height={350}
                className="md:px-0 px-4"
              />
            </div>
            <section className="grid grid-cols-2 w-[100%] lg:w-[50%] gap-16 text-center">
              <article className="col-span-2 lg:col-start-2 flex flex-col gap-2 w-full lg:w-64">
                <h5 className="text-center text-4xl tracking-widest font-thin">
                  Who we are
                </h5>
                <p className="leading-7 text-[rgba(255,255,255,0.55)] text-lg">     
                On sait depuis longtempsque travailler avec du textelisible et contenant du sensest source de distractions,et empêche de seconcentrer sur la mise enpage elle-même.
                </p>
              </article>
              <article className="col-start-1 md:col-span-1 col-span-2 flex flex-col gap-2 -mt-0 lg:-mt-[100px] w-full lg:w-64 md:row-start-2 row-start-3">
                <h5 className="text-center text-4xl tracking-widest font-thin lg:text-start">
                  Mission
                </h5>
                <p className="leading-7 text-[rgba(255,255,255,0.55)] text-lg">
                On sait depuis longtempsque travailler avec du textelisible et contenant du sensest source de distractions,et empêche de seconcentrer sur la mise enpage elle-même.
                </p>  
              </article>
              <article className="col-start-1 md:col-start-2 md:col-span-1 col-span-2 md:row-start-2 row-start-2 flex flex-col gap-2 w-full lg:w-64">
                <h5 className="text-center text-4xl tracking-widest font-thin">
                  Vision
                </h5>
                <p className="leading-7 text-[rgba(255,255,255,0.55)] text-lg">
                  On sait depuis longtemps
                  que travailler avec du texte
                  lisible et contenant du sens
                  est source de distractions,
                  et empêche de se.
                </p>
              </article>
            </section>
          </article>
        </section>

        {/* Third section - Expertise */}
        <section className="bg-white w-full shadow-section
          flex flex-row"> 


        <div className="flex flex-col w-[35%]">
          <header className="h-[70px] w-full pl-20 pt-10">
            <h1 className="text-5xl">
              Expertise
            </h1>
          </header>

          <div className="flex flex-col gap-24 mt-10 px-6">
            <article className="row-start-2 flex flex-col gap-2">
              <h5 className="text-[1.3rem] tracking-wider font-bold">
                HI7 interoperability
              </h5>
              <p className="font-black text-[18px] tracking-wider leading-7">
                On sait depuis longtemps que travailleravec du texte lisible et contenant du sensest source de distractions, et empêche dese concentrer sur la mise en page ellemême.
              </p>
            </article>
            <article className="row-start-2 flex flex-col gap-2">
              <h5 className="text-[1.3rem] tracking-wider font-bold">
                HI7 interoperability
              </h5>
              <p className="font-black text-[18px] tracking-wider leading-7">
                On sait depuis longtemps que travailleravec du texte lisible et contenant du sensest source de distractions, et empêche dese concentrer sur la mise en page ellemême.
              </p>
            </article>
          </div>

        </div>

        <div className="w-[30%]">
          <Image 
            src='/code-banner.jpg' 
            alt='code banner'
            width={1920}
            height={1080}
          />
        </div>

        <div className="w-[35%] ">
          <header className="h-[70px] w-full">
          </header>
          <div className="flex flex-col gap-24 mt-10 px-6">
            <article className="row-start-2 flex flex-col gap-2">
                <h5 className="text-[1.3rem] tracking-wider font-bold">
                  HI7 interoperability
                </h5>
                <p className="font-black text-[18px] tracking-wider leading-7">
                  On sait depuis longtemps que travailleravec du texte lisible et contenant du sensest source de distractions, et empêche dese concentrer sur la mise en page ellemême.
                </p>
              </article>
              <article className="row-start-2 flex flex-col gap-2">
                <h5 className="text-[1.3rem] tracking-wider font-bold">
                  HI7 interoperability
                </h5>
                <p className="font-black text-[18px] tracking-wider leading-7">
                  On sait depuis longtemps que travailleravec du texte lisible et contenant du sensest source de distractions, et empêche dese concentrer sur la mise en page ellemême.
                </p>
            </article>
          </div>
        </div>
        </section>

        {/* -I dont know howtosay "cuarto" in english- section - Footer */}
        <section className="flex w-full h-full relative shadow-section">
          <article className="w-[40%] flex flex-col justify-center px-16 gap-10 bg-[#062132] text-left pt-48 pb-24">
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

          <div className="w-[60%] h-100 opacity-40">
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

export default App;
