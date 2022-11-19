package java_capitulo_6.java_capitulo_6.Ejercicio31;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuanto dinero quieres apostar? ");
        int apuesta=sc.nextInt();
        int tirada1=0;
        int tirada2=0;
        int suma;
        int retirada= apuesta*2;
        boolean seguir=true;
        tirada1=(int)(Math.random()*6+1);
        System.out.println("Dado 1: " + tirada1);
        tirada2=(int)(Math.random()*6+1);
        System.out.println("Dad0 2: "+ tirada2);
        suma=tirada1+tirada2;
        int suma2=0;


        if(suma==7 || suma==11){
            System.out.print("Felicidades has ganado "+retirada+" euros");
        }else{
            if(suma==2 || suma==3 || suma==12){
                System.out.print("Lo siento, has perdido todo el dinero");
            }else{
                System.out.println("Vuelve a tirar");
                System.out.println("Si sacas el "+suma+" ganas, pero si sacas el 7 pierdes.");
                System.out.println("Si cas otro número se seguirá con el juego");
            
                while(seguir){
                    tirada1=(int)(Math.random()*6+1);
                    System.out.println("Dado 1: "+tirada1);
                    tirada2=(int)(Math.random()*6+1);
                    System.out.println("Dado 2: "+tirada2);
                    suma2=tirada1+tirada2;
                    if(suma2==suma){
                        System.out.println("Felicidades has ganado "+retirada+" euros");
                        seguir=false;
                    }else{
                        if(suma2==7){
                            System.out.println("Lo siento, has perdido todo");
                            seguir=false;
                        }else{
                            System.out.println("Sigue jugando");
                        }
                    }
                }
            }
        }



        sc.close();
        }
	}

    
    




