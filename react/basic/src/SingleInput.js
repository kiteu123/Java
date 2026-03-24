import React, { useState } from "react";

const SingleInput = () => {
  const [text, setText] = useState("");

  const onChange = (e) => {
    setText(e.target.value);
  };

  const onReset = () => {
    setText("");
  };
  return (
    <div>
      <input onChange={onChange} value={text} placeholder="내용을 입력하세요" />
      <button onClick={onReset}>초기화</button>
      <div>
        <b>값 : {text} </b>
      </div>
    </div>
  );
};

export default SingleInput;
