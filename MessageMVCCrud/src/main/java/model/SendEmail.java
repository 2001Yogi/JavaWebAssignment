package model;

import java.util.Random;

public class SendEmail {
	public String getRandom() {
		Random r = new Random();
		int num = r.nextInt(999999);
		return String.format("%06d",num );
	}
	
	public boolean sendEmail(User u) {
		boolean test  = false;
		String toEmail = u.getEmail();
		String fromEmail = "pillowweb25@gmail.com";
		String password = "kigaejjxockeuxwe";
		
		return test;
	}
}
