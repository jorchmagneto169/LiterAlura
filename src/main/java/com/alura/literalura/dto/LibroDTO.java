package com.alura.literalura.dto;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LibroDTO {
  @JsonProperty("id")
  private int id;


  @JsonAlias("title")
  private String titulo;
  @JsonAlias("authors")
  private List<AutorDTO> autores;
  @JsonAlias("languages")
  private List<String> idiomas;
  @JsonAlias("download_count")
  private int numeroDescargas;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public List<String> getIdiomas() {
    return idiomas;
  }

  public void setIdiomas(List<String> idiomas) {
    this.idiomas = idiomas;
  }

  public List<AutorDTO> getAutores() {
    return autores;
  }

  public void setAutores(List<AutorDTO> autores) {
    this.autores = autores;
  }

  public int getNumeroDescargas() {
    return numeroDescargas;
  }

  public void setNumeroDescargas(int numeroDescargas) {
    this.numeroDescargas = numeroDescargas;
  }
}
