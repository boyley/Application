package com.github.angle.repository;

import com.github.angle.domain.User;

import java.util.Optional;

/**
 * Created by lenovo on 2016/11/26.
 */
public interface UserRepository {

    Optional<User> findOneByLogin(String login);
}
