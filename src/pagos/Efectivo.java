package pagos;


import libreria.Libro;
import pagos.Pago;

public class Efectivo implements Pago {

    private double cantidad;

    public Efectivo(double cantidad) {
        this.cantidad = cantidad;
    }
    

    @Override
    public Libro pago(Libro libro) {
        libro.setState(true);
        //Registro del pago en efectivo  en la tienda 
        return libro;
    }
}
