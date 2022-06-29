package com.test.bootstudy.controller;

import com.test.bootstudy.dto.MemberDTO;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

@RestController
public class PutController {

    @PutMapping("/default")
    public String putMethod() {
        return "Hello World";
    }

    @PutMapping("member")
    public MemberDTO memberDTO(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }
}
