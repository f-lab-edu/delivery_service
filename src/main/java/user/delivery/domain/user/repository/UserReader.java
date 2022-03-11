package user.delivery.domain.user.repository;

import user.delivery.domain.user.User;

import java.util.Optional;

public interface UserReader {
    Optional<User> findByUserId(String userId);
    Optional<User> findByUserNickname(String nickname);
    Optional<User> findByUserEmail(String email);
    boolean checkIdAndPassword(String id, String password);
}
