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
public interface DB {
    
    
    public ArrayList<Libro> buscaNombre(String nombre);
    public ArrayList<Libro> buscaCat(String cat);
    public ArrayList<Libro> buscaAutor(String autor);
    
}
