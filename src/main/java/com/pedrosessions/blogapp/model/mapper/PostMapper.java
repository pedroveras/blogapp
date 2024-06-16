package com.pedrosessions.blogapp.model.mapper;

import com.pedrosessions.blogapp.model.dto.PostResponseDto;
import com.pedrosessions.blogapp.model.entity.Post;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    List<PostResponseDto> postListPostResponseDtoList(List<Post> post);
}
