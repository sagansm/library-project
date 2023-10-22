package me.ssagan.libraryproject.model.service;

import me.ssagan.libraryproject.model.dto.AuthorWithBooksDto;

public interface AuthorService {
    AuthorWithBooksDto getAuthorById(Long id);
}