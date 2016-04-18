package com.test.ondony.service.impl;
 
import java.util.List;
 
import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;
 
import com.test.ondony.dao.UserDao;
import com.test.ondony.model.User;
import com.test.ondony.service.UserService;
 
@Service("userService")
public class UserServiceImpl implements UserService {
     
    @Resource(name="userDao")
    private UserDao userDao;
 
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}