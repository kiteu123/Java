import React, { useRef, useState } from "react";
import "./Editor.css";

function Editor({ onCreate }) {
  const [content, setContent] = useState("");
  const inputRef = useRef();
  const onChangeContent = (e) => {
    setContent(e.target.value);
  };

  const onkeyDown = (e) => {
    if (e.keyCode === 13) {
      onsubmit();
    }
  };
  const onsubmit = () => {
    if (content === "") {
      inputRef.current.focus();
      return;
    }
    onCreate(content);
    setContent("");
  };
  return (
    <div className="Editor">
      <input
        ref={inputRef}
        onChange={onChangeContent}
        onKeyDown={onkeyDown}
        value={content}
        placeholder="새로운 Todo..."
      />
      <button onClick={onsubmit}>추가</button>
    </div>
  );
}

export default Editor;
