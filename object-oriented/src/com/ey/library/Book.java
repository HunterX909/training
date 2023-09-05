package com.ey.library;

public class Book {
	private String title;
	private Member member;
	
	public Book(String title) {
		this.title = title;
	}
	
	public void status() {
		if(member == null)
			System.out.println(title + " is not issued to any member");
		else {
			System.out.println(title + " is issued to " + member.getName());
		}
	}
	
	public void issueBook(Member m) {
		member = m;
		m.setBook(this);
	}
	
	public void returnBook(Member m) {
		member = null;
		m.setBook(null);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
}
