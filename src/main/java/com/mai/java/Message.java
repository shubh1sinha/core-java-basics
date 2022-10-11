package com.mai.java;

public class Message {
	protected String head;
	protected String body;
	protected String footer;

	public Message(String head, String body, String footer) {
		this.head = head;
		this.body = body;
		this.footer = footer;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	@Override
	public String toString() {
		return "Message\nSubject: " + head + "\nBody: " + body + "\nFooter: " + footer;
	}

}
