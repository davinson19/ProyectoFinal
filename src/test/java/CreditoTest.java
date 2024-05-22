package src.test.java;

/**
 * @author Alejandro Mayor García
 * @version 1.0
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.java.Credito;

/**
 * Esta clase contiene casos de prueba para verificar el funcionamiento correcto de la clase Credito.
 */
public class CreditoTest {

    /**
     * Verifica que se inicialicen correctamente la cantidad de créditos y el precio.
     */
    @Test
    public void testConstructorSinParametros() {
        Credito credito = new Credito();
        assertEquals(0, credito.getCantidadLote());
        assertEquals(0.0, credito.getPrecio());
    }

    /**
     * Verifica que se inicialicen correctamente la cantidad de créditos y el precio según los parámetros proporcionados.
     */
    @Test
    public void testConstructorConParametros() {
        Credito credito = new Credito(10, 15.0);
        assertEquals(10, credito.getCantidadLote());
        assertEquals(15.0, credito.getPrecio());
    }

    /**
     * Verifica que se actualice correctamente la cantidad de créditos en el lote.
     */
    @Test
    public void testSetCantidadLote() {
        Credito credito = new Credito();
        credito.setCantidadLote(5);
        assertEquals(5, credito.getCantidadLote());
    }

    /**
     * Verifica que se actualice correctamente el precio del lote de créditos.
     */
    @Test
    public void testSetPrecio() {
        Credito credito = new Credito();
        credito.setPrecio(10.0);
        assertEquals(10.0, credito.getPrecio());
    }

}

