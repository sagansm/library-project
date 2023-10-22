package me.ssagan.libraryproject.controller;

import lombok.RequiredArgsConstructor;
import me.ssagan.libraryproject.model.dto.GenreDto;
import me.ssagan.libraryproject.model.service.GenreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;

    @GetMapping("/genre/{id}")
    GenreDto getGenreById(@PathVariable("id") Long id) {
        return genreService.getGenreById(id);
    }
}