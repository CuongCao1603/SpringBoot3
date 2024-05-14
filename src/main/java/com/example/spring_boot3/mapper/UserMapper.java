package com.example.spring_boot3.mapper;

import com.example.spring_boot3.dto.request.UserCreateRequest;
import com.example.spring_boot3.dto.request.UserUpdateRequest;

import com.example.spring_boot3.dto.response.UserResponse;
import com.example.spring_boot3.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
@Component

public interface UserMapper {
    User toUser(UserCreateRequest userCreateRequest);

    @Mapping(source = "firstName", target = "lastName" )
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest userUpdateRequest);


}
