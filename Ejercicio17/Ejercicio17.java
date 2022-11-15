
package java_capitulo_6.java_capitulo_6.Ejercicio17;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();
        System.out.print("Introduce el ancho: ");
        int ancho = sc.nextInt();
        int pord= (altura-2) * (ancho-2);
        int posicion=0;
        int posicionpez=(int)(Math.random()*pord)+1;
        
        for(int i = 0; i<= ancho-1; i++){  //primera linea de la pecera
            System.out.print("*");
        }
        System.out.println(" ");
        
        // interior de la pecera

        for(int i = 2; i < altura; i++) {
            System.out.print("*"); 
            for(int j = 1; j <= ancho-2; j++) {
                if(posicion==posicionpez){
                    System.out.print("<");
                }else{
            System.out.print(" ");
            } 
            posicion++;
        }
            System.out.println("*");
        }


        for(int i = 0; i<= ancho-1; i++){  // ultima linea de la pecera
            System.out.print("*");
        
    
        
        
        }
        }
    }

