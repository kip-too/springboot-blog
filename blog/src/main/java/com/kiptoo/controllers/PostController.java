package com.kiptoo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kiptoo.models.*;
import com.kiptoo.service.*;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    
    @GetMapping
    
    public String  PostPage(Model  model){
     model.addAttribute("posts", PostService.findAllPosts());
     return "post";
    }

    @GetMapping("/add")
    public String addpostPage(Model model){
        model.addAttribute ("post", new Post());
        return "addPost";
    }
    
     @PostMapping
     public String addPost(@ModelAttribute("post") Post post) {
         PostService.addPost(post);
            return "redirect:/posts";
    }

}
