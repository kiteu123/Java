import React from "react";
import { EMOTIONS } from "../constants";

function DiaryList({ entries, onDelete }) {
  const getEmotion = (id) => EMOTIONS.find((e) => e.id === id);

  if (entries.length === 0) {
    return <p>아직 작성된 일기가 없습니다.</p>;
  }

  return (
    <div className="diary-list">
      {entries.map((entry) => {
        const emo = getEmotion(entry.emotion);

        return (
          <div
            key={entry.id}
            className="diary-item"
            style={{ borderLeft: `5px solid ${emo.color}` }}
          >
            <div className="diary-header">
              <span>
                {emo.emoji} {emo.label}
              </span>
              <span>{new Date(entry.createdAt).toLocaleDateString()}</span>
            </div>

            <p className="diary-content">{entry.content}</p>

            <button onClick={() => onDelete(entry.id)}>삭제</button>
          </div>
        );
      })}
    </div>
  );
}

export default DiaryList;
