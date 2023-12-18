package bsu.project.partnership.service.Impl;

import bsu.project.partnership.config.MyUserDetails;
import bsu.project.partnership.model.User;
import bsu.project.partnership.repository.UserRepository;
import bsu.project.partnership.service.UserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final PasswordEncoder encoder;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }


    @Override
    public User addUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));

        return repository.save(user);
    }


    @Override
    @Transactional
    public void delete(User user) {

        repository.delete(user);
    }
}
