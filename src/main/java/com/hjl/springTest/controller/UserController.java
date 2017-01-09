package com.hjl.springTest.controller;

import com.hjl.springTest.bean.User;
import com.hjl.springTest.dao.UserMapper;
import com.hjl.springTest.service.IUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/11/10.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    @RequestMapping("/user")
    public String getUserPage(HttpServletRequest request, Model model){
//        User user = new User();
//        user.setUserName("哈哈");
//        user.setAge(19);
//        model.addAttribute("user" ,user);
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "user";
    }
}
