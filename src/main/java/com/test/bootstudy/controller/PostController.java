package com.test.bootstudy.controller;

import com.test.bootstudy.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PostController {
    @PostMapping("member1")
    public MemberDTO memberDTO(@Valid @RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }
}
