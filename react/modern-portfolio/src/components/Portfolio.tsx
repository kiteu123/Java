import React from 'react';
import { FaGithub, FaExternalLinkAlt } from 'react-icons/fa';

interface Project {
  id: number;
  title: string;
  description: string;
  tags: string[];
  image: string;
  github: string;
  demo: string;
}

const Portfolio: React.FC = () => {
  const projects: Project[] = [
    {
      id: 1,
      title: 'E-Commerce Dashboard',
      description: '실시간 판매 데이터와 재고 관리를 위한 관리자 대시보드입니다. 차트와 그리드를 활용하여 데이터를 시각화했습니다.',
      tags: ['React', 'TypeScript', 'Recharts', 'Tailwind'],
      image: 'https://picsum.photos/seed/dashboard/600/400',
      github: 'https://github.com',
      demo: 'https://example.com',
    },
    {
      id: 2,
      title: 'Travel Booking App',
      description: '사용자가 여행지를 검색하고 숙소를 예약할 수 있는 서비스입니다. 지도 API와 연동하여 위치 정보를 제공합니다.',
      tags: ['Next.js', 'Firebase', 'Google Maps API'],
      image: 'https://picsum.photos/seed/travel/600/400',
      github: 'https://github.com',
      demo: 'https://example.com',
    },
    {
      id: 3,
      title: 'Social Media Platform',
      description: '사용자 간의 소통을 위한 소셜 미디어 플랫폼입니다. 실시간 채팅과 포스팅 기능을 구현했습니다.',
      tags: ['React', 'Redux', 'Node.js', 'Socket.io'],
      image: 'https://picsum.photos/seed/social/600/400',
      github: 'https://github.com',
      demo: 'https://example.com',
    },
  ];

  return (
    <section id="portfolio" className="py-20 bg-white">
      <div className="container">
        <div className="text-center mb-16">
          <h2 className="display-4 font-bold text-gray-900 mb-4">Portfolio</h2>
          <div className="w-20 h-1 bg-purple-600 mx-auto rounded-full"></div>
          <p className="text-lg text-gray-500 mt-4 max-w-2xl mx-auto">
            제가 지금까지 진행해온 주요 프로젝트들을 소개합니다. 
            각 프로젝트는 문제 해결 과정과 사용자의 편의성을 고려하여 제작되었습니다.
          </p>
        </div>

        <div className="row g-4">
          {projects.map((project) => (
            <div key={project.id} className="col-md-6 col-lg-4">
              <div className="portfolio-card card h-100 border-0 shadow-lg overflow-hidden rounded-2xl group">
                <div className="relative overflow-hidden">
                  <img 
                    src={project.image} 
                    alt={project.title} 
                    className="card-img-top transition-transform duration-500 group-hover:scale-110"
                    referrerPolicy="no-referrer"
                  />
                  <div className="absolute inset-0 bg-gradient-to-t from-black/80 to-transparent opacity-0 group-hover:opacity-100 transition-opacity duration-300 flex items-end p-4">
                    <div className="flex gap-3">
                      <a href={project.github} target="_blank" rel="noopener noreferrer" className="btn btn-light btn-sm rounded-full p-2">
                        <FaGithub size={20} />
                      </a>
                      <a href={project.demo} target="_blank" rel="noopener noreferrer" className="btn btn-light btn-sm rounded-full p-2">
                        <FaExternalLinkAlt size={18} />
                      </a>
                    </div>
                  </div>
                </div>
                <div className="card-body p-4">
                  <div className="flex flex-wrap gap-2 mb-3">
                    {project.tags.map((tag) => (
                      <span key={tag} className="badge bg-purple-100 text-purple-700 font-medium px-2 py-1 rounded">
                        {tag}
                      </span>
                    ))}
                  </div>
                  <h4 className="card-title font-bold text-xl mb-2">{project.title}</h4>
                  <p className="card-text text-gray-600 text-sm leading-relaxed">
                    {project.description}
                  </p>
                </div>
              </div>
            </div>
          ))}
        </div>
      </div>
    </section>
  );
};

export default Portfolio;
