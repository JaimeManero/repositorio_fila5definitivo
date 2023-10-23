package src;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una frase (puede tener puntos, comas y espacios): ");
        String s=sc.nextLine();

        s=s.replace(" ", "");
        s=s.replace(",", "");
        s=s.replace(".", "");
        int fin = s.length()-1;
        int ini=0;
        boolean espalin=true;

        while(ini < fin){
            if(s.charAt(ini)!=s.charAt(fin)){
                espalin=false;
            }
            ini++;
            fin--;
        }
        if(espalin)
            System.out.print("\nEs palindromo.");
        else
            System.out.print("\nNo es palindromo.");
    }
}
