package pagos;


import libreria.Libro;
import pagos.Pago;

public class Tarjeta implements Pago {

    private String numero;

    private String numSeguridad;

    @Override
    public Libro pago(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
