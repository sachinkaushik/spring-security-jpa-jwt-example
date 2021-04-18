package com.springbootsecurityjwt.service;


import com.springbootsecurityjwt.entity.MyUser;
import com.springbootsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailService implements UserDetailsService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       MyUser myUser = null;
        try {
            myUser = userRepository.findByUserName(userName);
        }catch(Exception e){

        }
        return new User(myUser.getUserName(), myUser.getPassword(), new ArrayList<>());
    }
}
