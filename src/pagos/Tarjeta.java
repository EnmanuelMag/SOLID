package pagos;


import libreria.Libro;
import pagos.Pago;

public class Tarjeta implements Pago {

    private String numero;

    private String numSeguridad;

    @Override
    public Libro pago(Libro libro) {
        
        libro.setState(true);
        //Registro del pago por tarjeta en la tienda 
        return libro;
    }
}
