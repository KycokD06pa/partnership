package bsu.project.partnership.service.Impl;

import bsu.project.partnership.config.MyUserDetails;
import bsu.project.partnership.model.User;
import bsu.project.partnership.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = repository.findByName(username);
        return user.map(MyUserDetails::new)
                .orElseThrow(()-> new UsernameNotFoundException(username + " not found"));
    }



}
