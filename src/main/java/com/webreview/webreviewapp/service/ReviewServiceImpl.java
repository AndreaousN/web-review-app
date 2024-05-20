package com.webreview.webreviewapp.service;

import com.webreview.webreviewapp.model.Review;
import com.webreview.webreviewapp.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public void deleteById(int id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public Review findById(int id) {
        return reviewRepository.findById(id).orElse(null);
    }
}
