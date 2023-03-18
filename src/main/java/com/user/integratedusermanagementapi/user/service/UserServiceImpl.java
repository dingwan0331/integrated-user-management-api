package com.user.integratedusermanagementapi.user.service;

import com.user.integratedusermanagementapi.user.controller.dto.request.PostUserRequestDTO;
import com.user.integratedusermanagementapi.user.entity.User;
import com.user.integratedusermanagementapi.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl( UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User createUser(PostUserRequestDTO postUserRequestDto) {
        User user = new User();
        user.setUsername(postUserRequestDto.getUsername());
        user.setPassword(postUserRequestDto.getPassword().getBytes());
        user.setNickName(postUserRequestDto.getNickName());
        user.setMobilePhoneNumber(postUserRequestDto.getMobilePhoneNumber());

        return userRepository.saveUser(user);
    }
}
