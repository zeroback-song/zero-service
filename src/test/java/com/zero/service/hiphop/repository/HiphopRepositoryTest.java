package com.zero.service.hiphop.repository;

import com.zero.service.hiphop.domain.HipHop;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HiphopRepositoryTest {

    @Autowired
    private HiphopRepository hiphopRepository;

    @Test
    void hiphop_add() {
        HipHop hiphop = HipHop.builder()
                .albumName("albumName")
                .artistName("artistName")
                .lyrics("가사123123")
                .releaseDate("20220726")
                .title("title123")
                .titleYN(true)
                .build();

        hiphopRepository.save(hiphop);
    }
}