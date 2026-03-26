import React from "react";
import { useNavigate } from "react-router-dom";

const Service = () => {
  const navigate = useNavigate();

  return (
    <div className="container py-5 text-center">
      {/* 상단 타이틀 */}
      <span className="badge bg-primary mb-2">Services</span>
      <h1 className="fw-bold mb-3">서비스 소개</h1>
      <p className="text-muted mb-5">
        Boot2 예제에서 사용한 기술 스택을 플랜 형태로 정리했습니다.
      </p>

      {/* 카드 영역 */}
      <div className="row g-4 mb-5">
        {/* 스타터 */}
        <div className="col-md-4">
          <div className="card h-100 border-0 shadow-sm p-4 text-start">
            <h5 className="text-muted">스타터</h5>
            <h2 className="fw-bold text-primary">₩0</h2>
            <p className="small text-muted">학습용 기본 템플릿</p>
            <hr />

            <ul className="list-unstyled">
              <li>✔ 반응형 레이아웃</li>
              <li>✔ 네비 + 푸터</li>
              <li>✔ 슬라이드 1종</li>
            </ul>
          </div>
        </div>

        {/* 프로 (추천) */}
        <div className="col-md-4">
          <div className="card h-100 border-primary shadow p-4 text-start position-relative">
            <span className="badge bg-primary position-absolute top-0 start-50 translate-middle mt-2">
              추천
            </span>

            <h5 className="text-muted">프로</h5>
            <h2 className="fw-bold text-primary">문의</h2>
            <p className="small text-muted">실서비스에 가까운 구성</p>
            <hr />

            <ul className="list-unstyled">
              <li>✔ 페이지 분리 라우팅</li>
              <li>✔ 이미지 카드</li>
              <li>✔ 슬라이드 커스텀</li>
            </ul>
          </div>
        </div>

        {/* 엔터프라이즈 */}
        <div className="col-md-4">
          <div className="card h-100 border-0 shadow-sm p-4 text-start">
            <h5 className="text-muted">엔터프라이즈</h5>
            <h2 className="fw-bold text-primary">별도</h2>
            <p className="small text-muted">팀 단위 커스터마이징</p>
            <hr />

            <ul className="list-unstyled">
              <li>✔ API 연동</li>
              <li>✔ 인증</li>
              <li>✔ 배포 파이프라인</li>
            </ul>
          </div>
        </div>
      </div>

      {/* 하단 CTA */}
      <div className="bg-light p-5 rounded-3 mt-5">
        <h3 className="fw-bold">다음 단계가 궁금하다면</h3>
        <p className="text-muted">
          문의 페이지에서 간단한 폼 예제도 확인할 수 있습니다.
        </p>

        <button
          className="btn btn-primary btn-lg px-5"
          onClick={() => navigate("/contact")}
        >
          문의 페이지로 이동
        </button>
      </div>
    </div>
  );
};

export default Service;
