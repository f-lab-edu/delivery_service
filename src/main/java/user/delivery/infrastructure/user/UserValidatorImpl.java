package user.delivery.infrastructure.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import user.delivery.domain.user.repository.UserReader;
import user.delivery.domain.user.repository.UserValidator;

@Component
@RequiredArgsConstructor
public class UserValidatorImpl implements UserValidator {
    private final UserReader userReader;

    @Override
    public void checkDuplicateUserId(String userId) {
        var user = userReader.findByUserId(userId);
        if (user.isPresent()) throw new RuntimeException("이미 가입된 아이디입니다");
    }

    @Override
    public void checkUserId(String userId) {
        var user = userReader.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("존재하지 않는 사용자 입니다."));
    }

    @Override
    public void checkEmail(String email) {
        var user = userReader.findByUserEmail(email);
        if (user.isPresent()) throw new RuntimeException("이미 가입된 이메일입니다");
    }

    @Override
    public void checkNickname(String nickname) {
        var user = userReader.findByUserNickname(nickname);
        if (user.isPresent()) throw new RuntimeException("이미 생성된 닉네임입니다");
    }

    @Override
    public void checkIdAndPassword(String userId, String password) {
        if (!userReader.checkIdAndPassword(userId, password)) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        }
    }
}
