package ru.duo.DUO.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import ru.duo.DUO.config.FeignClientConfig;
import ru.duo.DUO.model.Post;

import java.util.List;

@FeignClient(name = "postFeignClient", configuration = FeignClientConfig.class, url = "${feign.client.baseUrl}")
public interface PostFeignClient {
    @GetMapping("/posts")
    List<Post> getAllPosts();

    @GetMapping("/posts/{postId}")
    Post getPostById(@PathVariable Long postId);

    @GetMapping("/posts")
    List<Post> getPostByUserId(@RequestParam Long userId);

    @PostMapping("/posts")
    Post createPost(Post post);

    @PutMapping("/posts")
    Post updatePost(Post post);

    @DeleteMapping("/posts/{postId}")
    Post deletePost(@PathVariable Long postId);
}