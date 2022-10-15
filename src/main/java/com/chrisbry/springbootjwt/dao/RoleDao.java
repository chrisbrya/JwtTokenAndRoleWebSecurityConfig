package com.chrisbry.springbootjwt.dao;

import com.chrisbry.springbootjwt.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {
}
