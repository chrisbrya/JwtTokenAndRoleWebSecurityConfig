package com.chrisbry.springbootjwt.service;

import com.chrisbry.springbootjwt.dao.RoleDao;
import com.chrisbry.springbootjwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){
      return roleDao.save(role);
    }
}
