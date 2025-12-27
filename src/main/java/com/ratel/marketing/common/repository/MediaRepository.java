package com.ratel.marketing.common.repository;

import com.ratel.marketing.common.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> {
    List<Media> findAllByTargetId(Integer targetId);
}
