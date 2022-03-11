package user.delivery.domain.user;

import user.delivery.domain.Address;

import javax.persistence.Embedded;

@SuppressWarnings("FieldCanBeLocal")
public class UserInfo {
    private final Long id;
    private final String userId;
    private final String password;
    private final String nickname;
    private final String email;
    private final String phone;

    @Embedded
    private final Address address;

    public UserInfo(User user) {
        this.id = user.getId();
        this.userId = user.getUserId();
        this.password = user.getPassword();
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.address = user.getAddress();
    }
}
