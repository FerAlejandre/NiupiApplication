package com.heroku.heroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@RequestMapping(value = "/heroku/")
@RestController
@Slf4j

public class NiupiController {

    @GetMapping(value = "/get")
    @ResponseStatus(HttpStatus.OK)
    public String getOperation() {
        log.info("Calling Get Operation");
        return "Hello World, this is a get operation";
    }

    @PostMapping(value = "/post")
    @ResponseStatus(HttpStatus.OK)
    public String postOperation() {
        log.info("Calling Post Operation");
        return "This is a post operation";
    }

    @PutMapping(value = "/put")
    @ResponseStatus(HttpStatus.OK)
    public String putOperation() {
        log.info("Calling Put Operation");
        return "This is a put operation";
    }

    @PatchMapping(value = "/patch")
    @ResponseStatus(HttpStatus.OK)
    public String patchOperation() {
        log.info("Calling Patch Operation");
        return "This is a patch operation";
    }

    @DeleteMapping(value = "/delete")
    @ResponseStatus(HttpStatus.OK)
    public String deleteOperation() {
        log.info("Calling Delete Operation");
        return "This is a delete operation";
    }


}

