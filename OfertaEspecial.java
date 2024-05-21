
/**
 * @author David Hernández Carmona
 * @version 1.0
 */
public class OfertaEspecial extends Oferta {
    /**
     * Array de usuarios a los que se les aplica la oferta especial
     */
    public String [] usuarios;

    /**
     * Constructor sin parámetros
     */
    public OfertaEspecial() {
        this.usuarios = new String[0];
    }

    /**
     * @return Devuelve el array de usuarios a los que se les aplica la oferta especial
     */
    public String getUsuarios() {
        return this.usuarios.toString();
    }

    /**
     * @param usuarios El nuevo array de usuarios a los que se les aplica la oferta especial, 
     *                 tener en cuenta que cambia un array de usuarios por otro
     */
    public void setUsuarios(String [] usuarios) {
        this.usuarios = usuarios;
    }
}