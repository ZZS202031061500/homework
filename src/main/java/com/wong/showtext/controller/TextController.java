package com.wong.showtext.controller;

import com.wong.showtext.service.ProcessService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/text")
@CrossOrigin(origins = "http://localhost:8080")
public class TextController {

    @Resource
    private ProcessService processService;

    @PostMapping("/upload")
    public List<String> getText(@RequestBody List<String> sentences)  {
        List<String> strings = processService.shiftAndSort(sentences);
        return strings;
    }
}
