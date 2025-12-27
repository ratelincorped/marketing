package com.ratel.marketing.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Tag {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false)
    private String name;
}
