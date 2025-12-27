package com.ratel.marketing.common.model;

import com.ratel.marketing.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum CommentStatus {
    visible,
    hidden,
    deleted
}

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Comment extends BaseEntity {
    private String content;
    private Enum<CommentStatus> status;
    private Enum<PostType> targetType;
    private Integer targetId;
    @ManyToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;
    @OneToMany(mappedBy = "comment")
    private List<Reply> replies;
}
