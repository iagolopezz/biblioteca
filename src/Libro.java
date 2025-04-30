public class Libro {
    private String ISBN;
    private String nombre;
    private String autor;
    private int anoSalida;
    private boolean prestado;

    public Libro(String ISBN, String nombre, String autor, int anoSalida) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.autor = autor;
        this.anoSalida = anoSalida;
        this.prestado = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return nombre + " (" + autor + ", " + anoSalida + ") - ISBN: " + ISBN + " - Prestado: " + prestado;
    }
}
