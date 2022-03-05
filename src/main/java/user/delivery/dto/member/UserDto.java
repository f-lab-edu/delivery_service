package user.delivery.dto.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class UserDto {

    public enum Type {
        PARTNER, USER
    }

    @NotEmpty(message = "id를 적어주세요.")
    private String id;


    @NotEmpty(message = "비밀번호를 적어주세요.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$\n",
            message = "10자 이상 영어 대문자, 소문자, 숫자 , 특수문자 중 2종류를 조합이여야 합니다.")
    private String password;


    @NotEmpty(message = "닉네임를 적어주세요.")
    @Size(min = 2, max = 8)
    private String nickname;


    @NotEmpty(message = "휴대폰번호를 적어주세요.")
    private String phone;


    @NotEmpty(message = "이메일을 적어주세요.")
    private String email;


    @NotEmpty(message = "주소를 적어주세요.")
    private String address;


    @NotEmpty(message = "회원가입 유형을 선택해주세요.")
    private Type type;

}
