import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";

import Problem1 from "./components/Problem1";
import Problem2 from "./components/Problem2";
import Problem3 from "./components/Problem3";
import Problem4 from "./components/Problem4";

function App() {
  return (
    <div className="container py-4">
      <h2 className="title">React 작업형 평가 — 참고 정답 (4문항)</h2>
      <Problem1 />
      <Problem2 />
      <Problem3 />
      <Problem4 />
    </div>
  );
}

export default App;
