package com.MyProjectMVT_BE.service;

import com.MyProjectMVT_BE.dto.request.Post.PostCreateRequest;
import com.MyProjectMVT_BE.dto.response.Post.PostResponse;
import com.MyProjectMVT_BE.model.Post;

import java.util.List;

public interface PostService {

    public String createNewPost(PostCreateRequest request, Long userId);

    public PostResponse getPostById(Long postId);

    public List<PostResponse> getAllPosts();

    public List<PostResponse> getPostsByUserId(Long userId);

    public String updatePost(Post post);

    public String deletePost(Long postId);

    public String savedPost(Post post, Long userId);

    public String likePost(Long postId, Long userId);

}
