import React, { useState } from "react";

function Problem2() {
  const [text, setText] = useState("");
  const [list, setList] = useState([]);

  const addItem = () => {
    if (!text.trim()) return;
    setList([...list, text]);
    setText("");
  };

  const deleteItem = (idx) => {
    setList(list.filter((_, i) => i !== idx));
  };

  return (
    <div className="card-box">
      <h5>2번 — 리스트 렌더링 + 삭제</h5>
      <div className="row-inline">
        <input
          value={text}
          onChange={(e) => setText(e.target.value)}
          placeholder="할 일"
        />
        <button onClick={addItem}>추가</button>
      </div>
      <ul>
        {list.map((item, idx) => (
          <li key={idx}>
            {item}
            <button
              className="btn btn-sm btn-danger ms-2"
              onClick={() => deleteItem(idx)}
            >
              삭제
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Problem2;
