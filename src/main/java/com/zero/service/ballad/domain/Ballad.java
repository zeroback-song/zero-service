package com.zero.service.ballad.domain;

import com.zero.service.ballad.domain.common.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "BALLAD")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Ballad extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private String artistName;

    private String albumName;

    private boolean titleYn;

    private String lyrics;

    private String releaseDate;

    @Builder
    public Ballad(String title, String artistName, String albumName, boolean titleYn, String lyrics, String releaseDate) {
        this.title = title;
        this.artistName = artistName;
        this.albumName = albumName;
        this.titleYn = titleYn;
        this.lyrics = lyrics;
        this.releaseDate = releaseDate;
    }
}
