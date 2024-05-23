'use client'
import React from "react";
import "./components/page.css";
import "./components/transitionStyles.css"
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Layout from "./components/layout";
import Home from "./components/home";
import About from "./components/about";
// import Service from "./components/service";
import Capabilities from "./components/capabilities";
import Contact from "./components/contact";

export default function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Home />} />
          <Route path="home" element={<Home />} />
          <Route path="about" element={<About />} />
          {/* <Route path="service" element={<Service />} /> */}
          <Route path="capabilities" element={<Capabilities />} />
          <Route path="contact" element={<Contact />} />
        </Route>
      </Routes>
    </Router>
  );
}
