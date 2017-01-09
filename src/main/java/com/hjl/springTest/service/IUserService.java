package com.hjl.springTest.service;


import com.hjl.springTest.bean.User;
import org.springframework.stereotype.Service;

public interface IUserService {
    public User getUserById(int userId);
}
