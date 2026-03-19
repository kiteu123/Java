import React from "react";
import "./App.css";
import Card from "./Card";

export default function App() {
  const cards = [
    {
      title: "봄날의 꽃",
      text: "따뜻한 봄바람에 흩날리는 꽃잎. 계절의 아름다움을 담았습니다.",
      image: "https://picsum.photos/id/101/400/300",
    },
    {
      title: "숲속의 오솔길",
      text: "푸른 나무 사이로 이어진 작은 길. 자연의 여유를 느껴보세요.",
      image: "https://picsum.photos/id/102/400/300",
    },
    {
      title: "바다의 파도",
      text: "푸른 바다와 하늘. 시원한 바닷바람이 상쾌함을 선사합니다.",
      image: "https://picsum.photos/id/103/400/300",
    },
    {
      title: "저녁 노을",
      text: "하늘을 물들인 석양. 하루를 마무리하는 평화로운 순간입니다.",
      image: "https://picsum.photos/id/104/400/300",
    },
    {
      title: "따뜻한 커피",
      text: "향긋한 커피 한 잔. 여유로운 오후를 위한 작은 선물.",
      image: "https://picsum.photos/id/109/400/300",
    },
    {
      title: "맑은 호수",
      text: "잔잔한 물결과 투명한 물. 마음이 차분해지는 풍경입니다.",
      image: "https://picsum.photos/id/106/400/300",
    },
    {
      title: "정원의 나비",
      text: "꽃 위를 날아다니는 나비. 작은 생명의 아름다움입니다.",
      image: "https://picsum.photos/id/107/400/300",
    },
    {
      title: "별이 빛나는 밤",
      text: "고요한 밤하늘의 별들. 꿈꾸는 시간을 선사합니다.",
      image: "https://picsum.photos/id/108/400/300",
    },
  ];

  return (
    <div className="App">
      <header className="App-header">
        <p>자연과 일상의 아름다운 순간들</p>
      </header>

      <main className="App-main">
        <div className="cards-container">
          {cards.map((card, index) => (
            <Card
              key={index}
              title={card.title}
              text={card.text}
              image={card.image}
            />
          ))}
        </div>
      </main>
    </div>
  );
}
