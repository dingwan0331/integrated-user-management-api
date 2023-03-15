package com.user.integratedusermanagementapi.user.service;

import com.user.integratedusermanagementapi.user.controller.dto.request.PostUserRequestDTO;
import com.user.integratedusermanagementapi.user.entity.User;
import com.user.integratedusermanagementapi.user.repository.UserRepository;

public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    User user;
    @Override
    public User createUser(PostUserRequestDTO postUserRequestDto) {
        user.setUsername(postUserRequestDto.getUsername());
        user.setPassword(postUserRequestDto.getPassword().getBytes());
        user.setNickName(postUserRequestDto.getNickName());
        user.setMobilePhoneNumber(postUserRequestDto.getMobilePhoneNumber());

        return userRepository.saveUser(user);
    }
}
