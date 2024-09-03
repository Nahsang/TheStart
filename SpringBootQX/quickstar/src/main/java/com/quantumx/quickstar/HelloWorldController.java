package com.quantumx.quickstar;
// spring web with a single endpoint

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

@GetMapping("/hello")
public String helloWorld(){
    return "hello QuantumX";
}


}
