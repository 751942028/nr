package com.wx.nr.model;

public class NewsKeywords {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_keywords.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_keywords.news_id
     *
     * @mbggenerated
     */
    private Integer newsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_keywords.keywords
     *
     * @mbggenerated
     */
    private String keywords;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news_keywords.weight
     *
     * @mbggenerated
     */
    private Double weight;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_keywords.id
     *
     * @return the value of news_keywords.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_keywords.id
     *
     * @param id the value for news_keywords.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_keywords.news_id
     *
     * @return the value of news_keywords.news_id
     *
     * @mbggenerated
     */
    public Integer getNewsId() {
        return newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_keywords.news_id
     *
     * @param newsId the value for news_keywords.news_id
     *
     * @mbggenerated
     */
    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_keywords.keywords
     *
     * @return the value of news_keywords.keywords
     *
     * @mbggenerated
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_keywords.keywords
     *
     * @param keywords the value for news_keywords.keywords
     *
     * @mbggenerated
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news_keywords.weight
     *
     * @return the value of news_keywords.weight
     *
     * @mbggenerated
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news_keywords.weight
     *
     * @param weight the value for news_keywords.weight
     *
     * @mbggenerated
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }
}