package com.mai.java;

public class Mail {
	protected String toAddress;
	protected String fromAddress;
	protected Message message;
	
	public Mail(String toAddress, String fromAddress) {
		this.toAddress=toAddress;
		this.fromAddress=fromAddress;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	public void composeMail(String head, String body, String footer) {
		Message m = new Message(head, body, footer);
		this.message=m;
		
	}
	public void sendMail() {
		System.out.println("To: "+toAddress+"\nFrom: "+fromAddress+"\n"+message);
	}

}
