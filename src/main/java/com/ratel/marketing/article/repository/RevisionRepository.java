package com.ratel.marketing.article.repository;

import com.ratel.marketing.article.model.Revision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RevisionRepository extends JpaRepository<Revision, Integer> {
    List<Revision> findAllByEditorId(Integer editorId);

    List<Revision> findAllByArticleId(Integer articleId);
}