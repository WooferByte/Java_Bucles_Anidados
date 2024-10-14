// Mostrar los números perfectos entre 1 y 1000.

public class Ejercicio_1 {
    public static void main(String[] args) {
        System.out.println("Números perfectos entre 1 y 1000:");

        // Recorrer los números del 1 al 1000
        for (int i = 1; i <= 1000; i++) {
            int sumaDivisores = 0;  // Inicializar la suma de divisores

            // Encontrar los divisores del número i
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumaDivisores += j;  // Sumar el divisor
                }
            }

            // Comprobar si el número es perfecto
            if (sumaDivisores == i) {
                System.out.println(i);  // Imprimir el número perfecto
            }
        }
    }
}