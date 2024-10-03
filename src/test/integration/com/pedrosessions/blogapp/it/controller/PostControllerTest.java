package com.pedrosessions.blogapp.it.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pedrosessions.blogapp.model.dto.PostResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void init() throws Exception {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/v1/posts", String.class);
        var posts = mapper.readValue(response.getBody(), new TypeReference<List<PostResponseDto>>() {});

        posts.size();
    }
}