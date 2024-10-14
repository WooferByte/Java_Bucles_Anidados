// Programa que muestre en lineas separadas lo siguiente: ZYWXVUTSRQPONMLKJIHGFEDCBA, YWXVUTSRQPONMLKJIHGFEDCBA,
// WXVUTSRQPONMLKJIHGFEDCBA, ...., DCBA, CBA, BA, A.

public class Ejercicio_4 {
    public static void main(String[] args) {
        // Inicializar el alfabeto en orden inverso
        String alfabeto = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        // Mostrar las líneas separadas
        for (int i = 0; i < alfabeto.length(); i++) {
            // Crear un substring del alfabeto desde la posición i hasta el final
            String subAlfabeto = alfabeto.substring(i);
            System.out.println(subAlfabeto);  // Imprimir el substring
        }
    }
}
