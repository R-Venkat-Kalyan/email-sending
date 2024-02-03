package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@GetMapping("/send")
    public String sendEmail() {
        String to = "2100030959cseh@gmail.com";
        String subject = "Test Email";
        String text = "This is a test email sent from a Spring Boot application.";

        emailService.sendEmail(to, subject, text);
        System.out.println("Nice");
        return "contactus";
    }
}
