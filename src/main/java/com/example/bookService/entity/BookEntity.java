package com.example.bookService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BookEntity {
	@Id
	private long id;
	
	@Column
	private String bookName;
	
	@Column
	private String bookAuthor;
	
	@Column
	private String publicationHouse;
	
	@Column
	private String publishedYear;
	
	@Column
	private String publishedMonth;
	
	@Column
	private String isAuthorActive;
	
	@Column
	private String isBookAvailable;
	
	@Column
	private String bookPDFPath;
	
}
