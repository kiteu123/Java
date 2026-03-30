import React, { useState } from "react";
import styles from "./Editor.module.css";

interface Props {
  onCreate: (content: string) => void;
}

function Editor({ onCreate }: Props) {
  const [content, setContent] = useState("");

  const onSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    if (!content.trim()) return;

    onCreate(content);
    setContent("");
  };

  return (
    <form className={styles.Editor} onSubmit={onSubmit}>
      <input
        value={content}
        onChange={(e) => setContent(e.target.value)}
        placeholder="할 일을 입력하세요"
      />
      <button type="submit">추가</button>
    </form>
  );
}

export default Editor;
