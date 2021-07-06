package com.example.javaregex.controller;

import com.example.javaregex.service.SolutionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/solution")
public class SolutionController {

    private final SolutionService service;

    @RequestMapping(path = "/")
    public List<String> generateSolution() {
        return service.generateSolution();
    }

    @RequestMapping(path = "/docker")
    public List<String> generateSolutionForDocker(@RequestParam Map<String, String> params) {
        return service.generateSolutionForDocker(params);
    }
}
