package com.MyProjectMVT_BE.repository;

import com.MyProjectMVT_BE.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>{
}
