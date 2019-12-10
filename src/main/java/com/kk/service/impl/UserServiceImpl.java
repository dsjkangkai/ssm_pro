package com.kk.service.impl;

import com.kk.service.UserService;
import com.kk.dao.UserDao;
import com.kk.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

/**
* Created by kk on 2019-12-10.
*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(UserPo user){
        return userDao.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(UserPo user){
        return userDao.delete(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deletes(Integer[] ids) {
        return  userDao.deletes(ids);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int update(UserPo user){
        return userDao.update(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<UserPo> select(Map<String,Object> map){
        return userDao.select(map);
    }

    @Override
    public UserPo selectById(Integer id){
        return userDao.selectById(id);
    }

    @Override
    public UserPo getUserByName(String username) {
        return userDao.getUserByName(username);
    }

}