package com.user.integratedusermanagementapi.user.service;

import com.user.integratedusermanagementapi.user.controller.dto.request.PostUserRequestDTO;
import com.user.integratedusermanagementapi.user.entity.User;

public interface UserService {
    User createUser(PostUserRequestDTO postUserRequestDto);
}