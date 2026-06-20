package com.example.demo;

import jakarta.persistence.*;

@__________
public class Board {

    @__________
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    public Board() {
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return __________;
    }

    public String getTitle() {
        return __________;
    }

    public String getContent() {
        return __________;
    }
}
