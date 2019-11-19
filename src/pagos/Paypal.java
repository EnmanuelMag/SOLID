package pagos;


import libreria.Libro;
import pagos.Pago;

public class Paypal implements Pago {

    private String correo;

    @Override
    public Libro pago(Libro libro) {
        
        libro.setState(true);
        //Registro del pago por paypal  en la tienda 
        return libro;
    }
}
