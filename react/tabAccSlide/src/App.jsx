import React from "react";
import TabMenu from "../components/TabMenu";
import "./App.css";
import AccordionMenu from "../components/AccordionMenu";

function App() {
  return (
    <div className="app">
      <div className="app-container">
        <h1>리액트 탭 & 아코디언</h1>
        <TabMenu />
        <AccordionMenu />
      </div>
    </div>
  );
}

export default App;
