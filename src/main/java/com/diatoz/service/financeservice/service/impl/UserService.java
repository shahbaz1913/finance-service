package com.diatoz.service.financeservice.service.impl;

import com.diatoz.service.financeservice.entity.User;
import com.diatoz.service.financeservice.repository.UserRepo;
import com.diatoz.service.financeservice.utils.JwtToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Objects;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;
    @Autowired
    AuthenticationManager authenticationManager;

    public String authenticate(String userName, String password) {

        if (userName != null && password != null) {
            com.diatoz.service.financeservice.entity.User user = this.userRepo.findByUserName(userName);
            if (Objects.equals(user.getPassword(), password)) {
                Authentication authentication = authenticationManager
                        .authenticate(new UsernamePasswordAuthenticationToken(userName, password));
                JwtToken jwtToken = new JwtToken();
                return jwtToken.generateToken(authentication);
            } else {
                return "Password not correct";
            }
        } else {
            return "Enter valid userName and password";
        }

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getuserName(username), user.getPassword(),
                new ArrayList<>());
    }

     /* @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("shahbaz", "1234", new ArrayList<>());
    }*/
}
