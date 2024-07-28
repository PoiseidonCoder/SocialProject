package com.MyProjectMVT_BE.mapper;

import com.MyProjectMVT_BE.dto.response.Post.PostResponse;
import com.MyProjectMVT_BE.model.Post;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {

    PostResponse toPostResponse(Post post);

}
