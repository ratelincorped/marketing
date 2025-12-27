package com.ratel.marketing.article.model;

import com.ratel.marketing.common.BaseEntity;
import com.ratel.marketing.common.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
public class Editor extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "revision_id")
    private Revision revision;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
