package com.canteen.canteen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "login";
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }
    @GetMapping("/order")
public String order() {
    return "order";
}
@GetMapping("/admin")
public String admin() {
    return "admin";
}
}
