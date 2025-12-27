package com.ratel.marketing.common.service;

import com.ratel.marketing.common.model.Media;
import com.ratel.marketing.common.repository.MediaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public record MediaService(MediaRepository mediaRepository) {
    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }
    public List<Media> getMediaByTargetId(Integer targetId) {
        return mediaRepository.findAllByTargetId(targetId);
    }
    public Optional<Media> getMediaById(Integer mediaId) {
        return mediaRepository.findById(mediaId);
    }
}
