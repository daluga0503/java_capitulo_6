package java_capitulo_6.java_capitulo_6.Ejercicio29;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");

        System.out.print("Selecciona una estación del año (1-4): ");
        int estacion=sc.nextInt();
        int maxima;
        int minima;
        int soleadonublado;


        System.out.println("Previsión del tiempo para mañana");

        System.out.println("________________________________");

        switch (estacion) {
            case 1:
            minima=(int)(Math.random()*16)+15;
            maxima=(int)(Math.random()*16)+15;
            
            if (minima > maxima) {
                int aux = minima;
                minima = maxima;
                maxima = aux;
                }

            

            System.out.println("Temperatura mínima: " + minima + "ºC");
            System.out.println("Temperatura máxima: " + maxima +"ºC");


            soleadonublado=(int)(Math.random()*10);
            if(soleadonublado>=6){
                System.out.println("Soleado");
            }else{
                System.out.println("Nublado");
            }


                break;

            case 2:

            minima=(int)(Math.random()*26)+20;
            maxima=(int)(Math.random()*26)+20;
            
            if (minima > maxima) {
                int aux = minima;
                minima = maxima;
                maxima = aux;
                }


            System.out.println("Temperatura mínima: " + minima + "ºC");
            System.out.println("Temperatura máxima: " + maxima +"ºC");

            
            soleadonublado=(int)(Math.random()*10);
            if(soleadonublado>=8){
            System.out.println("Soleado");
            }else{
            System.out.println("Nublado");
            }
            break;

            case 3:

            minima=(int)(Math.random()*21)+10;
            maxima=(int)(Math.random()*21)+10;
            
            if (minima > maxima) {
                int aux = minima;
                minima = maxima;
                maxima = aux;
                }


            System.out.println("Temperatura mínima: " + minima + "ºC");
            System.out.println("Temperatura máxima: " + maxima +"ºC");
            


            soleadonublado=(int)(Math.random()*10);
            if(soleadonublado>=4){
            System.out.println("Nublado");
            }else{
            System.out.println("Soleado");
            }

            break;

            case 4:

            minima=(int)(Math.random()*26);
            maxima=(int)(Math.random()*26);
            
            if (minima > maxima) {
                int aux = minima;
                minima = maxima;
                maxima = aux;
                }


            System.out.println("Temperatura mínima: " + minima + "ºC");
            System.out.println("Temperatura máxima: " + maxima +"ºC");

            soleadonublado=(int)(Math.random()*10);
            if(soleadonublado>=2){
            System.out.println("Nublado");
            }else{
            System.out.println("Soleado");
            }
            break;
        
            default:
                break;
        }


    }
}
