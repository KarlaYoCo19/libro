
package com.example.LibroBD.Controladores;

import com.example.LibroBD.Entidades.Libro;
import com.example.LibroBD.Servicios.ServicioLibro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/libros")
public class Controlador1 {
    
    
    @Autowired
    ServicioLibro sLibro;
    
    @GetMapping("")
    public List<Libro> getTodosLosLibros(){
        return sLibro.obtenerTodosLosLibros();
    }
    
    @PostMapping("")
    public List<Libro> postInsertarLibro(@RequestBody Libro a){
        if (sLibro.insertarLibro(a)) {
            return sLibro.obtenerTodosLosLibros();
        }else{
        return null;   
        }
    }
    
    @PutMapping("")
    public List<Libro> putActualizarLibro(@RequestBody Libro a){
        if (sLibro.actualizarLibro(a)) {
            return sLibro.obtenerTodosLosLibros();
        }else{
        return null;   
        }
    }
      
    @DeleteMapping("")
    public List<Libro> deleteLibro(@RequestBody Libro a){
        if (sLibro.eliminarLibro(a)) {
            return sLibro.obtenerTodosLosLibros();
        }else{
        return null;   
        }
    }
    
}
