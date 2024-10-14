// Mostrar los números primos desde 2 hasta N

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número N
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        System.out.println("Números primos entre 2 y " + N + ":");

        // Bucle para encontrar números primos
        for (int i = 2; i <= N; i++) {
            if (esPrimo(i)) {  // Verificar si el número es primo
                System.out.println(i);  // Imprimir el número primo
            }
        }

        scanner.close();  // Cerrar el escáner
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;  // 0 y 1 no son primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  // Divisible por otro número, no es primo
            }
        }

        return true;  // Es primo
    }
}
