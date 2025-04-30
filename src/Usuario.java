public class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;
    private int librosPrestados;

    public Usuario(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.librosPrestados = 0;
    }

    public String getDni() {
        return dni;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro() {
        librosPrestados++;
    }

    public void devolverLibro() {
        if (librosPrestados > 0) {
            librosPrestados--;
        }
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " - DNI: " + dni + " - Libros prestados: " + librosPrestados;
    }
}
