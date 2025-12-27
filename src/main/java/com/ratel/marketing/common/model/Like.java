package com.ratel.marketing.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

enum PostType {
    article,
    blog,
    post,
    comment
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Like {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true, nullable = false)
    private Enum<PostType> targetType;
    @Column(nullable = false)
    private Integer targetId;
}
