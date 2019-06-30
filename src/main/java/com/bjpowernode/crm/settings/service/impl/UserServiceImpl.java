package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.exception.LoginException;
import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.utils.DateTimeUtil;
import com.bjpowernode.crm.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
    @Override
    public User login(String loginAct, String loginPwd, String ip) throws LoginException {
        Map<String,String> map=new HashMap<>();
        map.put("loginAct", loginAct);
        map.put("loginPwd", loginPwd);
        User user=userDao.login(map);

        if (user==null){
            //进入到这，说明账号密码错误
            throw new LoginException("账号密码不正确");
        }

        //到这里说明，账号密码正确，user不为null
        //验证其他信息
        //验证失效时间
        String expireTime=user.getExpireTime();
        if (expireTime.compareTo(DateTimeUtil.getSysTime())<0){
            throw new LoginException("账号已经失效");
        }
        //验证锁定状态
        String lockState=user.getLockState();
        if ("0".equals(lockState)){
            throw new LoginException("账号已锁定");
        }

        //验证IP地址
        String allowIps=user.getAllowIps();
        if (!allowIps.contains(ip)){
            throw new LoginException("IP已受限");
        }

        //如果到这里，说明没有抛出任何异常，说明登录成功。返回user对象
        return user;
    }

    @Override
    public List<User> getUserList() {
        List<User> uList=userDao.getUserList();
        return uList;
    }
}
