import React from "react";
import styles from "./Header.module.css";

function Header() {
  const today = new Date();

  return (
    <div className={styles.Header}>
      <h3>오늘은 📅</h3>
      <h1>{today.toDateString()}</h1>
    </div>
  );
}

export default Header;
