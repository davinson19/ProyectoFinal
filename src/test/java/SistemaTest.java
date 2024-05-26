package src.test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.java.Sistema;
import src.main.java.Cancion;
import src.main.java.Credito;

/**
 * Clase de prueba para la clase Sistema.
 * Esta clase contiene casos de prueba para verificar el funcionamiento correcto de los métodos de la clase Sistema.
 */
public class SistemaTest {

    /**
     * Prueba del método mostrarResultados de la clase Sistema.
     * Verifica que el método devuelva un array de canciones vacío cuando no se encuentran coincidencias.
     */
    @Test
    public void testMostrarResultadosSinCoincidencias() {
        Cancion[] canciones = Sistema.mostrarResultados("Canción Inexistente");
        assertNotNull(canciones);
        assertEquals(0, canciones.length);
    }

    /**
     * Prueba del método hacerOferta de la clase Sistema.
     * Verifica que se cree correctamente una oferta de créditos para un usuario específico.
     */
    @Test
    public void testHacerOferta() {
        Sistema sistema = new Sistema();
        Credito oferta = sistema.hacerOferta(10, 5.0);
        assertNotNull(oferta);
        assertEquals(10, oferta.getCantidadLote());
        assertEquals(5.0, oferta.getPrecio());
    }

}
