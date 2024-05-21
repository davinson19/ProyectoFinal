
/**
 * @author David Hernández Carmona
 * @version 1.0
 */
public class Oferta {


    /**
     * El descuento que se aplica a un lote de créditos
     */
    public double descuento;

    /**
     * Constructor sin parámetros
     */
    public Oferta() {
        this.descuento = 0.0;
    }

    /**
     * Constructor con parámetros
     */
    public Oferta(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return Devuelve el descuento que se aplica a un lote de créditos
     */
    public double getDescuento() {
        return this.descuento;
    }

    /**
     * @param descuento El nuevo descuento que se aplica a un lote de créditos
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

}