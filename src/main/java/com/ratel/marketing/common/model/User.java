package com.ratel.marketing.common.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = true, updatable = false)
    private String email;
    private String password;
    private String name;
    private String bio;
    private String avatarUrl;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;
    @OneToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;
}
