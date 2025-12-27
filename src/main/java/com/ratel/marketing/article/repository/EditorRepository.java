package com.ratel.marketing.article.repository;

import com.ratel.marketing.article.model.Editor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorRepository extends JpaRepository<Editor, Integer> {
}
