package libreria;

public class Libro {

    private String libro;

    private String autor;

    private String category;

    private float price;

    private boolean state;

    public Libro(String libro, String autor, String category, float price, boolean state) {
        this.libro = libro;
        this.autor = autor;
        this.category = category;
        this.price = price;
        this.state = state;
    }

    

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
}
