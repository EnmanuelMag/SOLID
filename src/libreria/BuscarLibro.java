/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.ArrayList;

/**
 *
 * @author emman
 */
public class BuscarLibro {
    
    
    
    public static ArrayList<Libro> buscaNombre(Conexion c, String nombre){
        
        
        return c.buscaNombre(nombre);
        
    }
    
    public static ArrayList<Libro> buscaCat(Conexion c, String cat){
        
        
        return c.buscaCat(cat);
        
    }
    
    public static ArrayList<Libro> buscaAutor(Conexion c, String au){
        
        
        return c.buscaAutor(au);
        
    }
    
    
    
}
