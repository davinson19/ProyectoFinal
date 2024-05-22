package src.test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.java.Oferta;

/**
 * Clase de prueba para la clase Oferta.
 * Esta clase contiene casos de prueba para verificar el funcionamiento correcto de la clase Oferta.
 *
 * @author David Hernández Carmona
 * @version 1.0
 */
public class OfertaTest {

    /**
     * Prueba del constructor sin parámetros de la clase Oferta.
     * Verifica que se inicialice correctamente el descuento.
     */
    @Test
    public void testConstructorSinParametros() {
        Oferta oferta = new Oferta();
        assertEquals(0.0, oferta.getDescuento());
    }

    /**
     * Prueba del constructor con parámetros de la clase Oferta.
     * Verifica que se inicialice correctamente el descuento según el parámetro proporcionado.
     */
    @Test
    public void testConstructorConParametros() {
        Oferta oferta = new Oferta(10.0);
        assertEquals(10.0, oferta.getDescuento());
    }

    /**
     * Prueba del método setter setDescuento de la clase Oferta.
     * Verifica que se actualice correctamente el descuento.
     */
    @Test
    public void testSetDescuento() {
        Oferta oferta = new Oferta();
        oferta.setDescuento(15.0);
        assertEquals(15.0, oferta.getDescuento());
    }

}
