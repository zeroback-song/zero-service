package com.zero.service.hiphop.domain;


import com.zero.service.hiphop.domain.common.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class HipHop extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;
    private String artistName;
    private String albumName;
    private boolean titleYN;
    private String lyrics;
    private String releaseDate;

    @Builder
    public HipHop(String title, String artistName, String albumName, boolean titleYN, String lyrics, String releaseDate) {
        this.title = title;
        this.artistName = artistName;
        this.albumName = albumName;
        this.titleYN = titleYN;
        this.lyrics = lyrics;
        this.releaseDate = releaseDate;
    }
}
