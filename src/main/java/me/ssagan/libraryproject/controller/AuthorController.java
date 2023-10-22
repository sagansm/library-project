package me.ssagan.libraryproject.controller;

import lombok.RequiredArgsConstructor;
import me.ssagan.libraryproject.model.dto.AuthorWithBooksDto;
import me.ssagan.libraryproject.model.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/author/{id}")
    AuthorWithBooksDto getAuthorById(@PathVariable("id") Long id) {
        return authorService.getAuthorById(id);
    }
}