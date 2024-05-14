import React from 'react';
import Header from "./header";
import Footer from "./footer";
import Search from "./search";
import { Outlet } from 'react-router-dom';

export default function Main() {
  return (
    <div>
      <Header />
      <Footer />
      <Search />
      <Outlet />
    </div>
  );
}
