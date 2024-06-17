package com.kedi.security.springsecurity.service;

import com.kedi.security.springsecurity.repository.OurUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class OurUserDetailService implements UserDetailsService {

    @Autowired
    private OurUsersRepository ourUsersRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return ourUsersRepository.findByEmail(username).orElseThrow();
    }
}
