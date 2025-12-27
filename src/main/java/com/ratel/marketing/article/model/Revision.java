package com.ratel.marketing.article.model;

import com.ratel.marketing.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Revision extends BaseEntity {
    private Integer versionNumber;
    private String content;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @OneToOne
    @JoinColumn(name = "editor_id")
    private Editor editor;
//    private ChangeLog changeLog;

}
