
package com.example.LibroBD.Repositorios;


import com.example.LibroBD.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface repositorioLibro extends JpaRepository<Libro, Integer>{
    
}
