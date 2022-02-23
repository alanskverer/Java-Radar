package com.compie.webstarter.example.model.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;

@Builder
@Data
public class ExampleRequestDto {
    public String name;
    @Email
    public String email;
}
