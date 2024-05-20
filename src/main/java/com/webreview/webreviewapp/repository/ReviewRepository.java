package com.webreview.webreviewapp.repository;

import com.webreview.webreviewapp.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
