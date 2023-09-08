package com.ey.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "books")
@NamedQueries(
		@NamedQuery(name ="byauthor", query = "FROM Book WHERE author=:auth")
)

public class Book {
	@Id
	private int isbn;
	@Column(length =30)
	private String author;
	@Column(length =30)
	private String title;
	private double price;
	
	public Book() {
	}

	public Book(int isbn, String author, String title, double price) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author=" + author + ", title=" + title + ", price=" + price + "]";
	}
	
	
}
