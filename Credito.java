
/**
 * @author David Hernández Carmona
 * @version 1.0
 */
public class Credito {

    /**
     * La cantidad de créditos que se compran en un lote
     */
    public int cantidadLote;

    /**
     * Cantidad de dinero que cuesta un lote de créditos
     */
    public double precio;

    /**
     * Constructor sin parámetros
     */
    public Credito() {
        this.cantidadLote = 0;
        this.precio = 0.0;
    }
    
    /**
     * Constructor con parámetros
     */
    public Credito(int cantidadLote, double precio) {
        this.cantidadLote = cantidadLote;
        this.precio = precio;
    }

    /**
     * @return Devuelve la cantidad de créditos que hay en un lote
     */
    public int getCantidadLote() {
        return this.cantidadLote;
    }

    /**
     * @param cantidadLote La nueva cantidad de créditos que hay en un lote
     */
    public void setCantidadLote(int cantidadLote) {
        this.cantidadLote = cantidadLote;
    }

    /**
     * @return Devuelve el precio de un lote de créditos
     */
    public double getPrecio() {
        return this.precio;
    }

    /**
     * @param precio El nuevo precio de un lote de créditos
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}