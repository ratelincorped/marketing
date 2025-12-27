package com.ratel.marketing.common.repository;

import com.ratel.marketing.common.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByUsername(String username);

    List<User> findAllByName(String name);
}