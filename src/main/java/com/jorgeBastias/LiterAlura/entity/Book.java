package com.jorgeBastias.LiterAlura.entity;

import com.jorgeBastias.LiterAlura.dto.BookDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Long id;
    @Column(unique = true)
    private String title;

    private String language;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    private Long downloads_count;

    public Book(BookDTO bookDTO) {
        this.title = bookDTO.title();

        if (bookDTO.languages() != null && !bookDTO.languages().isEmpty()) {
            this.language = bookDTO.languages().get(0).toUpperCase();
        } else {
            this.language = "N/A";
        }

        if (bookDTO.authors() != null && !bookDTO.authors().isEmpty()) {
            this.author = new Author(bookDTO.authors().get(0));
        } else {
            this.author = null;
        }

        this.downloads_count = bookDTO.downloads();
    }

    @Override
    public String toString() {
        return "----- Libro -----" +
                "\n Titulo: " + title +
                "\n Autor: " + author.getName() +
                "\n Idioma: " + language +
                "\n Número de descargas: " + downloads_count +
                "\n-----------------\n";
    }
}
