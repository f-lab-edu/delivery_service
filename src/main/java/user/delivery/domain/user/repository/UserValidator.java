package user.delivery.domain.user.repository;

public interface UserValidator {
    void checkDuplicateUserId(String userId);
    void checkUserId(String userId);
    void checkEmail(String email);
    void checkNickname(String nickname);
    void checkIdAndPassword(String userId, String password);
}
