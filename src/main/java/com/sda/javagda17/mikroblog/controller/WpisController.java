package com.sda.javagda17.mikroblog.controller;

import com.sda.javagda17.mikroblog.mapper.WpisMapper;
import com.sda.javagda17.mikroblog.model.Wpis;
import com.sda.javagda17.mikroblog.model.WpisDto.WpisDto;
import com.sda.javagda17.mikroblog.service.WpisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class WpisController {

    @Autowired
    private WpisService wpisService;

    @Autowired
    private WpisMapper wpisMapper;

    @GetMapping("/wpisForm")
    public String getWpisForm() {
        return "/wpisForm";
    }

    @PostMapping("/wpisForm")
    public String submitStudent(WpisDto wpis) {
        Optional<Wpis> wpisOptional = wpisService.addWpis(wpis);
        if (wpisOptional.isPresent()) {
            return "redirect:/wpisForm";
        }
        return "redirect:/wpisForm";
    }
}
