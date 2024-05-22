package src.main.java;

/**
 * @author David Hernández Carmona
 * @version 1.0
 */
public class Sistema {

    /**
     * Constructor sin parámetros
     */
    public Sistema() {
    }

    /**
     * @param nombre Nombre de la canción a buscar
     * @return Array de canciones que coinciden con el nombre
     */
    public static Cancion[] mostrarResultados(String nombre) {
        Cancion[] canciones = new Cancion[0];
        /*
         * Código para buscar canciones en la base de datos
         * y añadirlas al array de canciones.
         * Sería un bucle que obtenga de la BBDD los nombres de las canciones
         * que coincidan con el nombre pasado por parámetro y los añada al array.
         */
        return canciones;
    }

    /**
     * @param usuario src.main.java.Usuario al que se le aplica la oferta
     * @return La oferta de créditos que se le hace al usuario
     */
    public Credito hacerOferta(int ofertaLote, double ofertaPrecio) {
        return new Credito(ofertaLote, ofertaPrecio);
    }

}