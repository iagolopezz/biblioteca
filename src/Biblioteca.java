import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro registrado: " + libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario);
    }

    public void prestarLibro(String isbn, String dni) {
        Libro libro = buscarLibro(isbn);
        Usuario usuario = buscarUsuario(dni);

        if (libro == null) {
            System.out.println("Libro no encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        if (libro.estaPrestado()) {
            System.out.println("El libro ya está prestado.");
            return;
        }

        libro.prestar();
        usuario.prestarLibro();
        System.out.println("Libro prestado exitosamente a " + usuario);
    }

    public void devolverLibro(String isbn, String dni) {
        Libro libro = buscarLibro(isbn);
        Usuario usuario = buscarUsuario(dni);

        if (libro == null || usuario == null) {
            System.out.println("Libro o usuario no encontrado.");
            return;
        }

        if (!libro.estaPrestado()) {
            System.out.println("Ese libro no estaba prestado.");
            return;
        }

        libro.devolver();
        usuario.devolverLibro();
        System.out.println("Libro devuelto exitosamente.");
    }

    private Libro buscarLibro(String isbn) {
        for (Libro l : libros) {
            if (l.getISBN().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(String dni) {
        for (Usuario u : usuarios) {
            if (u.getDni().equals(dni)) {
                return u;
            }
        }
        return null;
    }
}
