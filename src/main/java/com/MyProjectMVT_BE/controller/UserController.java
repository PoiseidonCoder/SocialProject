package com.MyProjectMVT_BE.controller;

import com.MyProjectMVT_BE.dto.request.User.UserRegisterRequest;
import com.MyProjectMVT_BE.dto.request.User.UserUpdateRequest;
import com.MyProjectMVT_BE.dto.response.User.UserResponse;
import com.MyProjectMVT_BE.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

    UserService userService;

    @GetMapping("/find-by-id/{id}")
    public UserResponse findUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    @GetMapping("/find-by-email")
    public UserResponse findUserByEmail(@RequestParam String email) {
        return userService.findUserByEmail(email);
    }

    @GetMapping("search-user")
    public List<UserResponse> searchUser(@RequestParam String value) {
        return userService.searchUser(value);
    }

    @PostMapping("/register-user")
    public String registerUser(@RequestBody UserRegisterRequest request) {
        return userService.registerUser(request);
    }

    @PostMapping("/follow-user")
    public String followUser(@RequestParam Long userId1, @RequestParam Long userId2) {
        return userService.followUser(userId1, userId2);
    }

    @PutMapping("/update-user/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(id, request);
    }

    @DeleteMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
