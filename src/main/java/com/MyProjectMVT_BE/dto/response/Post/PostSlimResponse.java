package com.MyProjectMVT_BE.dto.response.Post;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class PostSlimResponse {

    Long id;

    String caption;

    String image;

    String video;

    LocalDateTime createdAt;

}
