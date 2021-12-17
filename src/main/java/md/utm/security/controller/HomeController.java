package md.utm.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/*")
    public String redirectToRegistration() {
        return "home";
    }
}
