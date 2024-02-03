package net.codejava;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

@Controller
public class RecordService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void processRecord(Record record) {
    	
    	LocalDateTime fixedTime = record.getTime();

    	if (LocalDateTime.now().isAfter(fixedTime.minusHours(1))) {
            sendEmail(record.getEmail(), record.getMessage());
        }
    }

    private void sendEmail(String email, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(email);
        mailMessage.setSubject("Reminder");
        mailMessage.setText(message);

        javaMailSender.send(mailMessage);

        System.out.println("Email sent to " + email + " with message: " + message);
    }
}