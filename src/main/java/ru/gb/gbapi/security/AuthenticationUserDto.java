package ru.gb.gbapi.security;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationUserDto {
    private String username;
    private String password;
}
