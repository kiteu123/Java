import React from "react";
import "./Card.css";

const Card = ({ title, text, image }) => {
  return (
    <div className="card">
      <div className="card-image">
        <img src={image} alt={title} />
      </div>
      <div className="card-content">
        <h3 className="card-title">{title}</h3>
        <p className="card-text">{text}</p>
      </div>
    </div>
  );
};

export default Card;
