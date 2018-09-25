package com.wx.nr.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wx.nr.dao.NewsMapper;
import com.wx.nr.model.News;
import com.wx.nr.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;


    @Override
    public PageInfo<News> getNews(int pageNum, int pageSize) {
        
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(newsMapper.getNews());

    }
}
