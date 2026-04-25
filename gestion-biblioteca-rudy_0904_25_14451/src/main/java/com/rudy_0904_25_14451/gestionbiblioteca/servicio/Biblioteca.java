
package com.rudy_0904_25_14451.gestionbiblioteca.servicio;

import com.rudy0904_25_14451.gestionbiblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;
 
public class Biblioteca {
  
    private List<Libro> libros;


    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    
    public void agregar(Libro libro) {
        libros.add(libro);
    }

    
    public Libro buscar(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

   
    public List<Libro> obtener() {
        return libros;
    }

    public void imprimirLibros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Libro buscarPorTitulo(String tituloBusqueda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void agregarLibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

