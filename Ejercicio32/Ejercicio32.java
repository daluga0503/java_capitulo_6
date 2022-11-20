package java_capitulo_6.java_capitulo_6.Ejercicio32;
import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud del sendero: ");
        int longitud = sc.nextInt();
        int espaciosderechos=6;



        int metro = 1;

    // el programa irá imprimiendo metros (líneas) hasta llegar a la longitud deseada
    while (metro <= longitud) {
      // definimos la aparicion del primer metro, luego la aleatoriedad de los siguientes
      if (metro == 1) {
        System.out.print("      ");
      } else {
        int numEspacios = ((int)(Math.random() * 3) + 5);

        for (int espaciosSendero = 1; espaciosSendero <= numEspacios; espaciosSendero++) {
          System.out.print(" "); 
        }
      } // if

      // pintamos el borde derecho del metro
      System.out.print("|");

      // pintamos el interior del metro, con los posibles obstáculos
      for (int interiorSendero = 0; interiorSendero < 4; interiorSendero++) {
        int probObstaculo = ((int)(Math.random() * 4));
        String obstaculo = " ";
        switch (probObstaculo) {
          case 2:
            obstaculo = "*";
            break;
          case 3:
            obstaculo = "O";
            break;
          default:
            obstaculo = " ";
        } // switch

        System.out.print(obstaculo);
      } // for

      // pintamos el borde izquierdo del metro
      System.out.println("|");

      metro++;
    } // while

    }
}
