package com.webreview.webreviewapp.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "content")
    private String content;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "score")
    private Evaluation evaluation;
    @Column(length = 64 )
    private String images;

    public Review(String username, String content, LocalDateTime date, Evaluation evaluation, String images) {
        this.username = username;
        this.content = content;
        this.date = date;
        this.evaluation = evaluation;
        this.images = images;
    }

    public Review() {
    }

    public Review(int id, String username, String content, LocalDateTime date, Evaluation evaluation, String images) {
        this.id = id;
        this.username = username;
        this.content = content;
        this.date = date;
        this.evaluation = evaluation;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
