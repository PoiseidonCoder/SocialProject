package com.MyProjectMVT_BE.dto.request.User;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserRegisterRequest {

    String firstName;

    String lastName;

    String email;

    String password;

}
