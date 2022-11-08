package com.example.medicine.service;

import com.example.medicine.entity.User;
import com.example.medicine.model.dto.UserDto;
import com.example.medicine.model.dto.UserLoginDto;
import com.example.medicine.model.dto.UserSignupDto;
import com.example.medicine.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserSevice{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(0,"Nguyễn Long Bá","0382292563","admin"));

    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user : users){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public boolean addUser(UserSignupDto userSignupDto) {
     boolean isExists = false;
     for (User u:users){
         if (userSignupDto.getPhone().equals(u.getPhone())){
             isExists = true;
         }
     }
     if (!isExists){
         users.add(UserMapper.convertUserSignUpToUser(userSignupDto));
     }
     return isExists;
    }

    @Override
    public UserDto getUser(UserLoginDto userLoginDto) {
        User user = null;
        for (User u:users){
            System.out.println(userLoginDto.getPhone().equals(u.getPhone()) && userLoginDto.getPassword().equals(u.getPassword()));
            if (userLoginDto.getPhone().equals(u.getPhone()) && userLoginDto.getPassword().equals(u.getPassword())){
                user = u;
            }
        }
        if (user!=null){
            return UserMapper.toUserDto(user);
        }
        return null;
    }
}
