import React, { createContext, useContext, useState, useMemo } from "react";

const AppContext = createContext();

export default function AppProvider({ children }) {
  const [count, setCount] = useState(0);
  const [user, setUser] = useState({
    name: "홍길동",
    age: 25,
  });

  const updateUserName = (name) => setUser((prev) => ({ ...prev, name }));

  const updateUserAge = (age) => setUser((prev) => ({ ...prev, age }));

  const incrementCount = () => setCount((prev) => prev + 1);
  const decrementCount = () => setCount((prev) => prev - 1);
  const resetCount = () => setCount(0);

  const value = useMemo(
    () => ({
      count,
      user,
      incrementCount,
      decrementCount,
      resetCount,
      updateUserName,
      updateUserAge,
    }),
    [count, user],
  );

  return <AppContext.Provider value={value}>{children}</AppContext.Provider>;
}

export function useAppContext() {
  const context = useContext(AppContext);
  if (!context) {
    throw new Error("useAppContext must be used within AppProvider");
  }
  return context;
}
