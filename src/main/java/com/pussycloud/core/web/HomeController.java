package com.pussycloud.core.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 主页的控制器类
 * @author ZYJ
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
