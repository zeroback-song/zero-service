package com.zero.service.popsong.domain;

import com.zero.service.popsong.domain.common.BaseTimeEntity;
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
public class PopSong extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;
    private String artist_name;
    private String album_name;
    private boolean title_yn;
    private String lyrics;
    private String releaseDate;

    @Builder
    public PopSong(String title, String artist_name, String album_name, boolean title_yn, String lyrics, String releaseDate) {
        this.title = title;
        this.artist_name = artist_name;
        this.album_name = album_name;
        this.title_yn = title_yn;
        this.lyrics = lyrics;
        this.releaseDate = releaseDate;
    }
}
