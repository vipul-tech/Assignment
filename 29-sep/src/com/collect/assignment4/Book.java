package com.collect.assignment4;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private int bookNo;
	private String title;
	private String author;
	private int price;
	private int quantity;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNo, String title, String author, int price, int quantity) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookNo, price, quantity, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookNo == other.bookNo && price == other.price
				&& quantity == other.quantity && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.bookNo-o.getBookNo();
	}
	
}
