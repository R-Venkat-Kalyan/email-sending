package net.codejava;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SpringBootEmailExamplesApplication{

	@Autowired
    private RecordService recordService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailExamplesApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String email = "2100030959cseh@gmail.com";
//        String message = "Test Message";
//        LocalDateTime fixedTime = LocalDateTime.now().minusHours(2);  // Set the desired fixed time
//
//        // Create a Record instance with the fixed time
//        Record record = new Record(message, email, fixedTime);
//
//        // Run the initial record processing
//        recordService.processRecord(record);
//		
//	}
//	
//	@Scheduled(fixedDelay = 300000) // 3600000 milliseconds delay, i.e., one hour
//    public void processRecordScheduled() {
//		String email = "2100030959@kluniversity.in";
//        String message = "Test Message";
//        LocalDateTime fixedTime = LocalDateTime.now().plusHours(2);  // Set the desired fixed time
//
//        // Create a Record instance with the fixed time
//        Record record = new Record(message, email, fixedTime);
//
//        // Process the record periodically
//        recordService.processRecord(record);
//    }

}
