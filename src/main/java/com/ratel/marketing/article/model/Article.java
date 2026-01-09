package com.ratel.marketing.article.model;

import com.ratel.marketing.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;
import java.util.Map;

enum Status {
    DRAFT,
    PUBLISHED,
    REVISED,
    DELETED
}

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Article extends BaseEntity {
    @Column(unique = true, nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(unique = true, nullable = false)
    private String slug;
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> content;
    private Enum<Status> status;
    private Integer readingTime;
    private Integer thumbnailId;
    @Column(nullable = false)
    private String authorId;

    @OneToMany(mappedBy = "article")
    private List<Revision> revisions;

//    private Category category;
//    private List<Tag> tags;
//    private List<Comment> comments;
//    private List<Reaction> reactions;

}
