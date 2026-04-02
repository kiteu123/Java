import React from "react";
import MainContent from "./components/MainContent";
import Header from "./components/Header";
import "./App.css";
import AppProvider from "./context/AppContext";

function App() {
  return (
    <div>
      <AppProvider>
        <Header />
        <MainContent />
      </AppProvider>
    </div>
  );
}

export default App;
