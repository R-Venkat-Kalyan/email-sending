# Email Sending Implementations

This repository provides two implementations for sending emails: one using JavaScript and the other using Java Spring Boot. The implementations offer simple and flexible solutions for integrating email sending functionality into your projects.

## Features

- **JavaScript Email Sender**: Provides a simple JavaScript implementation for sending emails using a client-side approach.
- **Java Spring Boot Email Sender**: Offers a more robust email sending solution using Java Spring Boot, suitable for server-side applications.

## Folder Structure

- **javascript-email-sender**: Contains the JavaScript implementation for sending emails.
- **spring-boot-email-sender**: Contains the Java Spring Boot implementation for sending emails.

## Usage

### JavaScript Email Sender

1. Navigate to the `Email-JS` folder.
2. Open the `index.html` file in your preferred code editor or browser.
3. Modify the JavaScript code in `<script>` to configure the email sender according to your requirements.
4. Open the `Contact_Form.html` file in a web browser to use the email sender.
5. For any regference, refer Mail Sendiing Steps.txt.

### Java Spring Boot Email Sender

1. Navigate to the `Spring Boot - Java Simple Mail Sending` folder.
2. Open the project in your favorite IDE.
3. Configure the email settings and SMTP server details in the `application.properties` file.
4. Build and run the Spring Boot application.
5. Use the provided API endpoints to send emails programmatically.

#### Configuring `application.properties`

In the Spring Boot application, the `application.properties` file is used to configure various properties, including email settings and SMTP server details. Here are the key properties you may need to configure:

```properties
# SMTP Server Settings
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=user@example.com
spring.mail.password=your_password

## Technologies Used

- JavaScript
- Java
- Spring Boot
- SMTP

## Contributions

Contributions are welcome! If you have any suggestions for improvements or find any issues, feel free to open an issue or submit a pull request.

