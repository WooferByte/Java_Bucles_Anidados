// Leer un número N y calcular el factorial de los números desde 0 hasta N.

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número N
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        // Calcular y mostrar el factorial de los números de 0 a N
        System.out.println("Factoriales de los números desde 0 hasta " + N + ":");

        for (int i = 0; i <= N; i++) {
            long factorial = 1;  // Inicializar el factorial en 1

            // Calcular el factorial de i
            for (int j = 1; j <= i; j++) {
                factorial *= j;  // Multiplicar j al factorial
            }

            System.out.println("Factorial de " + i + " es: " + factorial);  // Mostrar el resultado
        }

        scanner.close();  // Cerrar el escáner
    }
}