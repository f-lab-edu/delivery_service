package user.delivery.infrastructure.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import user.delivery.domain.user.User;
import user.delivery.domain.user.repository.UserSave;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserJpaSave implements UserSave {
    private final UserJpaRepository userJpaRepository;

    @Override
    public User saveUser(User initUser) {
        return userJpaRepository.save(initUser);
    }

    @Override
    public User updateUser(User updateUser) {
        return userJpaRepository.save(updateUser);
    }

    @Override
    public void deleteUser(String userId) {
        userJpaRepository.delete(userId);
    }

}
