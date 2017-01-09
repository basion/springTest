package com.hjl.springTest.service.impl;

import com.hjl.springTest.bean.User;
import com.hjl.springTest.dao.UserMapper;
import com.hjl.springTest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/1/9.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userDao;
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
