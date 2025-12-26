package com.alura.literalura.repository;

import com.alura.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
  @Query("select a from Autor a left join fetch a.libros")
  List<Autor> findAllConLibros();
  @Query("select a from Autor left join fetch a.libros where (a.anoFallecimiento is null or a." +
    "anoFallecimiento > :ano)and a.anoNacimiento <= :ano")
  List<Autor> findAutoresEnAnosConLibros(@Param("ano")int ano);

  Optional<Autor> findByNombre(String nombre);
}
