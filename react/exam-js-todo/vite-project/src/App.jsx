import React, { useState } from "react";
import TodoForm from "./components/TodoForm";
import "./App.css";

function App() {
  const [todos, setTodos] = useState([
    { id: 1, text: "JavaScript 객체로 Todo 모델", done: true },
    { id: 2, text: "Todo CRUD 완성하기", done: false },
    { id: 3, text: "filterTodos 따라가 보기", done: false },
  ]);

  const [editing, setEditing] = useState(null);
  const [filter, setFilter] = useState("all");

  function nextId(list) {
    if (list.length === 0) return 1;
    return Math.max(...list.map((t) => t.id)) + 1;
  }

  const handleCreate = (text) => {
    setTodos((prev) => [...prev, { id: nextId(prev), text, done: false }]);
  };

  const handleUpdate = (updated) => {
    setTodos((prev) => prev.map((t) => (t.id === updated.id ? updated : t)));
    setEditing(null);
  };

  const handleDelete = (id) => {
    setTodos((prev) => prev.filter((t) => t.id !== id));
  };

  const handleToggle = (id) => {
    setTodos((prev) =>
      prev.map((t) => (t.id === id ? { ...t, done: !t.done } : t)),
    );
  };

  const filterTodos = () => {
    if (filter === "active") return todos.filter((t) => !t.done);
    if (filter === "done") return todos.filter((t) => t.done);
    return todos;
  };

  return (
    <div className="app">
      <main className="main">
        <div className="panel">
          <h2>{editing ? "할일 수정" : "할일 추가"}</h2>

          <TodoForm
            key={editing ? editing.id : "new"}
            editing={editing}
            onCreate={handleCreate}
            onUpdate={handleUpdate}
            onCancelEdit={() => setEditing(null)}
          />

          {/* 필터 버튼 */}
          <div className="filters">
            <button onClick={() => setFilter("all")}>전체</button>
            <button onClick={() => setFilter("active")}>미완료</button>
            <button onClick={() => setFilter("done")}>완료</button>
          </div>

          {/* 리스트 */}
          <ul className="todo-list">
            {filterTodos().map((todo) => (
              <li key={todo.id} className={todo.done ? "done" : ""}>
                <span onClick={() => handleToggle(todo.id)}>{todo.text}</span>

                <div className="actions">
                  <button onClick={() => setEditing(todo)}>수정</button>
                  <button onClick={() => handleDelete(todo.id)}>삭제</button>
                </div>
              </li>
            ))}
          </ul>
        </div>
      </main>
    </div>
  );
}

export default App;
