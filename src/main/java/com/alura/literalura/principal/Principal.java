package com.alura.literalura.principal;


import com.alura.literalura.dto.LibroDTO;
import com.alura.literalura.dto.RespuestaLibroDTO;
import com.alura.literalura.service.AutorService;
import com.alura.literalura.service.ConsumoAPI;
import com.alura.literalura.service.ConvierteDatos;
import com.alura.literalura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

@Component
public class Principal {

  @Autowired
  private LibroService libroService;

  @Autowired
  private AutorService autorService;

  @Autowired
  private ConsumoAPI consumoAPI;

  @Autowired
  private ConvierteDatos convierteDatos;

  @Autowired
  private static final String BASE_URL = "https://gutendex.com/books/";

  Scanner scanner = new Scanner(System.in);
  int opcion;


  do {

    System.out.println("""

                    📚 LITERALURA
                    -------------------------
                    1 - Buscar libro por título
                    2 - Listar libros guardados
                    3 - Listar autores
                    4 - Listar autores vivos en un año
                    5 - Listar libros por idioma
                    0 - Salir
                    """);

    System.out.print("Seleccione una opción: ");

    opcion = scanner.nextInt();
    scanner.nextLine();


    switch (opcion){

      case 1:
        System.out.println("ingrese el titulo del libro");
        String titulo = scanner.nextLine();
        try {
          String encodedTitulo = URLEncoder.encode(titulo, StandardCharsets.UTF_8);
          String json = ConsumoAPI.obtenerDatos(BASE_URL + "?search=" +encodedTitulo);
          RespuestaLibroDTO respuestaLibroDTO = convierteDatos.obtenerDatos(json, RespuestaLibroDTO.class);
          List<LibroDTO> libroDTO = respuestaLibroDTO.getLibros();
          if (libroDTO.isEmpty()){
            System.out.println("libro no encontrado en la api");

          }else {
            boolean LibroRegistrado = false;
            for (LibroDTO libroDTO : librosDTO) {
              if (LibroDTO.getTitulo)
            }



            }

          }


        }

    }








  }

}
