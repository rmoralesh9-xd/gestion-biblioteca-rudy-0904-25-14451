
package com.rudy_0904_25_14451.biblioteca.app;

import com.rudy0904_25_14451.gestionbiblioteca.modelo.Libro;
import com.rudy_0904_25_14451.gestionbiblioteca.servicio.Biblioteca;


public class Main {
    


    public static void main(String[] args) {

        
        Biblioteca biblioteca = new Biblioteca();

       
        biblioteca.agregarLibro(new Libro("FNAF", "SCOT CAWTON"));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));

     
        try {
            biblioteca.agregarLibro(new Libro("", "Autor desconocido"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar libro inválido: " + e.getMessage());
        }

       
        System.out.println("\nLista de libros:");
        biblioteca.imprimirLibros();

      
        String tituloBusqueda = "1984";
        Libro encontrado = biblioteca.buscarPorTitulo(tituloBusqueda);

      
        if (encontrado != null) {
            System.out.println("\nLibro encontrado: " + encontrado);
        } else {
            System.out.println("\nLibro no encontrado");
        }
    }
}