package com.shareumbrella.service;

import com.shareumbrella.entity.User;

public interface IUserService {
    boolean add(User user);

    User getById(String openid);
}
