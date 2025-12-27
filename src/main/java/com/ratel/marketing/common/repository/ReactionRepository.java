package com.ratel.marketing.common.repository;

import com.ratel.marketing.common.model.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Integer> {
}
