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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
