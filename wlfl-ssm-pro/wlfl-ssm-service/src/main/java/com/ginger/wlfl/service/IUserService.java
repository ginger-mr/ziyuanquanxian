package com.ginger.wlfl.service;

import com.ginger.wlfl.pojo.Role;
import com.ginger.wlfl.pojo.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    public List<UserInfo> findAll();
    public void saveUserInfo(UserInfo userInfo);
    public UserInfo findById(String userId);
    public void addRoleToUser(String userId,String[] ids);
    public List<Role> findByIdAndOtherRole(String userId);
}
