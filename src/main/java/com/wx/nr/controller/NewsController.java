package com.wx.nr.controller;

import com.github.pagehelper.PageInfo;
import com.wx.nr.dao.NewsMapper;
import com.wx.nr.model.News;
import com.wx.nr.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private NewsMapper newsMapper;

    @ResponseBody
    @RequestMapping("all")
    public Object getNews(
            @RequestParam(name = "pageNum",required = false,defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize",required = false,defaultValue = "20") int pageSize
    ){

        return newsService.getNews(pageNum, pageSize);
    }

}
