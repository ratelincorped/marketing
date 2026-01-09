package com.ratel.marketing.article.controller;

import com.ratel.marketing.article.management.ArticleManagement;
import com.ratel.marketing.article.model.Article;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public record ArticleController(ArticleManagement service) {
    public ArticleController(ArticleManagement service) {
        this.service = service;
    }

    // request all articles
    @QueryMapping
    public List<Article> article() {
        return service.getArticles();
    }

    // permanent delete article
    public void permanentDelete(@Argument Integer id){ service.deleteArticle(id); }
}
