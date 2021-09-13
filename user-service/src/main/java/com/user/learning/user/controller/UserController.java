package com.user.learning.user.controller;

import com.user.learning.user.entity.User;
import com.user.learning.user.service.UserService;
import com.user.learning.user.vo.UserDepartmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public UserDepartmentVO getByUserId(@PathVariable Long id){
        return userService.getByUserId(id);
    }
    @PostMapping("/")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
