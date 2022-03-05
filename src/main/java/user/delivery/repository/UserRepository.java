package user.delivery.repository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import user.delivery.dto.member.UserDto;

import java.util.Optional;

@Repository
public interface UserRepository {

    boolean joinUser(UserDto user);

    boolean checkLogIn(@Param("id") String id, @Param("password") String password);

    UserDto updatePassword(String id, String password);

    void updateUser(@Param("id") String id, @Param("password") String password, @Param("phone")String phone);

    void deleteUser(String id);

    boolean findById(String phone);

    UserDto findByUser(String id);

    UserDto findByEmail(String email);
}
