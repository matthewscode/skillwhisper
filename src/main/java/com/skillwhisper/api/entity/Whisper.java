package com.skillwhisper.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "whisper")
public class Whisper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String category;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private WhisperGroup whisperGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WhisperGroup getWhisperGroup() {
        return whisperGroup;
    }

    public void setWhisperGroup(WhisperGroup whisperGroup) {
        this.whisperGroup = whisperGroup;
    }
}
