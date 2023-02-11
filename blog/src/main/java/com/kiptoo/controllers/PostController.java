package com.kiptoo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kiptoo.models.*;

@Controller
@RequestMapping("/posts")
public class PostController {
    
    @GetMapping
    
    public String  PostPage(Model  model){
     Post post = new Post();
     post.setTitle("Hello Spring Boot");
     post.setDescription("Spring boot");
     post.setBody("Spring Boot is Awesome");
     model.addAttribute("post", post);
     return "post";
    }
}
