package src.test.java;

import org.junit.jupiter.api.Test;
import src.main.java.Cancion;

import static org.junit.jupiter.api.Assertions.*;

public class CancionTest {

    @Test
    public void testConstructorSinParametros() {
        Cancion cancion = new Cancion();
        assertEquals("", cancion.getNombre());
        assertEquals(0.0, cancion.getDuracion());
        assertEquals("", cancion.getArtista());
        assertEquals("", cancion.getAlbum());
        assertEquals("", cancion.getGenero());
    }

    @Test
    public void testConstructorConParametros() {
        Cancion cancion = new Cancion("Cancion de prueba", 3.5, "Artista de prueba", "Album de prueba", "Rock");
        assertEquals("Cancion de prueba", cancion.getNombre());
        assertEquals(3.5, cancion.getDuracion());
        assertEquals("Artista de prueba", cancion.getArtista());
        assertEquals("Album de prueba", cancion.getAlbum());
        assertEquals("Rock", cancion.getGenero());
    }

    @Test
    public void testSetNombre() {
        Cancion cancion = new Cancion();
        cancion.setNombre("Nueva Cancion");
        assertEquals("Nueva Cancion", cancion.getNombre());
    }

    @Test
    public void testSetDuracion() {
        Cancion cancion = new Cancion();
        cancion.setDuracion(4.2);
        assertEquals(4.2, cancion.getDuracion());
    }

    @Test
    public void testSetArtista() {
        Cancion cancion = new Cancion();
        cancion.setArtista("Nuevo Artista");
        assertEquals("Nuevo Artista", cancion.getArtista());
    }

    @Test
    public void testSetAlbum() {
        Cancion cancion = new Cancion();
        cancion.setAlbum("Nuevo Album");
        assertEquals("Nuevo Album", cancion.getAlbum());
    }

    @Test
    public void testSetGenero() {
        Cancion cancion = new Cancion();
        cancion.setGenero("Pop");
        assertEquals("Pop", cancion.getGenero());
    }
}
