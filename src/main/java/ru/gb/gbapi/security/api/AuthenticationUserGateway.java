package ru.gb.gbapi.security.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gb.gbapi.security.AuthenticationUserDto;

public interface AuthenticationUserGateway {

    @PostMapping("/login")
    ResponseEntity login(@RequestBody AuthenticationUserDto authenticationUserDto);
}