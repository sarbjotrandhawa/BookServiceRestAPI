package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	@Transactional
	@Modifying
	@Query("update Book b set b.name= :name where b.id= :id")
	public int updateAddress(long id, String name);

}
