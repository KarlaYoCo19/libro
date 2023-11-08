
package com.example.LibroBD.Servicios;


import com.example.LibroBD.Entidades.Libro;
import com.example.LibroBD.Repositorios.repositorioLibro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ServicioLibro {
    @Autowired
    repositorioLibro rLibro;
    
    public List<Libro> obtenerTodosLosLibros(){
        return rLibro.findAll();
    }
    
    public boolean insertarLibro (Libro a){
        boolean respuesta = false;
        try{
            rLibro.save(a); //insert o update a nivel bd
            respuesta = true;
        
        }catch (Exception ex){
            respuesta = false;
            
        }
        return respuesta;
    }
    
    public boolean actualizarLibro (Libro a){
        boolean respuesta = false;
        try{
            rLibro.save(a); //insert o update a nivel bd
            respuesta = true;
        
        }catch (Exception ex){
            respuesta = false;
            
        }
        return respuesta;
    }
    
    public boolean eliminarLibro (Libro a){
        boolean respuesta = false;
        try{
            rLibro.delete(a); //insert o update a nivel bd
            respuesta = true;
        
        }catch (Exception ex){
            respuesta = false;
            
        }
        return respuesta;
    }
}
