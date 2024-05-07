package com.example.spring_boot3.dto.request;

import com.example.spring_boot3.exception.ErrorCode;
import jakarta.validation.constraints.Size;
import lombok.*;

import static com.example.spring_boot3.exception.ErrorCode.USERNAME_INVALID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@FeildDefaults(level = AccessLevel.PRIVATE)
public class UserCreateRequest {
    @Size(min = 5, message = "USERNAME_INVALID") // Error: Cannot resolve symbol 'getMessage' (Alt+Enter shows Create method 'getMessage' in class com.example
    private String username;
    @Size(min = 8, message = "PASSWORD_INVALID")
    private String password;
    private String firstName;
    private String lastName;
    private String dob;
}
