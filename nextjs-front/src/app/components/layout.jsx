import React from 'react';
import Header from "./header.jsx";
import Footer from "./footer";
import Search from "./search.jsx";
import { Outlet } from 'react-router-dom';

export default function Layout() {
  return (
    <div>
      <Header />
      <Footer />
      <Search />
      <Outlet />
    </div>
  );
}
