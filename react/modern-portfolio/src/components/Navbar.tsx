import React, { useState, useEffect } from 'react';

const Navbar: React.FC = () => {
  const [scrolled, setScrolled] = useState(false);
  const [isOpen, setIsOpen] = useState(false);

  useEffect(() => {
    const handleScroll = () => {
      if (window.scrollY > 50) {
        setScrolled(true);
      } else {
        setScrolled(false);
      }
    };
    window.addEventListener('scroll', handleScroll);
    return () => window.removeEventListener('scroll', handleScroll);
  }, []);

  const toggleNavbar = () => setIsOpen(!isOpen);

  return (
    <nav className={`navbar navbar-expand-lg fixed-top transition-all duration-300 ${scrolled ? 'bg-white shadow-md py-2' : 'bg-transparent py-4'}`}>
      <div className="container">
        <a className={`navbar-brand font-bold text-2xl ${scrolled ? 'text-purple-600' : 'text-white'}`} href="#home">
          PORTFOLIO
        </a>
        <button 
          className="navbar-toggler border-0 focus:outline-none" 
          type="button" 
          onClick={toggleNavbar}
          aria-expanded={isOpen}
        >
          <span className={`navbar-toggler-icon ${!scrolled && 'filter invert'}`}></span>
        </button>
        <div className={`collapse navbar-collapse justify-content-end ${isOpen ? 'show' : ''}`} id="navbarNav">
          <ul className="navbar-nav">
            {['Home', 'About', 'Portfolio', 'Contact'].map((item) => (
              <li className="nav-item" key={item}>
                <a 
                  className={`nav-link mx-2 font-medium hover:text-purple-500 transition-colors ${scrolled ? 'text-gray-700' : (isOpen ? 'text-gray-700' : 'text-white')}`} 
                  href={`#${item.toLowerCase()}`}
                  onClick={() => setIsOpen(false)}
                >
                  {item}
                </a>
              </li>
            ))}
          </ul>
        </div>
      </div>
      {/* Mobile background fix */}
      <style>{`
        @media (max-width: 991.98px) {
          .navbar-collapse.show {
            background: white;
            padding: 1rem;
            border-radius: 1rem;
            margin-top: 1rem;
            box-shadow: 0 10px 15px -3px rgba(0, 0, 0, 0.1);
          }
        }
      `}</style>
    </nav>
  );
};

export default Navbar;
