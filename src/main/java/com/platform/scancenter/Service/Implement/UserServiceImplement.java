package com.platform.scancenter.Service.Implement;

import com.platform.scancenter.Service.UserService;
import com.platform.scancenter.dto.CustomUserDetail;
import com.platform.scancenter.enumeration.UserStatus;
import com.platform.scancenter.model.User;
import com.platform.scancenter.repository.RoleRepository;
import com.platform.scancenter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Objects;

/**
 * TranCung
 * 17/07/2022
 * User Service Implement
 */
@Service
public class UserServiceImplement implements UserService, UserDetailsService {

    @Autowired
    private RoleRepository repository;

    @Autowired
    private UserRepository userRepository;

    /**
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        // validate
        if(Objects.isNull(user) || UserStatus.DISABLE.getStatusId().equals(user.getStatus())){
            throw new UsernameNotFoundException(username);
        }
        String role = user.getRole().getRole();
        return new CustomUserDetail(user.getUserId(), user.getUsername(),
                user.getPassword(),
                Arrays.asList(new SimpleGrantedAuthority(role)),
                role,
                user.getEmail());
    }
}
