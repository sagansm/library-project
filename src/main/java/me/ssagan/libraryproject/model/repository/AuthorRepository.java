package me.ssagan.libraryproject.model.repository;

import me.ssagan.libraryproject.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}