package me.ssagan.libraryproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AuthorWithBooksDto {
    private Long id;
    private String name;
    private String surname;
    private List<BookWithGenreDto> books;
}