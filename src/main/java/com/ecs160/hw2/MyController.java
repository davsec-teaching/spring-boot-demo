package com.ecs160.hw2;

import org.springframework.web.bind.annotation.*;

class MyRequest {
    private String postDate;
    private String postContent;

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}

@RestController
@RequestMapping("/myservice")
public class MyController {
    /*
    curl.exe -X POST http://localhost:30000/moderate -H "Content-type: application/json" -d '{\"postContent\": \"Hello, duck Spring Boot!\"}'
     */
    @PostMapping("/sayhello")
    public String sayHello(@RequestBody MyRequest request) {
        return "You said: " + request.getPostContent();
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "ECS 160") String name) {
        return String.format("Hello, %s!", name);
    }
}
