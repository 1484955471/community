package lcs.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 未知
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String Hello(@RequestParam(name = "name") String name, Model midel){
        midel.addAttribute("name",name);
        return "hello";

    }
}
