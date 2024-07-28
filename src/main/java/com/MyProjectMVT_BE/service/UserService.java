package com.MyProjectMVT_BE.service;

import com.MyProjectMVT_BE.dto.request.User.UserRegisterRequest;
import com.MyProjectMVT_BE.dto.request.User.UserUpdateRequest;
import com.MyProjectMVT_BE.dto.response.User.UserResponse;

import java.util.List;

public interface UserService {

    public String registerUser(UserRegisterRequest request);

    public UserResponse findUserById(Long id);

    public UserResponse findUserByEmail(String email);

    public String followUser(Long userId1, Long userId2);

    public String updateUser(Long id,UserUpdateRequest request);

    public List<UserResponse> searchUser(String value);

    public String deleteUser(Long id);
}
