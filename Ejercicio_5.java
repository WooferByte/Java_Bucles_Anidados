// Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E

public class Ejercicio_5 {
    public static void main(String[] args) {
        // Contador de 5 dígitos
        for (int i = 0; i < 100000; i++) {
            String numero = String.format("%05d", i);  // Formatear el número como un entero de 5 dígitos

            // Reemplazar el dígito '3' por 'E'
            String resultado = numero.replace('3', 'E');

            System.out.println(resultado);  // Imprimir el resultado
        }
    }
}
