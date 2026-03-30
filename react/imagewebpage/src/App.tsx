/**
 * @license
 * SPDX-License-Identifier: Apache-2.0
 */

import React, { useState } from 'react';
import { 
  Search, 
  Menu, 
  User, 
  LogIn, 
  MessageSquare, 
  HelpCircle, 
  Users, 
  History, 
  ChevronRight, 
  Star, 
  Eye, 
  Calendar,
  ArrowUp
} from 'lucide-react';
import { motion } from 'motion/react';
import { CATEGORIES, SUB_CATEGORIES, MOCK_SITES, RECENT_POSTS, RECENT_COMMENTS, POPULAR_POSTS } from './constants';

export default function App() {
  const [activeCategory, setActiveCategory] = useState("오픈/리뉴얼");
  const [activeSubCategory, setActiveSubCategory] = useState("전체");

  return (
    <div className="min-h-screen bg-[#1a1c1e] text-[#e0e0e0] font-sans selection:bg-[#3b82f6] selection:text-white">
      {/* Top Header */}
      <header className="bg-[#151618] border-b border-[#2a2d30] py-2 px-4 sticky top-0 z-50 shadow-lg">
        <div className="max-w-[1400px] mx-auto flex items-center justify-between gap-4">
          <div className="flex items-center gap-6">
            <div className="flex items-center gap-2 cursor-pointer group">
              <div className="w-10 h-10 bg-gradient-to-br from-blue-600 to-indigo-700 rounded-lg flex items-center justify-center shadow-lg group-hover:scale-105 transition-transform">
                <span className="text-white font-bold text-xl">D</span>
              </div>
              <div className="hidden sm:block">
                <h1 className="text-xl font-black tracking-tighter text-white">DBCUT</h1>
                <p className="text-[10px] text-gray-500 font-medium -mt-1">Design Community Portal</p>
              </div>
            </div>

            <div className="hidden md:flex items-center bg-[#24272a] rounded-full px-4 py-1.5 border border-[#34383d] focus-within:border-blue-500/50 transition-colors w-[400px]">
              <input 
                type="text" 
                placeholder="검색어를 입력해주세요" 
                className="bg-transparent border-none outline-none text-sm w-full placeholder:text-gray-600"
              />
              <Search size={18} className="text-gray-500 cursor-pointer hover:text-blue-400 transition-colors" />
            </div>
          </div>

          <div className="flex items-center gap-4 text-xs font-medium text-gray-400">
            <button className="hover:text-white flex items-center gap-1 transition-colors">
              <HelpCircle size={14} /> FAQ
            </button>
            <button className="hover:text-white flex items-center gap-1 transition-colors">
              <MessageSquare size={14} /> 1:1문의
            </button>
            <div className="w-px h-3 bg-gray-700" />
            <button className="hover:text-white flex items-center gap-1 transition-colors">
              <LogIn size={14} /> 로그인
            </button>
            <button className="hover:text-white flex items-center gap-1 transition-colors">
              <User size={14} /> 회원가입
            </button>
          </div>
        </div>
      </header>

      {/* Main Navigation */}
      <nav className="bg-[#1e2124] border-b border-[#2a2d30] shadow-md">
        <div className="max-w-[1400px] mx-auto flex items-center">
          <button className="p-4 bg-blue-600 text-white hover:bg-blue-700 transition-colors">
            <Menu size={20} />
          </button>
          <div className="flex items-center overflow-x-auto no-scrollbar">
            {CATEGORIES.map((cat) => (
              <button
                key={cat}
                onClick={() => setActiveCategory(cat)}
                className={`px-5 py-4 text-[13px] font-bold whitespace-nowrap transition-all relative ${
                  activeCategory === cat ? 'text-blue-400' : 'text-gray-400 hover:text-gray-200'
                }`}
              >
                {cat}
                {activeCategory === cat && (
                  <motion.div 
                    layoutId="nav-underline"
                    className="absolute bottom-0 left-0 right-0 h-0.5 bg-blue-500"
                  />
                )}
              </button>
            ))}
          </div>
        </div>
      </nav>

      {/* Main Content */}
      <main className="max-w-[1400px] mx-auto py-8 px-4 grid grid-cols-1 lg:grid-cols-[1fr_320px] gap-8">
        
        {/* Left Column: Gallery */}
        <section>
          <div className="flex items-center justify-between mb-6">
            <div className="flex items-baseline gap-3">
              <h2 className="text-2xl font-black text-white">{activeCategory}</h2>
              <span className="text-xs text-gray-500 font-mono">Total 9,791건 | 1 페이지</span>
            </div>
            <div className="flex items-center gap-1 bg-[#24272a] p-1 rounded-md border border-[#34383d]">
              {["평가", "의견", "조회", "등록일"].map((btn) => (
                <button key={btn} className="px-3 py-1 text-[11px] font-bold text-gray-400 hover:bg-[#2f3338] hover:text-white rounded transition-colors">
                  {btn}
                </button>
              ))}
            </div>
          </div>

          {/* Sub-categories */}
          <div className="flex flex-wrap items-center gap-2 mb-8 bg-[#151618] p-3 rounded-xl border border-[#2a2d30]">
            {SUB_CATEGORIES.map((sub) => (
              <button
                key={sub}
                onClick={() => setActiveSubCategory(sub)}
                className={`px-4 py-1.5 rounded-full text-[12px] font-bold transition-all ${
                  activeSubCategory === sub 
                    ? 'bg-blue-600 text-white shadow-lg shadow-blue-900/20' 
                    : 'text-gray-500 hover:text-gray-300 hover:bg-[#24272a]'
                }`}
              >
                {sub}
              </button>
            ))}
          </div>

          {/* Grid */}
          <div className="grid grid-cols-1 sm:grid-cols-2 xl:grid-cols-4 gap-6">
            {MOCK_SITES.map((site) => (
              <motion.div 
                key={site.id}
                initial={{ opacity: 0, y: 20 }}
                animate={{ opacity: 1, y: 0 }}
                whileHover={{ y: -5 }}
                className="group bg-[#24272a] rounded-xl overflow-hidden border border-[#34383d] hover:border-blue-500/30 transition-all shadow-lg"
              >
                <div className="relative aspect-[16/10] overflow-hidden">
                  <img 
                    src={site.thumbnail} 
                    alt={site.title}
                    className="w-full h-full object-cover group-hover:scale-110 transition-transform duration-500"
                    referrerPolicy="no-referrer"
                  />
                  <div className="absolute top-2 left-2 bg-black/60 backdrop-blur-md px-2 py-1 rounded flex items-center gap-1">
                    <Star size={12} className="text-yellow-500 fill-yellow-500" />
                    <span className="text-[11px] font-bold text-white">{site.rating}</span>
                  </div>
                </div>
                <div className="p-4">
                  <h3 className="font-bold text-[14px] text-white truncate mb-3 group-hover:text-blue-400 transition-colors">
                    {site.title}
                  </h3>
                  <div className="flex items-center justify-between text-[11px] text-gray-500 font-mono">
                    <div className="flex items-center gap-3">
                      <span className="flex items-center gap-1">
                        <Eye size={12} /> {site.views.toLocaleString()}
                      </span>
                    </div>
                    <span className="flex items-center gap-1">
                      <Calendar size={12} /> {site.date}
                    </span>
                  </div>
                </div>
              </motion.div>
            ))}
          </div>

          {/* Pagination */}
          <div className="mt-12 flex justify-center items-center gap-1">
            <button className="w-8 h-8 flex items-center justify-center rounded bg-[#24272a] text-gray-500 hover:bg-blue-600 hover:text-white transition-colors">1</button>
            {[2, 3, 4, 5, 6, 7, 8, 9, 10].map(n => (
              <button key={n} className="w-8 h-8 flex items-center justify-center rounded text-gray-500 hover:bg-[#24272a] hover:text-white transition-colors">{n}</button>
            ))}
            <button className="w-8 h-8 flex items-center justify-center rounded text-gray-500 hover:bg-[#24272a] hover:text-white transition-colors">
              <ChevronRight size={16} />
            </button>
          </div>
        </section>

        {/* Right Column: Sidebar */}
        <aside className="space-y-8">
          {/* Login Box */}
          <div className="bg-[#24272a] p-6 rounded-2xl border border-[#34383d] shadow-xl">
            <div className="space-y-3 mb-4">
              <input 
                type="text" 
                placeholder="아이디" 
                className="w-full bg-[#1a1c1e] border border-[#34383d] rounded-lg px-4 py-2.5 text-sm focus:border-blue-500 outline-none transition-colors"
              />
              <input 
                type="password" 
                placeholder="비밀번호" 
                className="w-full bg-[#1a1c1e] border border-[#34383d] rounded-lg px-4 py-2.5 text-sm focus:border-blue-500 outline-none transition-colors"
              />
            </div>
            <button className="w-full bg-blue-600 hover:bg-blue-700 text-white font-bold py-3 rounded-lg transition-colors shadow-lg shadow-blue-900/20 mb-4">
              로그인
            </button>
            <div className="flex items-center justify-between text-[11px] text-gray-500">
              <label className="flex items-center gap-2 cursor-pointer hover:text-gray-300">
                <input type="checkbox" className="rounded border-[#34383d] bg-[#1a1c1e]" /> 자동로그인
              </label>
              <div className="flex gap-2">
                <button className="hover:text-white">회원가입</button>
                <span>|</span>
                <button className="hover:text-white">계정찾기</button>
              </div>
            </div>
            <div className="mt-6 grid grid-cols-2 gap-2">
              <button className="bg-[#03c75a] text-white py-2 rounded font-bold text-[12px] hover:opacity-90 transition-opacity">N</button>
              <button className="bg-[#fee500] text-[#3c1e1e] py-2 rounded font-bold text-[12px] hover:opacity-90 transition-opacity">TALK</button>
            </div>
          </div>

          {/* Notice Section */}
          <div className="bg-[#151618] rounded-2xl border border-[#2a2d30] overflow-hidden">
            <div className="p-4 border-b border-[#2a2d30] flex items-center justify-between">
              <h3 className="text-sm font-black text-white">공지사항</h3>
              <button className="text-[10px] text-gray-500 hover:text-white">더보기</button>
            </div>
            <div className="p-4">
              <p className="text-[12px] text-gray-400 leading-relaxed">
                오픈/리뉴얼 등록 권한을 모든 회원께 드립니다. 리스트 광고(AD) 게시물 등록 관련해...
                반복 동일 코멘트는 무조건 삭제합니다. 일반회원 가입 오류 수정했습니다.
              </p>
            </div>
          </div>

          {/* Recent Lists */}
          {[
            { title: "최근 등록된 게시글", items: RECENT_POSTS },
            { title: "최근 등록된 코멘트", items: RECENT_COMMENTS },
            { title: "인기 게시글", items: POPULAR_POSTS }
          ].map((section, idx) => (
            <div key={idx} className="bg-[#151618] rounded-2xl border border-[#2a2d30] overflow-hidden">
              <div className="p-4 border-b border-[#2a2d30] flex items-center justify-between">
                <h3 className="text-sm font-black text-white">{section.title}</h3>
                <button className="text-[10px] text-gray-500 hover:text-white">더보기</button>
              </div>
              <div className="divide-y divide-[#2a2d30]">
                {section.items.map((item) => (
                  <div key={item.id} className="p-3 hover:bg-[#1e2124] transition-colors cursor-pointer group">
                    <div className="flex items-center justify-between gap-2">
                      <p className="text-[12px] text-gray-400 group-hover:text-blue-400 truncate">{item.title}</p>
                      {item.date && <span className="text-[10px] text-gray-600 font-mono shrink-0">{item.date}</span>}
                    </div>
                  </div>
                ))}
              </div>
            </div>
          ))}

          {/* Stats */}
          <div className="bg-[#24272a] p-5 rounded-2xl border border-[#34383d]">
            <h3 className="text-xs font-black text-white mb-4 flex items-center gap-2">
              <History size={14} className="text-blue-500" /> 접속자집계
            </h3>
            <div className="space-y-3">
              <div className="flex items-center justify-between text-[11px]">
                <span className="text-gray-500">오늘</span>
                <span className="bg-blue-600/20 text-blue-400 px-2 py-0.5 rounded font-bold">55,242</span>
              </div>
              <div className="flex items-center justify-between text-[11px]">
                <span className="text-gray-500">어제</span>
                <span className="bg-green-600/20 text-green-400 px-2 py-0.5 rounded font-bold">103,719</span>
              </div>
              <div className="flex items-center justify-between text-[11px]">
                <span className="text-gray-500">최대</span>
                <span className="text-white font-bold">117,441</span>
              </div>
              <div className="flex items-center justify-between text-[11px]">
                <span className="text-gray-500">전체</span>
                <span className="text-purple-400 font-bold">7,270,549</span>
              </div>
            </div>
          </div>
        </aside>
      </main>

      {/* Footer */}
      <footer className="bg-[#151618] border-t border-[#2a2d30] pt-12 pb-8 px-4 mt-12">
        <div className="max-w-[1400px] mx-auto">
          <div className="flex flex-col md:flex-row items-center justify-between gap-8 mb-12">
            <div className="flex items-center gap-2">
              <div className="w-8 h-8 bg-gray-700 rounded flex items-center justify-center">
                <span className="text-white font-bold text-sm">D</span>
              </div>
              <span className="text-lg font-black text-white">DBCUT</span>
            </div>
            <div className="flex flex-wrap justify-center gap-6 text-[12px] text-gray-500 font-medium">
              {["고객센터", "사이트 등록신청", "이 사이트에 광고하기", "개인정보처리방침", "서비스이용약관", "모바일버전"].map(link => (
                <button key={link} className="hover:text-white transition-colors">{link}</button>
              ))}
            </div>
          </div>
          
          <div className="flex flex-col items-center gap-4">
            <div className="flex items-center bg-[#24272a] rounded-full px-4 py-2 border border-[#34383d] w-full max-w-[500px]">
              <select className="bg-transparent border-none outline-none text-xs text-gray-400 pr-4 border-r border-gray-700 mr-4">
                <option>제목</option>
                <option>작성자</option>
              </select>
              <input 
                type="text" 
                placeholder="검색어를 입력해주세요" 
                className="bg-transparent border-none outline-none text-sm w-full placeholder:text-gray-600"
              />
              <Search size={18} className="text-gray-500 cursor-pointer hover:text-blue-400" />
            </div>
            <p className="text-[11px] text-gray-600 mt-4">Copyright © DBCUT.com All rights reserved.</p>
          </div>
        </div>
      </footer>

      {/* Floating Scroll Top */}
      <button 
        onClick={() => window.scrollTo({ top: 0, behavior: 'smooth' })}
        className="fixed bottom-8 right-8 w-12 h-12 bg-blue-600 text-white rounded-full flex items-center justify-center shadow-2xl hover:bg-blue-700 transition-all hover:scale-110 z-50"
      >
        <ArrowUp size={20} />
      </button>
    </div>
  );
}
