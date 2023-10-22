package me.ssagan.libraryproject.model.service;

import me.ssagan.libraryproject.model.dto.GenreDto;

public interface GenreService {
    GenreDto getGenreById(Long id);
}