package me.ssagan.libraryproject.model.service;

import lombok.RequiredArgsConstructor;
import me.ssagan.libraryproject.model.dto.AuthorDto;
import me.ssagan.libraryproject.model.dto.BookWithAuthorsDto;
import me.ssagan.libraryproject.model.dto.GenreDto;
import me.ssagan.libraryproject.model.entity.Genre;
import me.ssagan.libraryproject.model.repository.GenreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public GenreDto getGenreById(Long id) {
        Genre genre = genreRepository.findById(id).orElseThrow();
        return convertToDto(genre);
    }

    private GenreDto convertToDto(Genre genre) {
        List<BookWithAuthorsDto> bookWithAuthorsDtoList = genre.getBooks()
                .stream()
                .map(book -> {
                            List<AuthorDto> authorDtoList = book.getAuthors()
                                    .stream()
                                    .map(author -> AuthorDto.builder()
                                            .id(author.getId())
                                            .name(author.getName())
                                            .surname(author.getSurname())
                                            .build())
                                    .toList();
                            return BookWithAuthorsDto.builder()
                                    .name(book.getName())
                                    .id(book.getId())
                                    .authors(authorDtoList)
                                    .build();
                        }
                ).toList();
        return GenreDto.builder()
                .books(bookWithAuthorsDtoList)
                .id(genre.getId())
                .name(genre.getName())
                .build();
    }
}