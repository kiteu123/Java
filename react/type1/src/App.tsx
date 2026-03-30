import React, { useState } from "react";
import "./App.css";

interface Person {
  name: string;
  age: number;
  email?: string;
}

function App() {
  const [result, setResult] = useState<number>(0);

  const numbers: number[] = [1, 2, 3, 4, 5];
  const fruits: Array<string> = ["사과", "바나나", "오렌지"];

  const person1: Person = {
    name: "홍길동",
    age: 26,
  };

  const person2: Person = {
    name: "김철수",
    age: 25,
    email: "kiteu@naver.com",
  };

  const calculateSum = () => {
    const sum = numbers.reduce((acc, cur) => acc + cur, 0);
    setResult(sum);
  };

  return (
    <div className="app">
      <header>
        <h1>🎈 React TypeScript 예제</h1>
      </header>

      <div className="container">
        {/* 기본 타입 */}
        <div className="card">
          <h2>1. 기본 타입</h2>
          <div className="content">
            <p>
              <strong>name : </strong>TypeScript
            </p>
            <p>
              <strong>age : </strong>13
            </p>
            <p>
              <strong>isActive : </strong>true
            </p>
          </div>
        </div>

        {/* 배열 */}
        <div className="card">
          <h2>2. 배열</h2>
          <div className="content">
            <p>
              <strong>numbers : </strong>
              {numbers.join(", ")}
            </p>
            <p>
              <strong>fruits : </strong>
              {fruits.join(", ")}
            </p>
          </div>
        </div>

        {/* 객체 */}
        <div className="card">
          <h2>3. 객체 타입</h2>

          <div className="person-card">
            <h3>{person1.name}</h3>
            <p>나이: {person1.age}</p>
          </div>

          <div className="person-card">
            <h3>{person2.name}</h3>
            <p>나이: {person2.age}</p>
            <p>이메일: {person2.email}</p>
          </div>
        </div>

        {/* 계산 */}
        <div className="card">
          <h2>4. 계산 (useState)</h2>

          <button className="calculate-btn" onClick={calculateSum}>
            합계 계산
          </button>

          <div className="result-box">결과: {result}</div>
        </div>

        {/* 상태 표시 */}
        <div className="card">
          <h2>5. 상태 뱃지</h2>

          <div className="status-badges">
            <span className="badge pending">대기중</span>
            <span className="badge approved">승인됨</span>
            <span className="badge rejected">거절됨</span>
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
