package user.delivery.domain.user.service;

import user.delivery.domain.user.UserCommand;
import user.delivery.domain.user.UserInfo;

public interface UserService {
    UserInfo joinUser(UserCommand.JoinUserRequest request);
    UserInfo updateUserNickName(UserCommand.UpdateUserRequest request);
    UserInfo updateUserPassword(UserCommand.UpdateUserPasswordRequest request);
    UserInfo findByUserId(String phone);
    UserInfo changeUserPasswordByForget(UserCommand.UpdateUserPasswordRequest request);
    void deleteUser(String userId, String password);
}
