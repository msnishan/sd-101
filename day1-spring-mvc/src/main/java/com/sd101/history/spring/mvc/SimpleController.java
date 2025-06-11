package com.sd101.history.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class SimpleController {

    @GetMapping("/simple")
    public String simpleTemplate(Model model) {
        model.addAttribute("name", "day1");
        model.addAttribute("time", LocalDateTime.now().toString());
        return "/WEB-INF/hello.jsp";
    }
}
