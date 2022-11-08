package com.example.medicine.model.mapper;

import com.example.medicine.entity.User;
import com.example.medicine.model.dto.UserDto;
import com.example.medicine.model.dto.UserSignupDto;

import java.text.SimpleDateFormat;

public class UserMapper {
    public static UserDto toUserDto(User user){
        UserDto result = new UserDto();
        result.setId(user.getId());
        result.setName(user.getName());
        result.setPhone(user.getPhone());
        return  result;
    }

    public static User convertUserSignUpToUser(UserSignupDto user){
        long timeStamp = System.currentTimeMillis();
        User result = new User();
        result.setId(timeStamp);
        result.setName(user.getName());
        result.setPhone(user.getPhone());
        result.setPassword(user.getPassword());
        return  result;
    }
}
