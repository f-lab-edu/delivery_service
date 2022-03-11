package user.delivery.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import user.delivery.domain.Address;

public class UserCommand {


    @Getter
    @ToString
    public static class JoinUserRequest {
        private final String userId;
        private final String password;
        private final String email;
        private final String nickname;
        private final String phone;
        private final Address address;

        @Builder
        public JoinUserRequest(String userId, String password,
                               String nickname, String email,
                               String phone, Address address) {

            this.userId = userId;
            this.email = email;
            this.nickname = nickname;
            this.password = password;
            this.phone = phone;
            this.address = address;
        }

        public User convert() {
            return User.builder()
                    .userId(this.userId)
                    .password(this.password)
                    .nickname(this.nickname)
                    .email(this.email)
                    .phone(this.phone)
                    .address(this.address)
                    .build();
        }

    }

    @Getter
    @ToString
    public static class UpdateUserRequest {
        private final String userId;
        private final String password;
        private final String nickname;
        private final String phone;

        @Builder
        public UpdateUserRequest(String userId,
                                 String password,
                                 String nickname,
                                 String phone) {
            this.userId = userId;
            this.nickname = nickname;
            this.password = password;
            this.phone = phone;
        }

        public User convert() {
            return User.builder()
                    .userId(this.userId)
                    .password(this.password)
                    .nickname(this.nickname)
                    .phone(this.phone)
                    .build();
        }

    }


    @Getter
    @ToString
    public static class UpdateUserPasswordRequest {
        private final String userId;
        private final String passwordBefore;
        private final String passwordAfter;

        @Builder
        public UpdateUserPasswordRequest(String userId,
                                         String passwordBefore,
                                         String passwordAfter) {
            this.userId = userId;
            this.passwordBefore = passwordBefore;
            this.passwordAfter = passwordAfter;
        }

        public User convert() {
            return User.builder()
                    .userId(this.userId)
                    .password(this.passwordAfter)
                    .build();
        }
    }


}
