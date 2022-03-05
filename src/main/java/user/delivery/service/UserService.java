package user.delivery.service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import user.delivery.dto.member.UserDto;
import user.delivery.repository.UserRepository;

import javax.servlet.http.HttpSession;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void signUp(UserDto user) {
        if (validateDuplicateUser(user)) {
            throw new IllegalStateException("이미 존재하는 아이디입니다.");
        }
        UserDto joinUser = toEntity(user);
        userRepository.join(joinUser);
    }

    public UserDto toEntity(UserDto user) {
        var passwordEncoder = passwordEncoder(user.getPassword());
        UserDto entity = UserDto.builder()
                .id(user.getId())
                .password(passwordEncoder)
                .nickname(user.getNickname())
                .phone(user.getPhone())
                .email(user.getEmail())
                .address(user.getAddress())
                .type(user.getType())
                .build();
        return entity;
    }

    public String passwordEncoder(String password) {
        var encoder = new BCryptPasswordEncoder().encode(password);
        return encoder;
    }

    public boolean validateDuplicateUser(UserDto user) {
        return userRepository.findById(user.getPhone());
    }


    public boolean logIn(String id, String password, HttpSession session) {
        var passwordEncoder = passwordEncoder(password);
        boolean result = userRepository.checkLogIn(id, passwordEncoder);
        if (result) {
            UserDto user = userRepository.findByUser(id);

            session.setAttribute("userId", user.getId());
            session.setAttribute("userNick", user.getNickname());
        }

        return result;
    }

    public void logOut(HttpSession session) {
        session.invalidate();
    }

    public void updateUserInfo(String id, String password, String phone, HttpSession session) {
        String sessionId = session.getId();

        if (session.equals(id)) {
            userRepository.updateUser(id, password, phone);
        }

    }

    public void updatePassword() {


    }

    public void findById() {

    }

    public void deleteUser() {

    }


}
