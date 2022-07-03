package ru.duo.DUO.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.duo.DUO.model.Post;
import ru.duo.DUO.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() { return postService.getAllPosts(); }

    @GetMapping("/{postId}")
    public Post getPostById(@PathVariable Long postId) { return postService.getPostById(postId); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(Post post) { return postService.createPost(post); }

    @PutMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePost(@PathVariable Long postId, Post post) { postService.updatePost(postId, post); }

    @DeleteMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePost(@PathVariable Long postId) { postService.deletePost(postId); }
}