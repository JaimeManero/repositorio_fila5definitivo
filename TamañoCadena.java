import java.util.Scanner;
public class TamañoCadena {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String inputString = sc.nextLine();

        int length = inputString.length();

        System.out.println("El tamaño de la cadena es: " + length);

        sc.close();



    }
}
