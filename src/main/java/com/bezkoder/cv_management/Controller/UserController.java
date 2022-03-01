package com.bezkoder.cv_management.Controller;

import com.bezkoder.cv_management.DTO.UserFormForUpdate;
import com.bezkoder.cv_management.Entity.UserEntity;
import com.bezkoder.cv_management.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/accounts")

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ResponseEntity<?> getAllUser(){
        List<UserEntity> userEntities = userService.getAllUserList();
        return new ResponseEntity<List<UserService>>((MultiValueMap<String, String>) userEntities, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUserById(@PathVariable(name = "accId") int accId){
        return new ResponseEntity<>(userService.getUserByID(accId),HttpStatus.OK);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<?> updateUserById(@PathVariable(name = "userId") int userId, @RequestBody UserFormForUpdate form){
        userService.updateUser(userId, form);
        return new ResponseEntity<String>("Update Successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable(name = "userId") int userId){
        userService.deleteUser(userId);
        return new ResponseEntity<String>("Delete Successfully", HttpStatus.OK);
    }

}
