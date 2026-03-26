import React, { useState } from "react";
import { useNavigate } from "react-router-dom";

const Contact = () => {
  const navigate = useNavigate();

  const [form, setForm] = useState({
    name: "",
    email: "",
    message: "",
  });

  // 입력값 변경
  const handleChange = (e) => {
    setForm({
      ...form,
      [e.target.name]: e.target.value,
    });
  };

  // 제출
  const handleSubmit = (e) => {
    e.preventDefault();

    alert("문의가 정상적으로 제출되었습니다! (데모)");

    // 초기화
    setForm({
      name: "",
      email: "",
      message: "",
    });
  };

  return (
    <div className="container py-5">
      <div className="row g-5">
        {/* 🔥 왼쪽 */}
        <div className="col-md-5">
          <h2 className="fw-bold mb-3">문의하기</h2>

          <p className="text-muted">
            데모 폼입니다. 제출해도 실제 서버로 전송되지 않으며, 성공 메시지만
            표시됩니다.
          </p>

          <div className="mt-4">
            <p className="fw-bold mb-1">Boot2 데모 스튜디오</p>
            <p className="mb-1">02-0000-0000</p>
            <p className="text-muted">평일 09:00 – 18:00</p>
          </div>

          {/* 버튼 */}
          <div className="mt-4 d-flex gap-2">
            <button
              className="btn btn-outline-secondary"
              onClick={() => navigate("/service")}
            >
              ← 서비스 소개
            </button>

            <button
              className="btn btn-outline-dark"
              onClick={() => navigate("/")}
            >
              홈으로
            </button>
          </div>
        </div>

        {/* 🔥 오른쪽 (폼) */}
        <div className="col-md-7">
          <div className="card shadow-sm p-4">
            <form onSubmit={handleSubmit}>
              <div className="mb-3 text-start">
                <label className="form-label">이름</label>
                <input
                  type="text"
                  className="form-control"
                  name="name"
                  value={form.name}
                  onChange={handleChange}
                  required
                  placeholder="John Doe"
                />
              </div>

              <div className="mb-3 text-start">
                <label className="form-label">이메일</label>
                <input
                  type="email"
                  className="form-control"
                  name="email"
                  value={form.email}
                  onChange={handleChange}
                  required
                  placeholder="johndoe@example.com"
                />
              </div>
              <div className="mb-3 text-start">
                <label className="form-label">문의 내용</label>
                <textarea
                  className="form-control"
                  rows="5"
                  name="message"
                  value={form.message}
                  onChange={handleChange}
                  required
                  placeholder="문의 내용을 입력해주세요 . . ."
                ></textarea>
              </div>

              <button type="submit" className="btn btn-primary w-100">
                보내기
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Contact;
