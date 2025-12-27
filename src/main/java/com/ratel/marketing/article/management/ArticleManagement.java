package com.ratel.marketing.article.management;

import com.ratel.marketing.article.ArticleExternalAPI;
import com.ratel.marketing.article.ArticleInternalAPI;
import com.ratel.marketing.article.model.Article;
import com.ratel.marketing.article.model.Editor;
import com.ratel.marketing.article.model.Revision;
import com.ratel.marketing.article.repository.ArticleRepository;
import com.ratel.marketing.article.repository.EditorRepository;
import com.ratel.marketing.article.repository.RevisionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleManagement implements ArticleExternalAPI, ArticleInternalAPI {
    private final ArticleRepository articleRepository;
    private final EditorRepository editorRepository;
    private final RevisionRepository revisionRepository;

    public ArticleManagement(ArticleRepository articleRepository, EditorRepository editorRepository, RevisionRepository revisionRepository) {
        this.articleRepository = articleRepository;
        this.editorRepository = editorRepository;
        this.revisionRepository = revisionRepository;
    }

    @Override
    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Optional<Article> getArticleByTitle(String title) {
        return articleRepository.findByTitle(title);
    }

    @Override
    public List<Revision> getRevisionsByArticleId(Integer articleId) {
        return revisionRepository.findAllByArticleId(articleId);
    }

    @Override
    public List<Revision> getRevisionsByEditorId(Integer editorId) {
        return revisionRepository.findAllByEditorId(editorId);
    }

    @Override
    public List<Editor> getEditors() {
        return editorRepository.findAll();
    }
}
