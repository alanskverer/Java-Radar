package com.compie.webstarter.example.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ExampleResponseDto {
    public String name;
    public String email;
}
