import React, { useState } from "react";

function Problem3() {
  const [isLogin, setIsLogin] = useState(false);

  return (
    <div className="card-box">
      <h5>3번 — 조건부 렌더링 (로그인)</h5>
      <button onClick={() => setIsLogin(!isLogin)}>
        {isLogin ? "로그아웃" : "로그인"}
      </button>
      <p className="result">{isLogin ? "환영합니다" : "로그인이 필요합니다"}</p>
    </div>
  );
}

export default Problem3;
