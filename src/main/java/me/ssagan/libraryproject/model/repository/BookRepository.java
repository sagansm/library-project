package me.ssagan.libraryproject.model.repository;

import me.ssagan.libraryproject.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}