'use client'
import React from "react";
import "./page.css";
import "./components/transitionStyles.css";
import Main from "./components/main";
import Home from "./components/home";
import About from "./components/about";
import Service from "./components/service";
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';

export default function App() {

  return (
    <Router>
          <Routes>
            <Route path="/" element={<Main />}>
              <Route index element={<Home />} />
              <Route path="home" element={<Home />} />
              <Route path="about" element={<About />} />
              <Route path="service" element={<Service />} />
            </Route>
          </Routes>
    </Router>
  );
}