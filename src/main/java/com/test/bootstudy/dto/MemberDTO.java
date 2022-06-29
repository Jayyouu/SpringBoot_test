package com.test.bootstudy.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
public class MemberDTO {
    @NotNull
    private String name;
    @NotNull
    @Min(value = 1)
    private int age;
    @NotNull
    private String email;
    @NotNull
    @Min(value = 1)
    private long height;

    @Builder
    public MemberDTO(String name, int age, String email, long height) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.height = height;
    }
}
