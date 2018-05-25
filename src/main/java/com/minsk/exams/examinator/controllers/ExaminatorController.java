package com.minsk.exams.examinator.controllers;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/exams")
public class ExaminatorController {
    @GetMapping("/ping")
    public String ping(){
        return "OK 73";
    }


    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "hello " + name;
    }

    @GetMapping("/hello")
    public String hello2(@RequestParam("name") String name) {
        return "hello2 " + name;
    }

    @PostMapping("/exam")
    public Exam exam(@RequestBody Map<String,Integer> map){
        System.out.println(map);
        return new Exam("JAVA");
    }















}
