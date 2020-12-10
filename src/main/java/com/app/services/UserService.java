package com.app.services;

import com.app.domain.User;

public interface UserService extends CRUDService<User> {

    User findByUsername(String username);

}
