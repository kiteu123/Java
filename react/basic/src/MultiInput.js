import React, { useState } from "react";

const MultiInput = () => {
  const [inputs, setInputs] = useState({
    username: "",
    nickname: "",
    email: "",
  });

  const { username, nickname, email } = inputs;

  const onChange = (e) => {
    const { value, name } = e.target;

    setInputs({
      ...inputs,
      [name]: value,
    });
  };
  const onReset = () => {
    setInputs({
      username: "",
      nickname: "",
      email: "",
    });
  };
  return (
    <div>
      <input
        name="username"
        placeholder="이름"
        onChange={onChange}
        value={username}
      />
      <input
        name="nickname"
        placeholder="닉네임"
        onChange={onChange}
        value={nickname}
      />
      <input
        name="email"
        placeholder="이메일"
        onChange={onChange}
        value={email}
      />
      <button onClick={onReset}>초기화</button>
      <div>
        <b>
          값 : {username}({nickname} - {email}){" "}
        </b>
      </div>
    </div>
  );
};

export default MultiInput;
