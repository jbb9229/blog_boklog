package com.boong.boklog.controller;

import com.boong.boklog.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PostController {

    @PostMapping("/posts")
    public String post(@RequestBody PostCreate postCreate) {
        log.info("params = {}", postCreate);
        return "Hello World";
    }

}
