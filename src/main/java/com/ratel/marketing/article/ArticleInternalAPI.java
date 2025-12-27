package com.ratel.marketing.article;

import com.ratel.marketing.article.model.Article;
import com.ratel.marketing.article.model.Editor;
import com.ratel.marketing.article.model.Revision;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ArticleInternalAPI {
    List<Article> getArticles();

    Article addArticle(Article article);

    Optional<Article> getArticleByTitle(String title);

    List<Revision> getRevisionsByArticleId(Integer articleId);

    List<Revision> getRevisionsByEditorId(Integer editorId);

    List<Editor> getEditors();
}
