package com.pluralsight.blog;

import org.springframework.stereotype.Controller;

@Controller
public class BlogController {

    @RequestMapping("/")
    public String listPosts(ModelMap modelMap){

        modelMap.put("title", "Blog Post 1");

        return "home";
    }

}
