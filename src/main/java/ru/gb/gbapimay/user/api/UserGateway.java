package ru.gb.gbapimay.user.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.gb.gbapimay.user.dto.UserDto;

import java.util.List;

public interface UserGateway {

    @GetMapping
    List<UserDto> getUserList();

    @GetMapping("/{userId}")
    ResponseEntity<UserDto> getUser(@PathVariable("userId") Long id);

    @PostMapping
    ResponseEntity<UserDto> handlePost(@Validated @RequestBody UserDto userDto);

    @PutMapping("/{userId}")
    ResponseEntity<UserDto> handleUpdate(@PathVariable("userId") Long id,
                                            @Validated @RequestBody UserDto userDto);

    @DeleteMapping("/{userId}")
    void deleteById(@PathVariable("userId") Long id);
}
