package com.MyProjectMVT_BE.service.impl;

import com.MyProjectMVT_BE.dto.request.User.UserRegisterRequest;
import com.MyProjectMVT_BE.dto.request.User.UserUpdateRequest;
import com.MyProjectMVT_BE.dto.response.User.UserResponse;
import com.MyProjectMVT_BE.mapper.UserMapper;
import com.MyProjectMVT_BE.model.User;
import com.MyProjectMVT_BE.repository.UserRepository;
import com.MyProjectMVT_BE.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)

public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    UserMapper userMapper;

    @Override
    public String registerUser(UserRegisterRequest request) {
        userRepository.save(userMapper.toUser(request));
        return "User registered successfully";
    }

    @Override
    public UserResponse findUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User with Id: " + id + " not found"));
        return userMapper.toUserResponse(user);
    }

    @Override
    public UserResponse findUserByEmail(String value) {
        return userMapper.toUserResponse(userRepository.findByEmail(value));
    }

    @Override
    public String followUser(Long userId1, Long userId2) {
        User user1 = userRepository.findById(userId1)
                .orElseThrow(() -> new RuntimeException("User with Id: " + userId1 + " not found"));
        User user2 = userRepository.findById(userId2)
                .orElseThrow(() -> new RuntimeException("User with Id: " + userId2 + " not found"));
        user1.getFollowings().add(userId2);
        user2.getFollowers().add(userId1);
        userRepository.save(user1);
        userRepository.save(user2);
        return "User followed successfully";
    }

    @Override
    public String updateUser(Long id,UserUpdateRequest request) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User with Id: " + id + " not found"));
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        userRepository.save(user);
        return "User updated successfully";
    }

    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User deleted successfully";
    }

    @Override
    public List<UserResponse> searchUser(String value) {
        return userMapper.toListUserResponse(userRepository.searchUser(value));
    }
}
