package me.ssagan.libraryproject.model.service;

import lombok.RequiredArgsConstructor;
import me.ssagan.libraryproject.model.dto.AuthorWithBooksDto;
import me.ssagan.libraryproject.model.dto.BookWithGenreDto;
import me.ssagan.libraryproject.model.entity.Author;
import me.ssagan.libraryproject.model.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorWithBooksDto getAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow();
        return convertToDto(author);
    }

    private AuthorWithBooksDto convertToDto(Author author) {
        List<BookWithGenreDto> bookWithGenreDtoList = author.getBooks()
                .stream()
                .map(book -> BookWithGenreDto.builder()
                        .genre(book.getGenre().getName())
                        .name(book.getName())
                        .id(book.getId())
                        .build()
                ).toList();
        return AuthorWithBooksDto.builder()
                .books(bookWithGenreDtoList)
                .id(author.getId())
                .name(author.getName())
                .surname(author.getSurname())
                .build();
    }
}