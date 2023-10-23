package src;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        boolean primo=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un número");
        int num = sc.nextInt();

        int i = 2;
        while (i < num && primo==true) {
            System.out.println(i);
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        if (primo == true) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }
    }

