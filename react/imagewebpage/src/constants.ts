import { SiteCard, SidebarItem, NoticeItem } from './types';

export const CATEGORIES = [
  "오픈/리뉴얼", "외국사이트", "워드프레스", "쇼핑몰", "디렉토리", 
  "에이전시", "구인정보", "제작의뢰", "추천상품", "포인트경매", "커뮤니티"
];

export const SUB_CATEGORIES = [
  "전체", "디자인/광고", "그룹/기업", "유통/판매", "식품/음료", 
  "패션/섬유", "화장품/미용", "화학/생활용품", "가구/인테리어", "전기/전자"
];

export const MOCK_SITES: SiteCard[] = [
  { id: '1', title: '스튜디오 제이티', thumbnail: 'https://picsum.photos/seed/jt/400/250', rating: 9.1, views: 1361, date: '03-11' },
  { id: '2', title: '맨션브릿지 (Mansio...', thumbnail: 'https://picsum.photos/seed/mansion/400/250', rating: 8.2, views: 1817, date: '02-11' },
  { id: '3', title: 'HD현대오일뱅크 보너스카...', thumbnail: 'https://picsum.photos/seed/hyundai/400/250', rating: 9.1, views: 2681, date: '02-09' },
  { id: '4', title: 'ABT', thumbnail: 'https://picsum.photos/seed/abt/400/250', rating: 9.6, views: 2188, date: '02-07' },
  { id: '5', title: 'LS증권 투혼', thumbnail: 'https://picsum.photos/seed/ls/400/250', rating: 7.4, views: 9109, date: '07-23' },
  { id: '6', title: 'NHN ACE', thumbnail: 'https://picsum.photos/seed/nhn/400/250', rating: 8.2, views: 13177, date: '07-07' },
  { id: '7', title: 'BONBOO ENT (본...', thumbnail: 'https://picsum.photos/seed/bonboo/400/250', rating: 9.1, views: 8276, date: '07-03' },
  { id: '8', title: '유웰비뇨의학과 +3', thumbnail: 'https://picsum.photos/seed/uwell/400/250', rating: 8.2, views: 13756, date: '04-08' },
  { id: '9', title: 'JB금융그룹', thumbnail: 'https://picsum.photos/seed/jb/400/250', rating: 7.9, views: 15967, date: '04-03' },
  { id: '10', title: '태광그룹', thumbnail: 'https://picsum.photos/seed/taekwang/400/250', rating: 7.9, views: 13180, date: '03-25' },
  { id: '11', title: '백세주', thumbnail: 'https://picsum.photos/seed/baek/400/250', rating: 8.3, views: 11415, date: '03-19' },
  { id: '12', title: '국립고궁박물관', thumbnail: 'https://picsum.photos/seed/museum/400/250', rating: 8.8, views: 14477, date: '03-19' },
];

export const RECENT_POSTS: SidebarItem[] = [
  { id: '1', title: '[자유게시판] 2026 인터넷서비스 트...', date: '03-29' },
  { id: '2', title: '[오픈/리뉴얼] 스튜디오 제이티', date: '03-28' },
  { id: '3', title: '[자유게시판] [실무팁] 배너 사이즈별...', date: '03-27' },
  { id: '4', title: '[자유게시판] 폰트 질문 드립니다.', date: '03-26' },
  { id: '5', title: '[자유게시판] 홈페이지 리뉴얼 고민이라...', date: '03-25' },
];

export const RECENT_COMMENTS: SidebarItem[] = [
  { id: '1', title: '[자유게시판] 웹사이트는 제작만큼이나 ...' },
  { id: '2', title: '[자유게시판] 폼, 디자인을 보고 싶...' },
  { id: '3', title: '[자유게시판] 기준이 참 어려운 것 같...' },
  { id: '4', title: '[자유게시판] 감사합니다 ~~~' },
  { id: '5', title: '[자유게시판] 재택최고............' },
];

export const POPULAR_POSTS: SidebarItem[] = [
  { id: '1', title: '1 [오픈/리뉴얼] 스튜디오 제이티' },
  { id: '2', title: '2 [자유게시판] [실무팁] 배너 사이즈별...' },
  { id: '3', title: '3 [자유게시판] 2026 인터넷서비스 트...' },
];
