package com.MyProjectMVT_BE.dto.response.User;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserResponse {

    Long id;

    String firstName;

    String lastName;

    String email;

    String password;

    List<Long> followers;

    List<Long> followings;
}
