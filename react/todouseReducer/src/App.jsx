import React, { useReducer, useRef } from "react";
import Header from "./components/Header";
import "./App.css";
import List from "./components/List";
import Editor from "./components/Editor";

const mockData = [
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
  {
    id: 2,
    isDone: false,
    content: "노래 연습하기",
    date: new Date().getTime(),
  },
];

function reducer(state, action) {
  switch (action.type) {
    case "CREATE":
      return [action.newItem, ...state];
    case "UPDATE":
      return state.map((it) =>
        it.id === action.targetId ? { ...it, isDone: !it.isDone } : it,
      );
    case "DELETE":
      return state.filter((it) => it.id !== action.targetId);
    default:
      return state;
  }
}

const App = () => {
  // const [todos, setTodos] = useState(mockData);
  const [todo, dispatch] = useReducer(reducer, mockData);
  // //const [state, dispatch] = useReducer(reducer, initialstate);
  const idRef = useRef(3);

  const onCreate = (content) => {
    dispatch({
      type: "CREATE",
      newItem: {
        id: idRef.current,
        isDone: false,
        content: content,
        date: new Date().getTime(),
      },
    });
    idRef.current += 1;
  };

  const onUpdate = (targetId) => {
    dispatch({ type: "UPDATE", targetId });
  };
  const onDelete = (targetId) => {
    dispatch({ type: "DELETE", targetId });
  };
  return (
    <div>
      <div className="App">
        <Header />
        <Editor onCreate={onCreate} />
        <List todos={todo} onUpdate={onUpdate} onDelete={onDelete} />
      </div>
    </div>
  );
};

export default App;
