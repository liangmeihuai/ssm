package vin.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import vin.ssm.dao.IUserDao;
import vin.ssm.pojo.User;
import vin.ssm.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }
}
