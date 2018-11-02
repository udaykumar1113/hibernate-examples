package com.uday.hibernate.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="SONG")
public class Song implements Serializable {

    @Id
    @GenericGenerator(name="CUSTOM_ID",strategy = "com.uday.hibernate.service.SongIdGenerator")
    @GeneratedValue(generator="CUSTOM_ID")
    private String songId;
    private String songName;
    private int length;

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
