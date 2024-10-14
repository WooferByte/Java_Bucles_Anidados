// Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número N
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        int sumaFactoriales = 0;  // Inicializar la suma de factoriales

        // Calcular la suma de los factoriales de los números desde 0 hasta N
        for (int i = 0; i <= N; i++) {
            long factorial = 1;  // Inicializar el factorial en 1

            // Calcular el factorial de i
            for (int j = 1; j <= i; j++) {
                factorial *= j;  // Multiplicar j al factorial
            }

            sumaFactoriales += (int) factorial;  // Sumar el factorial a la suma total
        }

        System.out.println("La suma de los factoriales desde 0 hasta " + N + " es: " + sumaFactoriales);

        scanner.close();  // Cerrar el escáner
    }
}