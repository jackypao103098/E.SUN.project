package com.springboot.blog.service;

import com.springboot.blog.payload.LoginDTO;
import com.springboot.blog.payload.LoginMesage;
import com.springboot.blog.payload.UserDTO;

public interface UserService {
String addUser(
            UserDTO userDTO);

    LoginMesage loginUser(LoginDTO loginDTO);

}
