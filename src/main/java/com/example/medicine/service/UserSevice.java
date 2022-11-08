package com.example.medicine.service;

import com.example.medicine.entity.User;
import com.example.medicine.model.dto.UserDto;
import com.example.medicine.model.dto.UserLoginDto;
import com.example.medicine.model.dto.UserSignupDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserSevice {
    public List<UserDto> getListUser();

    public boolean addUser(UserSignupDto userSignupDto);

    public UserDto getUser(UserLoginDto userLoginDto);
}
