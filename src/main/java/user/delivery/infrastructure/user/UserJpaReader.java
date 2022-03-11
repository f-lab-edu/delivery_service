package user.delivery.infrastructure.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import user.delivery.domain.user.User;
import user.delivery.domain.user.repository.UserReader;

import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserJpaReader implements UserReader {
    private final UserJpaRepository userJpaRepository;

    @Override
    public Optional<User> findByUserId(String phone) {
        return userJpaRepository.findByUserId(phone);
    }

    @Override
    public Optional<User> findByUserNickname(String nickname) {
        return userJpaRepository.findByUserNickname(nickname);
    }

    @Override
    public Optional<User> findByUserEmail(String email) {
        return userJpaRepository.findByUserEmail(email);
    }

    @Override
    public boolean checkIdAndPassword(String id, String password) {
        return userJpaRepository.checkUserIdAndPassword(id, password);
    }
}
