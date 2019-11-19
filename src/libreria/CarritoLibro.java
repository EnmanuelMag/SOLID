package libreria;


import java.util.ArrayList;

public class CarritoLibro {

    private ArrayList<Libro> libros;

    public CarritoLibro(ArrayList<Libro> libros) {
        this.libros = libros;
    }

     
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    
    public void removerLibroComprados(ArrayList<Libro> libros) {
        
        ArrayList<Libro> arr = new ArrayList<>();
        
        for(Libro l: libros){
            if(l.isState()) arr.add(l);
        }
        
        this.libros = arr;
    }

    
}
