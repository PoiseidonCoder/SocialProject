package com.MyProjectMVT_BE.mapper;

import com.MyProjectMVT_BE.dto.request.User.UserRegisterRequest;
import com.MyProjectMVT_BE.dto.response.User.UserResponse;
import com.MyProjectMVT_BE.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserRegisterRequest request);

    UserResponse toUserResponse(User user);

    List<UserResponse> toListUserResponse(List<User> users);

}
