package com.springboot.blog.service;

import com.springboot.blog.payload.EmployeeDTO;
import com.springboot.blog.payload.LoginDTO;
import com.springboot.blog.payload.LoginMesage;

public interface EmployeeService {
    String addEmployee(
            EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);
}
