package com.ead.posgateway.Demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/get")
    public ResponseEntity<String> sayHelloGet(){
        return ResponseEntity.ok("GET: Hello from secured endpoint");
    }

    @PostMapping("/post")
    public ResponseEntity<String> sayHelloPost(){
        return ResponseEntity.ok("GET: Hello from secured endpoint");
    }
}
