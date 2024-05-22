package src.main.java;

/**
 * @author David Hernández Carmona
 * @version 1.0
 */
public class Usuario {
    /**
     * Identificador único del usuario
     */
    public int id;

    /**
     * Correo electrónico del usuario
     */
    public String correo;

    /**
     * Nombre de usuario de la cuenta
     */
    public String usuario;

    /**
     * Nombre real del usuario
     */
    public String nombre;

    /**
     * Primer apellido del usuario
     */
    public String apellido1;

    /**
     * Segundo apellido del usuario
     */
    public String apellido2;

    /**
     * Cantidad de dinero ingresada en la cuenta
     */
    public double monedero;

    /**
     * Cantidad de créditos que posee el usuariok
     */
    public int creditos;

    /**
     * Lista de canciones compradas por el usuario
     */
    public Cancion[] canciones;

    /**
     * Constructor sin parámetros
     */
    public Usuario() {
        this.id = 0;
        this.correo = "";
        this.usuario = "";
        this.nombre = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.monedero = 0.0;
        this.creditos = 0;
        this.canciones = null;
    }

    /**
     * Constructor con parámetros
     */
    public Usuario(int id, String correo, String usuario, String nombre, String apellido1, String apellido2,
            double monedero, int creditos, Cancion[] canciones) {
        this.id = id;
        this.correo = correo;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.monedero = monedero;
        this.creditos = creditos;
        this.canciones = canciones;
    }

    /**
     * @param creditos El lote de créditos que se va a comprar
     */
    public void comprarCreditos(Credito creditos) {
        if(creditos.precio <= this.monedero) {
            this.creditos += creditos.cantidadLote;
            this.monedero -= creditos.precio;
        }
    }

    /**
     * @param cancion La canción que se va a comprar
     */
    public void comprarCancion(Cancion cancion) {
        this.creditos -= cancion.precio;
        this.canciones[this.canciones.length] = cancion;
    }

    /**
     * @param nombre
     * @return La lista de canciones que coinciden con el nombre
     */
    public Cancion[] buscarCancion(String nombre) {
        Cancion[] canciones = Sistema.mostrarResultados(nombre);
        return canciones;
    }

    /**
     * @return La canción que se va a descargar, si no está en la lista de canciones del usuario, devuelve null
     */
    public Cancion descargarCancion(Cancion cancion) {
        for(int i = 0; i < this.canciones.length; i++) {
            if(this.canciones[i].nombre.equals(cancion.nombre)) {
                return this.canciones[i];
            }
        }
        return null;
    }

    /**
     * @return El identificador único del usuario
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param id El nuevo identificador único del usuario
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return El correo electrónico del usuario
     */
    public String getCorreo() {
        return this.correo;
    }

    /**
     * @param correo El nuevo correo electrónico del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return El nombre de usuario de la cuenta
     */
    public String getUsuario() {
        return this.usuario;
    }

    /**
     * @param usuario El nuevo nombre de usuario de la cuenta
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return El nombre real del usuario
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre El nuevo nombre real del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return El primer apellido del usuario
     */
    public String getApellido1() {
        return this.apellido1;
    }

    /**
     * @param apellido1 El nuevo primer apellido del usuario
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return El segundo apellido del usuario
     */
    public String getApellido2() {
        return this.apellido2;
    }

    /**
     * @param apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return La cantidad de dinero que posee el usuario
     */
    public double getMonedero() {
        return this.monedero;
    }

    /**
     * @param monedero La nueva cantidad de dinero que posee el usuario
     */
    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    /**
     * @return La cantidad de créditos que posee el usuario
     */
    public int getCreditos() {
        return this.creditos;
    }

    /**
     * @param creditos
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

}