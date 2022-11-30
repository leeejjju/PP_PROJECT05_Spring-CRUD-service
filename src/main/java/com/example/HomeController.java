package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("classlist")
    public String list(Model model){
        List<String> list = new ArrayList<String>();
        list.add("Yeji Song");
        list.add("Hanmin Park");
        list.add("Jinju Lee");

        model.addAttribute("classlist", list);
        String msg = "동뱅지킴이 List";
        model.addAttribute("title", msg);

        return "board/list";
    }
}

