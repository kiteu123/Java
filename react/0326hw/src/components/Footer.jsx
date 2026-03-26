import React from "react";
import "./Footer.css";

const Footer = () => {
  return (
    <footer className="footer bg-dark text-white mt-5">
      <div className="container py-5">
        <div className="row">
          <div className="col-md-4 mb-3">
            <h5 className="fw-bold">Boot2</h5>
            <p className="small text-secondary">
              React + Bootstrap 기반 웹 데모 페이지입니다.
            </p>
          </div>

          <div className="col-md-4 mb-3">
            <h6 className="fw-bold">바로가기</h6>
            <ul className="list-unstyled">
              <li>
                <a href="/" className="footer-link">
                  홈
                </a>
              </li>
              <li>
                <a href="/service" className="footer-link">
                  서비스
                </a>
              </li>
              <li>
                <a href="/contact" className="footer-link">
                  문의
                </a>
              </li>
            </ul>
          </div>

          <div className="col-md-4 mb-3">
            <h6 className="fw-bold">연락</h6>
            <p className="small">hello@boot2.com</p>
            <p className="small">서울시 어딘가</p>
          </div>
        </div>

        <hr className="border-secondary" />

        <p className="text-center small mb-0 text-secondary">
          © 2026 Boot2. All rights reserved.
        </p>
      </div>
    </footer>
  );
};

export default Footer;
