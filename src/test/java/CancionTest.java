package src.test.java;

/**
 * @author Alejandro Mayor García
 * @version 1.0
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import src.main.java.Cancion;

/**
 * Esta clase contiene casos de prueba para verificar el funcionamiento correcto de la clase Cancion.
 */
public class CancionTest {

    /**
     * Verifica que se inicialicen correctamente los atributos de la canción.
     */
    @Test
    public void testConstructorSinParametros() {
        Cancion cancion = new Cancion();
        assertEquals("", cancion.getNombre());
        assertEquals(0.0, cancion.getDuracion());
        assertEquals("", cancion.getArtista());
        assertEquals("", cancion.getAlbum());
        assertEquals("", cancion.getGenero());
    }

    /**
     * Verifica que se inicialicen correctamente los atributos de la canción según los parámetros proporcionados.
     */
    @Test
    public void testConstructorConParametros() {
        Cancion cancion = new Cancion("Nombre Cancion", 3.5, "Artista", "Album", "Genero");
        assertEquals("Nombre Cancion", cancion.getNombre());
        assertEquals(3.5, cancion.getDuracion());
        assertEquals("Artista", cancion.getArtista());
        assertEquals("Album", cancion.getAlbum());
        assertEquals("Genero", cancion.getGenero());
    }

    /**
     * Verifica que se actualice correctamente el nombre de la canción.
     */
    @Test
    public void testSetNombre() {
        Cancion cancion = new Cancion();
        cancion.setNombre("Nuevo Nombre Cancion");
        assertEquals("Nuevo Nombre Cancion", cancion.getNombre());
    }

    /**
     * Verifica que se actualice correctamente la duración de la canción.
     */
    @Test
    public void testSetDuracion() {
        Cancion cancion = new Cancion();
        cancion.setDuracion(4.2);
        assertEquals(4.2, cancion.getDuracion());
    }

    /**
     * Verifica que se actualice correctamente el artista de la canción.
     */
    @Test
    public void testSetArtista() {
        Cancion cancion = new Cancion();
        cancion.setArtista("Nuevo Artista");
        assertEquals("Nuevo Artista", cancion.getArtista());
    }

    /**
     * Verifica que se actualice correctamente el álbum de la canción.
     */
    @Test
    public void testSetAlbum() {
        Cancion cancion = new Cancion();
        cancion.setAlbum("Nuevo Album");
        assertEquals("Nuevo Album", cancion.getAlbum());
    }

    /**
     * Verifica que se actualice correctamente el género de la canción.
     */
    @Test
    public void testSetGenero() {
        Cancion cancion = new Cancion();
        cancion.setGenero("Nuevo Genero");
        assertEquals("Nuevo Genero", cancion.getGenero());
    }
}