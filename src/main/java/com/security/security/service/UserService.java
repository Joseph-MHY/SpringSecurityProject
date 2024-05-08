package com.security.security.service;

import com.security.security.dto.UserDto;
import com.security.security.model.User;

public interface UserService {

    User save(UserDto userDto);
}
