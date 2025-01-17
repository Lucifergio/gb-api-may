package ru.gb.gbapimay.user.dto;

import lombok.*;

/**
 * @author Artem Kropotov
 * created at 01.06.2022
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationUserDto {

    private String username;
    private String password;
}
