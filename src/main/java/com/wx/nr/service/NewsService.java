package com.wx.nr.service;

import com.github.pagehelper.PageInfo;
import com.wx.nr.model.News;

public interface NewsService {

    PageInfo<News> getNews(int pageNum, int pageSize);
}
