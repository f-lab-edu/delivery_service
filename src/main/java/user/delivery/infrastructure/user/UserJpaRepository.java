package user.delivery.infrastructure.user;

import org.springframework.data.jpa.repository.JpaRepository;
import user.delivery.domain.user.User;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserId(String phone);
    Optional<User> findByUserNickname(String nickname);
    Optional<User> findByUserEmail(String email);

    boolean checkUserIdAndPassword(String userId, String password);

    void delete(String userId);
}