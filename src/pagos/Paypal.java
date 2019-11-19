package pagos;


import libreria.Libro;
import pagos.Pago;

public class Paypal implements Pago {

    private String correo;

    @Override
    public Libro pago(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
