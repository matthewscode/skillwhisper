package com.skillwhisper.api.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "whisper_group")
public class WhisperGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String game;

    @OneToMany
    private List<Whisper> whisperList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public List<Whisper> getWhisperList() {
        return whisperList;
    }

    public void setWhisperList(List<Whisper> whisperList) {
        this.whisperList = whisperList;
    }
}
