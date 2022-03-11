package user.delivery.domain.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import user.delivery.domain.user.UserCommand;
import user.delivery.domain.user.UserInfo;
import user.delivery.domain.user.repository.UserReader;
import user.delivery.domain.user.repository.UserSave;
import user.delivery.domain.user.repository.UserValidator;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserSave userSave;
    private final UserReader userReader;
    private final UserValidator userValidator;

    @Override
    public UserInfo joinUser(UserCommand.JoinUserRequest request) {
        userValidator.checkDuplicateUserId(request.getUserId());
        userValidator.checkEmail(request.getEmail());
        userValidator.checkNickname(request.getNickname());

        var initUser = request.convert();
        var user = userSave.saveUser(initUser);

        return new UserInfo(user);
    }


    @Override
    public UserInfo updateUserNickName(UserCommand.UpdateUserRequest request) {
        userValidator.checkUserId(request.getUserId());
        userValidator.checkNickname(request.getNickname());

        var updateUser = request.convert();
        var user = userSave.updateUser(updateUser);

        return new UserInfo(user);
    }

    @Override
    public UserInfo updateUserPassword(UserCommand.UpdateUserPasswordRequest request) {
        userValidator.checkUserId(request.getUserId());
        String passwordBefore = request.getPasswordBefore();
        String passwordAfter = request.getPasswordAfter();
        userValidator.checkIdAndPassword(request.getUserId(), passwordBefore);

        var updateUser = request.convert();
        var user = userSave.updateUser(updateUser);


        return new UserInfo(user);
    }

    @Override
    public UserInfo findByUserId(String phone) {
        // TODO: 휴대폰인증은 controller작성 시 진행예정

        return null;
    }

    @Override
    public UserInfo changeUserPasswordByForget(UserCommand.UpdateUserPasswordRequest request) {
        userValidator.checkUserId(request.getUserId());

        var updateUser = request.convert();
        var user = userSave.updateUser(updateUser);

        return new UserInfo(user);
    }

    @Override
    public void deleteUser(String userId, String password) {
        userValidator.checkUserId(userId);
        userValidator.checkIdAndPassword(userId, password);
        userSave.deleteUser(userId);

    }


}
