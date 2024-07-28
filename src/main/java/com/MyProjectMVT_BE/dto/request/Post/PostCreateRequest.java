package com.MyProjectMVT_BE.dto.request.Post;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class PostCreateRequest {

    String caption;

    String image;

    String video;

}
