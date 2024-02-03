package net.codejava;

import java.time.LocalDateTime;

public class Record {

	private String message;
    private String email;
    private LocalDateTime time;
    
    public Record() {
    	
    }
    
	public Record(String message, String email, LocalDateTime time) {
		super();
		this.message = message;
		this.email = email;
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
    
}
