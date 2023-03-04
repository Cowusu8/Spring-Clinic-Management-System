package com.clinicmgmt.springclinicmgmt.controllers;

import com.clinicmgmt.springclinicmgmt.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;



@Controller @Slf4j
public class AdminController {
    @Autowired
    private AdminRepository aRepo;

    @GetMapping("Admin")
    public String showAdmin(){
        log.warn("test");
        return "Admin";
    }


}
