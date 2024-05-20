package com.webreview.webreviewapp.service;

import com.webreview.webreviewapp.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findAll();
    Review save(Review review);
    void deleteById(int id);
    Review findById(int id);
}
