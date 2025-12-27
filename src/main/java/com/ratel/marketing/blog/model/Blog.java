package com.ratel.marketing.blog.model;

import com.ratel.marketing.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

enum Status {
    draft,
    published,
    archived
}

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Blog extends BaseEntity {
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, unique = true)
    private String description;
    @Column(nullable = false, unique = true)
    private String slug;
    private String content;
    @Column(nullable = false)
    private Enum<Status> status;
    @Column(nullable = false)
    private Integer authorId;
}
