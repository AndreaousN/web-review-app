package com.webreview.webreviewapp.controller;

import com.webreview.webreviewapp.model.Review;
import com.webreview.webreviewapp.service.ReviewService;
import com.webreview.webreviewapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;
    private final UserService userService;

    public ReviewController(ReviewService reviewService, UserService userService) {
        this.reviewService = reviewService;
        this.userService = userService;
    }

    @GetMapping
    public String listReviews(Model model) {
        List<Review> reviews = reviewService.findAll();
        model.addAttribute("reviews", reviews);
        return "reviews/list";
    }
    @GetMapping("/new")
    public String newReviewForm(Model model) {
        model.addAttribute("review", new Review());
        model.addAttribute("users", userService.findAll());
        return "reviews/new";
    }
    @PostMapping("/saveReview")
    public String saveReview(@ModelAttribute Review review) {
        reviewService.save(review);
        return "redirect:/reviews";
    }
    @GetMapping("/edit/{id}")
    public String editReviewForm(@PathVariable int id, Model model) {
        Review review = reviewService.findById(id);
        if (review == null) {
            return "redirect:/reviews";
        }
        model.addAttribute("review", review);
        model.addAttribute("users", userService.findAll());
        return "reviews/edit";
    }
    @PostMapping("/update")
    public String updateReview(@ModelAttribute Review review) {
        reviewService.save(review);
        return "redirect:/reviews";
    }
    @GetMapping("/delete/{id}")
    public String deleteReview(@PathVariable int id) {
        reviewService.deleteById(id);
        return "redirect:/reviews";
    }
}
