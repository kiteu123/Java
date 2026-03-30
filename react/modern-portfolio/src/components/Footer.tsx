import React from 'react';
import { FaGithub, FaLinkedin, FaTwitter, FaInstagram } from 'react-icons/fa';

const Footer: React.FC = () => {
  return (
    <footer className="py-12 bg-gray-900 text-white">
      <div className="container">
        <div className="row align-items-center">
          <div className="col-md-4 text-center text-md-start mb-4 mb-md-0">
            <h3 className="font-bold text-2xl mb-2 text-purple-400">PORTFOLIO</h3>
            <p className="text-gray-400 mb-0">© 2026 Hong Gil Dong. All rights reserved.</p>
          </div>
          
          <div className="col-md-4 text-center mb-4 mb-md-0">
            <div className="flex justify-center gap-4">
              <a href="https://github.com" className="text-gray-400 hover:text-white transition-colors text-2xl">
                <FaGithub />
              </a>
              <a href="https://linkedin.com" className="text-gray-400 hover:text-white transition-colors text-2xl">
                <FaLinkedin />
              </a>
              <a href="https://twitter.com" className="text-gray-400 hover:text-white transition-colors text-2xl">
                <FaTwitter />
              </a>
              <a href="https://instagram.com" className="text-gray-400 hover:text-white transition-colors text-2xl">
                <FaInstagram />
              </a>
            </div>
          </div>
          
          <div className="col-md-4 text-center text-md-end">
            <p className="text-gray-400 mb-1">Designed by Hong Gil Dong</p>
            <p className="text-gray-500 text-sm mb-0">Built with React & Bootstrap</p>
          </div>
        </div>
      </div>
    </footer>
  );
};

export default Footer;
