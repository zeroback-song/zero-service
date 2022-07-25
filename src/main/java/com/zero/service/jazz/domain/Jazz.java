package com.zero.service.jazz.domain;

import com.zero.service.jazz.domain.common.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Jazz extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;
    private String artistName;
    private String albumName;
    private boolean titleYn;
    private String lyrics;
    private String releaseDate;

    @Builder
    public Jazz(Long id, String title, String artistName, String albumName, boolean titleYn, String lyrics, String releaseDate) {
        this.id = id;
        this.title = title;
        this.artistName = artistName;
        this.albumName = albumName;
        this.titleYn = titleYn;
        this.lyrics = lyrics;
        this.releaseDate = releaseDate;
    }
}
