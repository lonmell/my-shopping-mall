package com.shop.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping(value = "/admin/item/new")
    public String itemForm(Model model) {
        // "상품 등록 페이지입니다"라는 메시지를 화면에 전달
        model.addAttribute("message", "상품 등록 페이지입니다.");
        return "item/new/itemForm"; // templates/item/itemForm.html 파일을 찾으라는 뜻
    }
}