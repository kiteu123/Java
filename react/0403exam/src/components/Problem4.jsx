import React from "react";

function ProductItem({ product }) {
  return (
    <div className="product-item">
      {product.name} - {product.price}원
    </div>
  );
}

function Problem4() {
  const products = [
    { id: 1, name: "노트북", price: 1000000 },
    { id: 2, name: "마우스", price: 20000 },
  ];

  return (
    <div className="card-box">
      <h5>4번 — 컴포넌트 분리 + props</h5>
      {products.map((p) => (
        <ProductItem key={p.id} product={p} />
      ))}
    </div>
  );
}

export default Problem4;
