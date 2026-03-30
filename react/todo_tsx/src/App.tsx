import React, { useRef, useState } from "react";
import Header from "./components/Header";
import Editor from "./components/Editor";
import List from "./components/List";
import type { Todo } from "./types/todo";
import styles from "./App.module.css";

const mockData: Todo[] = [
  {
    id: 0,
    isDone: false,
    content: "React 공부하기",
    date: new Date().getTime(),
  },
  {
    id: 1,
    isDone: false,
    content: "빨래하기",
    date: new Date().getTime(),
  },
];

const App = () => {
  const [todos, setTodos] = useState<Todo[]>(mockData);
  const idRef = useRef<number>(2);

  const onCreate = (content: string) => {
    const newTodo: Todo = {
      id: idRef.current++,
      isDone: false,
      content,
      date: new Date().getTime(),
    };
    setTodos((prev) => [newTodo, ...prev]);
  };

  const onUpdate = (id: number) => {
    setTodos((prev) =>
      prev.map((todo) =>
        todo.id === id ? { ...todo, isDone: !todo.isDone } : todo,
      ),
    );
  };

  const onRemove = (id: number) => {
    setTodos((prev) => prev.filter((todo) => todo.id !== id));
  };

  return (
    <div className={styles.App}>
      <Header />
      <Editor onCreate={onCreate} />
      <List todos={todos} onUpdate={onUpdate} onRemove={onRemove} />
    </div>
  );
};

export default App;
