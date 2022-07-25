package com.zero.service.popsong.repository;

import com.zero.service.popsong.domain.PopSong;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PopSongRepositoryTest {

    @Autowired
    private PopSongRepository popSongRepository;

    @Test
    void popsong_add(){
        PopSong pop = PopSong.builder()
                .album_name("album_name")
                .lyrics("123123")
                .title("123123")
                .releaseDate("12313")
                .title_yn(true)
                .build();
        popSongRepository.save(pop);
    }

}