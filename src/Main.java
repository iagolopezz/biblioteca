import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Menú Biblioteca ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ISBN (13 dígitos): ");
                    String isbn = sc.nextLine();
                    System.out.print("Nombre del libro: ");
                    String nombreLibro = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año de salida: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    biblioteca.registrarLibro(new Libro(isbn, nombreLibro, autor, anio));
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    biblioteca.registrarUsuario(new Usuario(nombre, apellidos, dni));
                    break;
                case 3:
                    System.out.print("ISBN del libro a prestar: ");
                    String isbnPrestar = sc.nextLine();
                    System.out.print("DNI del usuario: ");
                    String dniUsuario = sc.nextLine();
                    biblioteca.prestarLibro(isbnPrestar, dniUsuario);
                    break;
                case 4:
                    System.out.print("ISBN del libro a devolver: ");
                    String isbnDevolver = sc.nextLine();
                    System.out.print("DNI del usuario: ");
                    String dniDevuelve = sc.nextLine();
                    biblioteca.devolverLibro(isbnDevolver, dniDevuelve);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
