package com.kiptoo.service;
import org.springframework.stereotype.Service;

import com.kiptoo.models.*;
import java.util.*;
import com.kiptoo.repository.*;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class PostService {
    private static PostRepository postRepository;

    public static void addPost(Post post){
      postRepository.addPost(post);
    }

public static Set<Post> findAllPosts(){
    return postRepository.findAllPosts();
}
}
