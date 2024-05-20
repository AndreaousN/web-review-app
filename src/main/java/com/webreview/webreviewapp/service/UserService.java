package com.webreview.webreviewapp.service;

import com.webreview.webreviewapp.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User user);
    void deleteById(int id);
    User findById(int id);
}
