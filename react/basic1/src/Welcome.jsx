import React from "react";

function Welcome(props) {
  return <h1 style={{ color: props.color }}>안녕하세요. {props.name}</h1>;
}

export default Welcome;
