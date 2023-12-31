package me.ssagan.libraryproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookWithGenreDto {
    private Long id;
    private String name;
    private String genre;
    //private List<AuthorDto> authors;
}