package com.welcome.server.repository;

import com.welcome.server.entity.ArchivePhoto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ivanf on 12.10.2016.
 */
public interface ArchivePhotoRepository extends JpaRepository<ArchivePhoto,Long> {
}
