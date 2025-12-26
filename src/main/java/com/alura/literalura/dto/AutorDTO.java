package com.alura.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonIgnoreProperties
public class AutorDTO {

  @JsonProperty("name")
  private String nombre;
  @JsonAlias("birth_year")
  private int anioNacimiento;
  @JsonAlias("death_year")
  private int anioFallecimiento;


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getAnioNacimiento() {
    return anioNacimiento;
  }

  public void setAnioNacimiento(int anioNacimiento) {
    this.anioNacimiento = anioNacimiento;
  }

  public int getAnioFallecimiento() {
    return anioFallecimiento;
  }

  public void setAnioFallecimiento(int anioFallecimiento) {
    this.anioFallecimiento = anioFallecimiento;
  }
}
