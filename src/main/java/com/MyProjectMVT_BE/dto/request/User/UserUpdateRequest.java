package com.MyProjectMVT_BE.dto.request.User;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserUpdateRequest {

    String firstName;

    String lastName;

    String email;
}
