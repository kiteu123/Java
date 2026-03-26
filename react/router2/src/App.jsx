import React from "react";
import {Routes, Route, Link} from 'react-router-dom'
import Home from "../pages/Home";
import ProductList from "../pages/ProductList";
import ProductDetail from "../pages/ProductDetail";

function App() {
  return (
    <div>
      <nav>
        <Link to='/'>홈</Link> | {' '}
        <Link to='/products'>상품목록</Link>
       </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/products" element={<ProductList />} />
        <Route path="/products/:id" element={<ProductDetail />} />
      </Routes>
    </div>
  );
}

export default App;


