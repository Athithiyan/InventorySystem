package com.example.bookService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookService.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{

	@Query(value = "select * from BOOKS", nativeQuery = true)
	List<BookEntity> getAllBooks();
}
