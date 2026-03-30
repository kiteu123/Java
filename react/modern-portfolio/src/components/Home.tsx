import React from 'react';
import { motion } from 'motion/react';

const Home: React.FC = () => {
  return (
    <section id="home" className="hero-section min-h-screen flex items-center justify-center relative overflow-hidden bg-gradient-to-br from-indigo-900 via-purple-800 to-blue-900">
      <div className="container text-center text-white relative z-10">
        <motion.div
          initial={{ opacity: 0, y: 20 }}
          animate={{ opacity: 1, y: 0 }}
          transition={{ duration: 0.8 }}
        >
          <h5 className="text-xl md:text-2xl font-light mb-2 tracking-widest uppercase">안녕하세요, 저는</h5>
          <h1 className="display-1 font-bold mb-4 tracking-tight">홍길동 <span className="text-purple-400">입니다.</span></h1>
          <p className="lead text-xl md:text-2xl mb-5 text-gray-300">
            사용자 경험을 최우선으로 생각하는 <br className="md:hidden" />
            <span className="text-white font-semibold">프론트엔드 개발자</span>입니다.
          </p>
          <div className="flex flex-col sm:flex-row justify-center gap-4">
            <a href="#portfolio" className="btn btn-primary btn-lg px-5 py-3 rounded-full font-bold shadow-lg hover:scale-105 transition-transform">
              포트폴리오 보기
            </a>
            <a href="#contact" className="btn btn-outline-light btn-lg px-5 py-3 rounded-full font-bold hover:bg-white hover:text-purple-900 transition-all">
              연락하기
            </a>
          </div>
        </motion.div>
      </div>
      
      {/* Decorative elements */}
      <div className="absolute top-0 left-0 w-full h-full pointer-events-none opacity-20">
        <div className="absolute top-1/4 left-1/4 w-64 h-64 bg-purple-500 rounded-full blur-3xl"></div>
        <div className="absolute bottom-1/4 right-1/4 w-96 h-96 bg-blue-500 rounded-full blur-3xl"></div>
      </div>
    </section>
  );
};

export default Home;
