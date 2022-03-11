package user.delivery.domain.user.repository;

import user.delivery.domain.user.User;

public interface UserSave {
    User saveUser(User initUser);
    User updateUser(User modify);
    void deleteUser(String userId);
}
