package com.example.yallah_m.backend.mappers;


import com.example.yallah_m.backend.dtos.SignUpDto;
import com.example.yallah_m.backend.dtos.UserDto;
import com.example.yallah_m.backend.entites.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
