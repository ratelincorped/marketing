package com.ratel.marketing.article.dto;

import com.ratel.marketing.article.model.Revision;

import java.util.List;

public record ArticleResponse(
        Integer id,
        String tittle,
        String description,
        String slug,
        String status,
        String content,
        Integer readingTime,
        Integer authorId,
        Integer thumbnailId,
        List<Revision> revisions
) {
}
