import React from "react";
import NavLink from 'next/link';
import Image from "next/image";

const Header = () => {   
  return (
      <header className="py-4 px-14 flex absolute items-center justify-between w-full z-50 top-0">
        <div className="flex items-center">
          <a href="/" className="text-2xl font-bold text-black">
          <Image
                src="/vercel.svg"
                alt="Vercel Logo"
                width={150}
                height={150}
              />
          </a>
        </div>
        <nav className="flex items-center gap-4">
          <button>
            <Image
              src="/menu.png"
              alt="Vercel Logo"
              width={55}
              height={55}
            />
          </button>
        </nav>
      </header>
  );
};

export default Header;