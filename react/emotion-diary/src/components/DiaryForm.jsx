import React, { useState } from "react";
import EmotionPicker from "./EmotionPicker";

function DiaryForm({ onSubmit }) {
  const [emotion, setEmotion] = useState("happy");
  const [content, setContent] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!content.trim()) {
      alert("내용을 입력해주세요!");
      return;
    }

    onSubmit({ emotion, content });
    setContent("");
    setEmotion("happy");
  };

  return (
    <form className="diary-form" onSubmit={handleSubmit}>
      <h3>오늘의 감정</h3>
      <EmotionPicker value={emotion} onChange={setEmotion} />

      <textarea
        placeholder="오늘 있었던 일을 자유롭게 적어보세요..."
        value={content}
        onChange={(e) => setContent(e.target.value)}
      />

      <button type="submit">저장하기</button>
    </form>
  );
}

export default DiaryForm;
