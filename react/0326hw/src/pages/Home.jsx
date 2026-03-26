import "./Home.css";
import { useNavigate } from "react-router-dom";

function Home() {
  const navigate = useNavigate();
  return (
    <div>
      <div id="carouselExample" className="carousel slide">
        {/* 🔥 인디케이터 */}
        <div className="carousel-indicators">
          <button
            type="button"
            data-bs-target="#heroCarousel"
            data-bs-slide-to="0"
            className="active"
          ></button>
          <button
            type="button"
            data-bs-target="#heroCarousel"
            data-bs-slide-to="1"
          ></button>
          <button
            type="button"
            data-bs-target="#heroCarousel"
            data-bs-slide-to="2"
          ></button>
        </div>
        <div className="carousel-inner">
          <div className="carousel-item active">
            <img
              src="https://images.unsplash.com/photo-1521737604893-d14cc237f11d"
              className="d-block w-100"
              alt="img1"
            />
            <div className="carousel-caption text-start">
              <h2 className="fw-bold">슬릭(Slick) 슬라이더</h2>
              <p>메인 배너 자동 재생 · 화살표 · 인디케이터</p>

              <button
                className="btn btn-primary mt-2"
                onClick={() => navigate("/contact")}
              >
                문의하기 →
              </button>
            </div>
          </div>

          <div className="carousel-item">
            <img
              src="https://images.unsplash.com/photo-1498050108023-c5249f4df085"
              className="d-block w-100"
              alt="img2"
            />
            <div className="carousel-caption text-start">
              <h2 className="fw-bold">React 프로젝트</h2>
              <p>컴포넌트 기반 UI 구성</p>

              <button
                className="btn btn-primary mt-2"
                onClick={() => navigate("/service")}
              >
                서비스 보기 →
              </button>
            </div>
          </div>

          <div className="carousel-item">
            <img
              src="https://images.unsplash.com/photo-1551288049-bebda4e38f71"
              className="d-block w-100"
              alt="img3"
            />
            <div className="carousel-caption text-start">
              <h2 className="fw-bold">Bootstrap 활용</h2>
              <p>빠르고 반응형 UI 개발</p>

              <button
                className="btn btn-primary mt-2"
                onClick={() => navigate("/service")}
              >
                자세히 →
              </button>
            </div>
          </div>
        </div>

        <button
          className="carousel-control-prev"
          type="button"
          data-bs-target="#carouselExample"
          data-bs-slide="prev"
        >
          <span className="carousel-control-prev-icon"></span>
        </button>

        <button
          className="carousel-control-next"
          type="button"
          data-bs-target="#carouselExample"
          data-bs-slide="next"
        >
          <span className="carousel-control-next-icon"></span>
        </button>
      </div>

      <div className="container mt-5">
        <div className="row">
          {[1, 2, 3].map((item) => (
            <div className="col-md-4" key={item}>
              <div className="card mb-4 shadow-sm">
                <img
                  src={`https://picsum.photos/400/300?random=${item}`}
                  className="card-img-top"
                  alt="card"
                />
                <div className="card-body">
                  <h5 className="card-title">카드 {item}</h5>
                  <p className="card-text">
                    간단한 설명이 들어가는 영역입니다.
                  </p>
                  <button
                    className="btn btn-outline-primary btn-hover"
                    onClick={() => navigate("/contact")}
                  >
                    자세히 보기
                  </button>
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
      <div className="container my-5">
        <div className="row align-items-center">
          <div className="col-md-6">
            <h3 className="fw-bold mb-3">Boot2 데모에 오신 것을 환영합니다</h3>

            <p className="text-muted">
              상단 네비게이션, 슬라이드, 카드, 푸터가 포함된 페이지입니다. 아래
              버튼을 통해 서비스 및 문의 페이지로 이동할 수 있습니다.
            </p>

            <button
              className="btn btn-primary me-2"
              onClick={() => navigate("/service")}
            >
              서비스 소개
            </button>

            <button
              className="btn btn-outline-secondary"
              onClick={() => navigate("/contact")}
            >
              문의하기
            </button>
          </div>

          <div className="col-md-6">
            <img
              src="https://images.unsplash.com/photo-1521737604893-d14cc237f11d"
              className="img-fluid rounded shadow"
              alt="team"
            />
          </div>
        </div>
      </div>
    </div>
  );
}

export default Home;
