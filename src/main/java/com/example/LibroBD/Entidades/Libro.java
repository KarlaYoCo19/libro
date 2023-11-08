
package com.example.LibroBD.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "libro")

public class Libro {
   
   @Id
   private int idLibro;
   
   @Column
   private String nombreLibro;
   
   private String autor;
   
   private int numP;
  
   private String editorial;
   
   private String idioma;

    public Libro() {
    }

    public Libro(int idLibro, String nombreLibro, String autor, int numP, String editorial, String idioma) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.numP = numP;
        this.editorial = editorial;
        this.idioma = idioma;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
   
   
   
}
