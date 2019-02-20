package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;


/**
 * @author: hxy
 * @description: 文章相关Controller
 * @date: 2017/10/24 16:04
 */
@RestController
@RequestMapping("/abc")
public class ArticleController {

    @GetMapping("/getabc")
    public String getAbc() {
        return "abc";
    }


}
