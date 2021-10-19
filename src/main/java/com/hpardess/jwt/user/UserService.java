package com.hpardess.jwt.user;

import java.util.List;

public interface UserService {
    public List findAll();
    public User findById(Long id);
    public User findByEmail(String email);
    public Boolean existsByEmail(String email);

    public User save(User user);
}
