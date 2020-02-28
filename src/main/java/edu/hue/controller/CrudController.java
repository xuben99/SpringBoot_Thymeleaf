package edu.hue.controller;

import edu.hue.Mapper.UserMapper;
import edu.hue.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class CrudController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/sel")
    private String selectAll(Model model){
        model.addAttribute("users",userMapper.findAll());
        return "list";
    }

    @RequestMapping("/edit")
    private String edit(Model model,Integer userid){
        model.addAttribute("user",userMapper.getOne(userid));
        return "edit";
    }

    @RequestMapping("/save")
    private String upadate(Model model,User user){
        if(userMapper.findAll().contains(user)){
            model.addAttribute("users",userMapper.findAll());
            return "list";
        }
        userMapper.save(user);
        model.addAttribute("users",userMapper.findAll());

        return "list";
    }

    @RequestMapping("/delete")
    private String delete(Model model,Integer userid){
            userMapper.deleteById(userid);
            model.addAttribute("users",userMapper.findAll());
            return "list";
    }

    @RequestMapping("/add")
    private String add(Model model){
        return "add";
    }

}
