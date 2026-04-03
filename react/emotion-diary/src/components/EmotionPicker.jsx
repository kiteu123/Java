import React from "react";
import { EMOTIONS } from "../constants";

function EmotionPicker({ value, onChange }) {
  return (
    <div className="emotion-picker">
      {EMOTIONS.map((emo) => (
        <button
          key={emo.id}
          type="button"
          className={`emotion-btn ${value === emo.id ? "active" : ""}`}
          style={{
            backgroundColor: value === emo.id ? emo.color : "#f3f4f6",
          }}
          onClick={() => onChange(emo.id)}
        >
          <span>{emo.emoji}</span>
          <span>{emo.label}</span>
        </button>
      ))}
    </div>
  );
}

export default EmotionPicker;
