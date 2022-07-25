package com.zero.service.jazz.repository;

import com.zero.service.jazz.domain.Jazz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JazzRepositoryTest {

    @Autowired
    private JazzRepository jazzRepository;

    @Test
    void jazz_add() {
        Jazz jazz = Jazz.builder()
                .albumName("앨범명")
                .artistName("sun")
                .lyrics("가~사")
                .releaseDate("20220726")
                .title("제~목")
                .titleYn(true)
                .build();

        jazzRepository.save(jazz);
    }
}