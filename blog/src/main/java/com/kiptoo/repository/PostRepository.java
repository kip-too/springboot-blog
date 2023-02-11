package com.kiptoo.repository;

import java.util.*;
import com.kiptoo.models.*;
import java.util.concurrent.*;

public class PostRepository {
    private final Set<Post> posts = new CopyOnWriteArraySet<>();
    public void addPost(Post post){
        posts.add(post);
    }

    public Set<Post> findAllPosts(){
        return posts;
    }
}
