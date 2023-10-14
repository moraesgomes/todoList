package br.com.haroldogomes.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first") 
public class MinhaPrimeiraController {

    @GetMapping("/")
    public String firtMessage(){

        return "OK";

    }
    
}
