package java_capitulo_6.java_capitulo_6.Ejercicio27;
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ordenador=(int)(Math.random()*3)+1;
        String jugada="";
        int jugadas=0;
        int ordenadorjugada=0;
        System.out.print("Introduza la jugada(piedra, papel o tijeras): ");
        jugada=sc.next();
        if(jugada.equals("piedra")||jugada.equals("papel")||jugada.equals("tijeras")){
            System.out.print(" ");
        }else{
            System.out.println("Error al introducir la jugada.");
        }

        if(jugada.equals("piedra")){
            jugadas=1;
        }
        if(jugada.equals("papel")){
            jugadas=2;
        }
        if(jugada.equals("tijeras")){
            jugadas=3;
        }



        System.out.print("Turno del ordenador: ");

        switch (ordenador) {
            case 1:
                System.out.println("piedra");
                ordenadorjugada=1;
                break;
            case 2:
                System.out.println("papel");
                ordenadorjugada=2;
                break;
            case 3:
                System.out.println("tijeras");
                ordenadorjugada=3;
                break;
        
            default:
                break;


    }

    if(jugadas==ordenadorjugada){
        System.out.println("Empate");
    }

    if(jugadas<ordenadorjugada){
        System.out.println("Gana el ordenador");
    }
    if(jugadas>ordenadorjugada){
        System.out.println("Gana el jugador");
    }
}
}
