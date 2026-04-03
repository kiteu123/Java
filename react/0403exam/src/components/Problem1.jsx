import React, { useState } from "react";

function Problem1() {
  const [name, setName] = useState("");
  const [age, setAge] = useState("");
  const [result, setResult] = useState(null);

  const handleSubmit = () => {
    if (!name || !age) {
      setResult("값을 입력하세요");
      return;
    }
    setResult(`이름: ${name} / 나이: ${age}`);
  };

  return (
    <div className="card-box">
      <h5>1번 — 상태 관리 + 입력폼</h5>
      <input
        value={name}
        onChange={(e) => setName(e.target.value)}
        placeholder="이름"
      />
      <input
        value={age}
        onChange={(e) => setAge(e.target.value)}
        placeholder="나이"
      />
      <button onClick={handleSubmit}>확인</button>
      {result && <p className="result">{result}</p>}
    </div>
  );
}

export default Problem1;
