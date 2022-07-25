package com.zero.service.popsong.repository;

import com.zero.service.popsong.domain.PopSong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopSongRepository extends JpaRepository<PopSong, Long> {
}
