package com.example.demo.Controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
      @Autowired
      private UserService userService;

      @RequestMapping(value = "find")
      public User findUser(){
          return userService.selectByName("aaa");
      }
}
