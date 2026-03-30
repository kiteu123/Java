export interface SiteCard {
  id: string;
  title: string;
  thumbnail: string;
  rating: number;
  views: number;
  date: string;
  category?: string;
}

export interface SidebarItem {
  id: string;
  title: string;
  count?: number;
  date?: string;
}

export interface NoticeItem {
  id: string;
  content: string;
}
