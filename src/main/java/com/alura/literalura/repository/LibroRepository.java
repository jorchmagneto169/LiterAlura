package com.alura.literalura.repository;

import com.alura.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {
  Optional<Libro> findByTituloIgnoreCase(String titulo);

  //List<Libro> findByIdioma(String idioma);
  @Query(" select l from libro l where l.idioma = :idioma")
  List<Libro> findByIdioma(@Param("idioma")String idioma);


}
