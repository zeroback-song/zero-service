package com.zero.service.ballad.repository;

import com.zero.service.ballad.domain.Ballad;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BalladRepositoryTest {

    @Autowired
    private BalladRepository balladRepository;

    @Test
    @DisplayName("발라드 단건 저장")
    void save_ballad() {
        //given
        Ballad ballad = Ballad.builder()
                .title("TOMBOY")
                .artistName("(여자)아이들")
                .albumName("ALBUM")
                .titleYn(true)
                .lyrics("예아톰보이")
                .releaseDate("2022-04-20")
                .build();

        balladRepository.save(ballad);

        //when
        Ballad findBallad = balladRepository.findById(1L).get();

        //then
        Assertions.assertEquals(findBallad.getTitle(), "TOMBOY");
    }

}