package com.driver;

public class Book {
	private String title;
    private String isbn;
    private Author author;

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
    	//your code goes here
        return title;
    }

    public String getIsbn() {
    	//your code goes here
        return isbn;
    }

    public Author getAuthor() {
    	//your code goes here
        return author;
    }
}
