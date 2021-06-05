package com.shareumbrella.service.impl;

import com.shareumbrella.entity.User;
import com.shareumbrella.mapper.UserMapper;
import com.shareumbrella.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean add(User user) {
        userMapper.add(user);
        return false;
    }

    @Override
    public User getById(String openid) {
        return userMapper.getById(openid);
    }
}
