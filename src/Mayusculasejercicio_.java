package src;

import java.util.Scanner;

public class Mayusculasejercicio_ {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escribe una cadena: ");
            String cadena = scanner.nextLine();

            int contadorMayusculas = contarMayusculas(cadena);
            System.out.println("Número de mayúsculas en la cadena: " + contadorMayusculas);
}

    public static int contarMayusculas(String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contador++;
            }
        }

        return contador;
    }
}







