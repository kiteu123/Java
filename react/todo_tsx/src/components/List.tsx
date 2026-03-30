import React, { useState } from "react";
import TodoItem from "./TodoItem";
import type { Todo } from "../types/todo";
import styles from "./List.module.css";

interface Props {
  todos: Todo[];
  onRemove: (id: number) => void;
  onUpdate: (id: number) => void;
}

function List({ todos, onRemove, onUpdate }: Props) {
  const [search, setSearch] = useState("");

  const filteredTodos = todos.filter((todo) =>
    todo.content.toLowerCase().includes(search.toLowerCase()),
  );

  return (
    <div className={styles.List}>
      <h4>Todo List</h4>

      <input
        className={styles.search}
        value={search}
        onChange={(e) => setSearch(e.target.value)}
        placeholder="검색어를 입력하세요."
      />

      <div className={styles.todos_wrapper}>
        {filteredTodos.length === 0 ? (
          <div>검색 결과 없음</div>
        ) : (
          filteredTodos.map((todo) => (
            <TodoItem
              key={todo.id}
              {...todo}
              onRemove={onRemove}
              onUpdate={onUpdate}
            />
          ))
        )}
      </div>
    </div>
  );
}

export default List;
