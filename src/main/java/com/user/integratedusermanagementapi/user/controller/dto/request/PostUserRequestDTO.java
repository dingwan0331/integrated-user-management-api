package com.user.integratedusermanagementapi.user.controller.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostUserRequestDTO {
    private String username;
    private String password;
    private String nickName;
    private String mobilePhoneNumber;
}
