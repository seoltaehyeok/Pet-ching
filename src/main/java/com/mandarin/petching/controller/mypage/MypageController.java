package com.mandarin.petching.controller.mypage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/mypage")
public class MypageController {

    @GetMapping
    public String mypage(Model model, @RequestParam String type) {

        // TODO 로그인 유저 정보
        model.addAttribute("memberId", 1L);

        model.addAttribute("type", type);

        return "mypage/mypage";
    }
}