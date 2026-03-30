import React from "react";
import styles from "./TodoItem.module.css";

interface Props {
  id: number;
  isDone: boolean;
  content: string;
  date: number;
  onRemove: (id: number) => void;
  onUpdate: (id: number) => void;
}

function TodoItem({ id, isDone, content, date, onRemove, onUpdate }: Props) {
  return (
    <div className={styles.TodoItem}>
      <input type="checkbox" checked={isDone} onChange={() => onUpdate(id)} />

      <div
        className={isDone ? `${styles.content} ${styles.done}` : styles.content}
      >
        {content}
      </div>

      <div className={styles.date}>{new Date(date).toLocaleDateString()}</div>

      <button onClick={() => onRemove(id)}>삭제</button>
    </div>
  );
}

export default TodoItem;
