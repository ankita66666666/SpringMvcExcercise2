package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import static org.graalvm.compiler.options.OptionType.User;

@Controller
//This Class is used to mark as controller class.
//it handles the bussiness logic.

public class AppController {

// This annotation maps HTTP requests to handler methods of MVC and REST controllers.
    @RequestMapping(value = "/")
    public String greeting(ModelMap map) {
        return "index";
    }

    @RequestMapping(value = "/success")
    public String success(@RequestParam("username") String username, @RequestParam("password") String passsword, ModelMap map) {
        User user = new User();
        user.setName(username);
        map.addAttribute("user", user.getName());
        return "success";
    }

}


