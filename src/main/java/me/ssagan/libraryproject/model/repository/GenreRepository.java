package me.ssagan.libraryproject.model.repository;

import me.ssagan.libraryproject.model.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}