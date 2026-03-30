import React, { useState } from 'react';
import { FaEnvelope, FaPhone, FaMapMarkerAlt, FaPaperPlane } from 'react-icons/fa';

const Contact: React.FC = () => {
  const [submitted, setSubmitted] = useState(false);
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    message: '',
  });

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    // Simulate form submission
    setSubmitted(true);
    setFormData({ name: '', email: '', message: '' });
    setTimeout(() => setSubmitted(false), 5000);
  };

  const handleChange = (e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  return (
    <section id="contact" className="py-20 bg-gray-50">
      <div className="container">
        <div className="text-center mb-16">
          <h2 className="display-4 font-bold text-gray-900 mb-4">Contact Me</h2>
          <div className="w-20 h-1 bg-purple-600 mx-auto rounded-full"></div>
        </div>

        <div className="row g-5">
          <div className="col-lg-5">
            <div className="contact-info-card bg-white p-8 rounded-3xl shadow-lg h-100">
              <h3 className="text-2xl font-bold mb-6 text-gray-800">Get In Touch</h3>
              <p className="text-gray-600 mb-8">
                새로운 프로젝트 제안이나 궁금한 점이 있으시면 언제든 연락주세요. 
                최대한 빠른 시일 내에 답변 드리겠습니다.
              </p>
              
              <div className="space-y-6">
                <div className="flex items-center gap-4">
                  <div className="w-12 h-12 bg-purple-100 text-purple-600 rounded-full flex items-center justify-center text-xl">
                    <FaEnvelope />
                  </div>
                  <div>
                    <h5 className="font-bold mb-0 text-gray-800">Email</h5>
                    <p className="text-gray-600 mb-0">kiteu23@gmail.com</p>
                  </div>
                </div>
                
                <div className="flex items-center gap-4">
                  <div className="w-12 h-12 bg-blue-100 text-blue-600 rounded-full flex items-center justify-center text-xl">
                    <FaPhone />
                  </div>
                  <div>
                    <h5 className="font-bold mb-0 text-gray-800">Phone</h5>
                    <p className="text-gray-600 mb-0">010-1234-5678</p>
                  </div>
                </div>
                
                <div className="flex items-center gap-4">
                  <div className="w-12 h-12 bg-teal-100 text-teal-600 rounded-full flex items-center justify-center text-xl">
                    <FaMapMarkerAlt />
                  </div>
                  <div>
                    <h5 className="font-bold mb-0 text-gray-800">Location</h5>
                    <p className="text-gray-600 mb-0">서울특별시 강남구 테헤란로</p>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div className="col-lg-7">
            <div className="bg-white p-8 rounded-3xl shadow-lg h-100">
              {submitted ? (
                <div className="h-full flex flex-col items-center justify-center text-center py-10">
                  <div className="w-20 h-20 bg-green-100 text-green-600 rounded-full flex items-center justify-center text-4xl mb-4">
                    <FaPaperPlane />
                  </div>
                  <h3 className="text-2xl font-bold text-gray-800 mb-2">메시지가 전송되었습니다!</h3>
                  <p className="text-gray-600">빠른 시일 내에 확인 후 연락드리겠습니다. 감사합니다.</p>
                  <button onClick={() => setSubmitted(false)} className="btn btn-link text-purple-600 mt-4">다른 메시지 보내기</button>
                </div>
              ) : (
                <form onSubmit={handleSubmit}>
                  <div className="mb-4">
                    <label htmlFor="name" className="form-label font-bold text-gray-700">Name</label>
                    <input 
                      type="text" 
                      className="form-control form-control-lg bg-gray-50 border-0 rounded-xl focus:ring-2 focus:ring-purple-500" 
                      id="name" 
                      name="name"
                      placeholder="이름을 입력해주세요" 
                      required 
                      value={formData.name}
                      onChange={handleChange}
                    />
                  </div>
                  <div className="mb-4">
                    <label htmlFor="email" className="form-label font-bold text-gray-700">Email</label>
                    <input 
                      type="email" 
                      className="form-control form-control-lg bg-gray-50 border-0 rounded-xl focus:ring-2 focus:ring-purple-500" 
                      id="email" 
                      name="email"
                      placeholder="이메일을 입력해주세요" 
                      required 
                      value={formData.email}
                      onChange={handleChange}
                    />
                  </div>
                  <div className="mb-4">
                    <label htmlFor="message" className="form-label font-bold text-gray-700">Message</label>
                    <textarea 
                      className="form-control form-control-lg bg-gray-50 border-0 rounded-xl focus:ring-2 focus:ring-purple-500" 
                      id="message" 
                      name="message"
                      rows={5} 
                      placeholder="메시지를 입력해주세요" 
                      required 
                      value={formData.message}
                      onChange={handleChange}
                    ></textarea>
                  </div>
                  <button type="submit" className="btn btn-primary btn-lg w-full py-3 rounded-xl font-bold shadow-md hover:scale-[1.02] transition-transform flex items-center justify-center gap-2">
                    <FaPaperPlane /> 메시지 보내기
                  </button>
                </form>
              )}
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default Contact;
