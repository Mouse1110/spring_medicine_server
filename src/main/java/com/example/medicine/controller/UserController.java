package com.example.medicine.controller;

import com.example.medicine.entity.User;
import com.example.medicine.exception.NotFoundException;
import com.example.medicine.model.dto.UserDto;
import com.example.medicine.model.dto.UserLoginDto;
import com.example.medicine.model.dto.UserSignupDto;
import com.example.medicine.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserSevice userSevice;

    @GetMapping
    public ResponseEntity<?> getListUser(){
        List<UserDto> users = userSevice.getListUser();
        return ResponseEntity.ok(users);
    }

    @PostMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody UserLoginDto user){
        UserDto result = userSevice.getUser(user);
        if (result!=null){
            return ResponseEntity.ok(result);
        }
        throw new NotFoundException("Người dùng không tồn tại");
    }

    @ResponseBody
    @PostMapping(value="/signup", produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<?> signup(@RequestBody UserSignupDto user){
        boolean error = userSevice.addUser(user);
        if (!error){
            return ResponseEntity.ok(null);
        }
        throw new NotFoundException("Số điện thoại đã tồn tại");
    }
}
