package com.jpa.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.audit.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
