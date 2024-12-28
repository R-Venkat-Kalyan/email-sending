
# Email Sending Implementations

This repository provides multiple implementations for sending emails, including JavaScript and Java Spring Boot solutions. Additionally, it includes a specialized example for sending emails through Outlook using Spring Boot.

## Features

- **JavaScript Email Sender**: Provides a simple JavaScript implementation for sending emails using a client-side approach.
- **Java Spring Boot Email Sender**: Offers a robust email sending solution using Java Spring Boot, suitable for server-side applications.
- **Outlook Mail Example**: Demonstrates how to send emails using Outlook's SMTP configuration through a Spring Boot application.

---

## Folder Structure

- **javascript-email-sender**: Contains the JavaScript implementation for sending emails.
- **spring-boot-email-sender**: Contains the Java Spring Boot implementation for sending emails.
- **outlook-mail-example**: Demonstrates sending emails using Outlook through Spring Boot.

---

## Usage

### JavaScript Email Sender

1. Navigate to the `Email-JS` folder.
2. Open the `index.html` file in your preferred code editor or browser.
3. Modify the JavaScript code in the `<script>` section to configure the email sender according to your requirements.
4. Open the `Contact_Form.html` file in a web browser to use the email sender.
5. For reference, refer to the `Mail Sending Steps.txt` file.

---

### Java Spring Boot Email Sender

1. Navigate to the `Spring Boot - Java Simple Mail Sending` folder.
2. Open the project in your favorite IDE.
3. Configure the email settings and SMTP server details in the `application.properties` file.
4. Build and run the Spring Boot application.
5. Use the provided API endpoints to send emails programmatically.

---

### Outlook Mail Example

1. Navigate to the `outlook_mail_example` folder.
2. Open the project in your IDE (such as IntelliJ IDEA or Eclipse).
3. Configure the email settings in the `application.properties` file with the following details:

   ```properties
   # Outlook configurations
   spring.mail.host=smtp-mail.outlook.com
   spring.mail.port=587
   spring.mail.password= YOUR PASSWORD
   spring.mail.username= YOUR OUTLOOK MAIL
   spring.mail.properties.mail.store.protocol=pop3
   spring.mail.properties.mail.smtp.starttls.enable=true
   spring.mail.properties.mail.smpt.auth=true
   ```

4. **Important**: Ensure that the Outlook email account has two-step verification enabled.
5. Run the Spring Boot application.
6. Use the provided form in the index page to send emails.

---

## Technologies Used

- JavaScript
- Java
- Spring Boot
- SMTP
- Outlook Mail Integration

---

## Contributions

Contributions are welcome! If you have any suggestions for improvements or find any issues, feel free to open an issue or submit a pull request.

---
