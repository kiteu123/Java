import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div className="container">
        {/* 로고 */}
        <Link className="navbar-brand" to="/">
          MyLogo
        </Link>

        {/* 모바일 버튼 */}
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navMenu"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        {/* 메뉴 */}
        <div className="collapse navbar-collapse" id="navMenu">
          <ul className="navbar-nav ms-auto">
            <li className="nav-item">
              <Link className="nav-link" to="/">
                홈
              </Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="/service">
                서비스
              </Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="/contact">
                문의
              </Link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
}

export default Navbar;
