package src.test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.java.OfertaEspecial;

/**
 * Clase de prueba para la clase OfertaEspecial, que extiende de la clase Oferta.
 * Esta clase contiene casos de prueba para verificar el funcionamiento correcto de la clase OfertaEspecial.
 */
public class OfertaEspecialTest {

    /**
     * Prueba del constructor sin parámetros de la clase OfertaEspecial.
     * Verifica que se inicialice correctamente el array de usuarios.
     */
    @Test
    public void testConstructorSinParametros() {
        OfertaEspecial ofertaEspecial = new OfertaEspecial();
        assertEquals(0, ofertaEspecial.getUsuarios().length());
    }

    /**
     * Prueba del método setter setUsuarios de la clase OfertaEspecial.
     * Verifica que se actualice correctamente el array de usuarios según el parámetro proporcionado.
     */
    @Test
    public void testSetUsuarios() {
        OfertaEspecial ofertaEspecial = new OfertaEspecial();
        String[] usuarios = {"usuario1", "usuario2", "usuario3"};
        ofertaEspecial.setUsuarios(usuarios);
        assertEquals("usuario1usuario2usuario3", ofertaEspecial.getUsuarios());
    }
}