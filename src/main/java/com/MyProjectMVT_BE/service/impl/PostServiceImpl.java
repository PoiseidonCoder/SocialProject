package com.MyProjectMVT_BE.service.impl;

import com.MyProjectMVT_BE.dto.request.Post.PostCreateRequest;
import com.MyProjectMVT_BE.dto.response.Post.PostResponse;
import com.MyProjectMVT_BE.mapper.PostMapper;
import com.MyProjectMVT_BE.model.Post;
import com.MyProjectMVT_BE.model.User;
import com.MyProjectMVT_BE.repository.PostRepository;
import com.MyProjectMVT_BE.repository.UserRepository;
import com.MyProjectMVT_BE.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {

    PostRepository postRepository;
    UserRepository userRepository;

    PostMapper postMapper;

    @Override
    public String createNewPost(PostCreateRequest request, Long userId) {

        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User with id " + userId + " not found!"));

        Post post = Post.builder()
                .caption(request.getCaption())
                .image(request.getImage())
                .video(request.getVideo())
                .user(user)
                .build();
        postRepository.save(post);

        return "Post created successfully!";

    }

    @Override
    public PostResponse getPostById(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new RuntimeException("Post with id " + postId + " not found!"));
        return postMapper.toPostResponse(post);
    }

    @Override
    public List<PostResponse> getAllPosts() {
        return List.of();
    }

    @Override
    public List<PostResponse> getPostsByUserId(Long userId) {
        return List.of();
    }

    @Override
    public String updatePost(Post post) {
        return "";
    }

    @Override
    public String deletePost(Long postId) {
        return "";
    }

    @Override
    public String savedPost(Post post, Long userId) {
        return "";
    }

    @Override
    public String likePost(Long postId, Long userId) {
        return "";
    }
}
