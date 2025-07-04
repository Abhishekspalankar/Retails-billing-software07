package in.shekhar.billingsoftware.service;

import in.shekhar.billingsoftware.io.UserRequest;
import in.shekhar.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
