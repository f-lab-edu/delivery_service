package user.delivery.dto.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class UserDto {

    public enum Type{
        PARTNER, USER
    }

    @NonNull
    private String id;

    @NonNull
    private String password;

    @NonNull
    private String nickname;

    @NonNull
    private String phone;

    @NonNull
    private String email;

    @NonNull
    private String address;

    @NonNull
    private Type type;

}
