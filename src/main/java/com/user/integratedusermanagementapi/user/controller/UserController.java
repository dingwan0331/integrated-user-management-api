package com.user.integratedusermanagementapi.user.controller;

import com.user.integratedusermanagementapi.user.controller.dto.reponse.PostUserResponseDTO;
import com.user.integratedusermanagementapi.user.controller.dto.request.PostUserRequestDTO;
import com.user.integratedusermanagementapi.user.entity.User;
import com.user.integratedusermanagementapi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<PostUserResponseDTO> postUser(@RequestBody PostUserRequestDTO postUserRequestDto) {
        userService.createUser(postUserRequestDto);

        PostUserResponseDTO postUserResponseDto = new PostUserResponseDTO();
        postUserResponseDto.setMessage("성공");

        return new ResponseEntity(postUserResponseDto, HttpStatus.CREATED);
    }
}
