import React from 'react';
import { FaReact, FaHtml5, FaCss3Alt, FaJs, FaBootstrap, FaGithub } from 'react-icons/fa';
import { SiTypescript, SiTailwindcss, SiNextdotjs } from 'react-icons/si';

const About: React.FC = () => {
  const skills = [
    { name: 'React', icon: <span className="text-blue-400"><FaReact /></span> },
    { name: 'TypeScript', icon: <span className="text-blue-600"><SiTypescript /></span> },
    { name: 'JavaScript', icon: <span className="text-yellow-400"><FaJs /></span> },
    { name: 'HTML5', icon: <span className="text-orange-500"><FaHtml5 /></span> },
    { name: 'CSS3', icon: <span className="text-blue-500"><FaCss3Alt /></span> },
    { name: 'Tailwind', icon: <span className="text-teal-400"><SiTailwindcss /></span> },
    { name: 'Bootstrap', icon: <span className="text-purple-600"><FaBootstrap /></span> },
    { name: 'Next.js', icon: <span className="text-black"><SiNextdotjs /></span> },
    { name: 'GitHub', icon: <span className="text-gray-800"><FaGithub /></span> },
  ];

  return (
    <section id="about" className="py-20 bg-gray-50">
      <div className="container">
        <div className="text-center mb-16">
          <h2 className="display-4 font-bold text-gray-900 mb-4">About Me</h2>
          <div className="w-20 h-1 bg-purple-600 mx-auto rounded-full"></div>
        </div>

        <div className="row align-items-center">
          <div className="col-lg-6 mb-8 lg:mb-0">
            <h3 className="text-3xl font-bold mb-4 text-purple-800">지속적으로 성장하는 개발자</h3>
            <p className="text-lg text-gray-600 leading-relaxed mb-6">
              안녕하세요! 저는 새로운 기술을 배우고 이를 활용하여 문제를 해결하는 과정을 즐기는 프론트엔드 개발자입니다. 
              사용자 중심의 인터페이스를 설계하고, 최적화된 성능을 제공하는 웹 애플리케이션을 만드는 것에 열정을 가지고 있습니다.
            </p>
            <p className="text-lg text-gray-600 leading-relaxed mb-8">
              단순히 코드를 작성하는 것을 넘어, 비즈니스 가치를 창출하고 사용자에게 즐거운 경험을 선사하는 것을 목표로 합니다. 
              팀원들과의 원활한 소통을 중요하게 생각하며, 협업을 통해 더 큰 성과를 내는 것을 선호합니다.
            </p>
            
            <div className="card border-0 shadow-sm p-4 bg-white rounded-2xl">
              <h4 className="font-bold mb-4 text-gray-800">Education & Experience</h4>
              <ul className="space-y-4">
                <li className="flex gap-4">
                  <div className="w-2 bg-purple-500 rounded-full"></div>
                  <div>
                    <h5 className="font-bold mb-0">멋쟁이사자처럼 프론트엔드 스쿨</h5>
                    <p className="text-sm text-gray-500">2023.01 - 2023.06</p>
                  </div>
                </li>
                <li className="flex gap-4">
                  <div className="w-2 bg-blue-500 rounded-full"></div>
                  <div>
                    <h5 className="font-bold mb-0">ABC 대학교 컴퓨터공학과 졸업</h5>
                    <p className="text-sm text-gray-500">2018.03 - 2022.02</p>
                  </div>
                </li>
              </ul>
            </div>
          </div>

          <div className="col-lg-6">
            <div className="ps-lg-5">
              <h4 className="text-2xl font-bold mb-6 text-gray-800">Tech Stack</h4>
              <div className="grid grid-cols-3 gap-4">
                {skills.map((skill) => (
                  <div key={skill.name} className="skill-card flex flex-col items-center justify-center p-4 bg-white rounded-xl shadow-sm hover:shadow-md transition-all border border-gray-100">
                    <div className="text-4xl mb-2">{skill.icon}</div>
                    <span className="text-sm font-medium text-gray-700">{skill.name}</span>
                  </div>
                ))}
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default About;
