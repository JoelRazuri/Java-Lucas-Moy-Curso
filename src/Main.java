import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primera parte
        String nombre;

        String saludo = "Hola, mi nombre es ";

        // números enteros
        int numero = 26;

        // números decimales
        double dinero = 100.5;

        // valores lógicos
        boolean esMayorDeEdad = true;

        System.out.println("Ingrese su nombre:");
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();

        System.out.println("Hola " + nombre);
    }
}