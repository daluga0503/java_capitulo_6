package java_capitulo_6.java_capitulo_6.Ejercicio22;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud de la serpiente contando con la cabeza: ");
        int longitud = sc.nextInt();
        int espacios=13;


        // Cabeza de la serpiente
        for(int i = 0; i<=12;i++){
        System.out.print(" ");
        }
        System.out.println("@");

        // Cuerpo de la serpiente
        for(int j =1; j<=espacios;j++){
        int cuerpo = (int)(Math.random()*3)+1;

        switch (cuerpo) {
            case 1:
                espacios--;
                for(int k=1;k<=espacios;k++){
                    System.out.print(" ");
                    }
                    System.out.println("*");
            
                break;
            case 2:
            for(int k=1;k<=espacios;k++){
                System.out.print(" ");
            }
            System.out.println("*");
                break;
            case 3:
            espacios++;
            for(int k=1;k<=espacios;k++){
                    System.out.print(" ");
                }
                System.out.println("*");
                break;

                default:
                break;
        }
    }
    }
}


    

