package src.main.java;

/**
 * @author David Hernández Carmona
 * @version 1.0
 */
public class Cancion {

    /**
     * Nombre de la canción
     */
    public String nombre;

    /**
     * Duración de la canción
     */
    public double duracion;

    /**
     * Artista/s que interpreta/n la canción
     */
    public String artista;

    /**
     * Álbum al que pertenece la canción
     */
    public String album;

    /**
     * Género musical de la canción
     */
    public String genero;

    /**
     * Precio de la canción en créditos
     */
    public int precio;

    /**
     * Constructor sin parámetros
     */
    public Cancion() {
        this.nombre = "";
        this.duracion = 0.0;
        this.artista = "";
        this.album = "";
        this.genero = "";
    }

    /**
     * Constructor con parámetros
     */
    public Cancion(String nombre, double duracion, String artista, String album, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    /**
     * @return Devuelve el nombre de la canción
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre Nuevo nombre de la canción
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Devuelve la duración de la canción
     */
    public double getDuracion() {
        return this.duracion;
    }

    /**
     * @param duracion Nueva duración de la canción
     */
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    
    /**
     * @return Devuelve el/los artista/s de la canción
     */
    public String getArtista() {
        return this.artista;
    }

    /**
     * @param artista Nuevo artista de la canción
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return Devuelve el álbum de la canción
     */
    public String getAlbum() {
        return this.album;
    }

    /**
     * @param album Nuevo álbum de la canción
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * @return Devuelve el género de la canción
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

}