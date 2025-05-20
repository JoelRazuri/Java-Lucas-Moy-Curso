import java.util.Scanner;

public class CalculadoraAhorros {
    public static void main(String[] args){
        // Segunda parte - Calculadora de ahorros
        // 50: Necesidades
        // 30: Cosas que queremos
        // 20: Ahorros

        System.out.println("Ingrese su salario:");
        Scanner teclado = new Scanner(System.in);
        float salario = teclado.nextFloat();

        float necesidades = salario * 0.5f;
        float otrasCosas = salario * 0.3f;
        float ahorros = salario * 0.2f;

        System.out.println("Deberías asignar tu salario en las siguientes cosas:");
        System.out.println("Necesidades: $" + necesidades);
        System.out.println("Otras cosas: $" + otrasCosas);
        System.out.println("Ahorros: $" + ahorros);
    }
}
