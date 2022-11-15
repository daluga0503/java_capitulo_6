package java_capitulo_6.java_capitulo_6.Ejercicio19;

import java.net.Socket;

public class Ejercicio19 {
    public static void main(String[] args) {
        int cont = 0;
        int suma=0;
        int pares=0;
        int impares = 0;
        int minimo=200;
        int maximo=-100;

        for(int i=0;i<=50;i++){
            int num = (int)(Math.random()*300)-100;
            cont++;
            suma = suma+num;
            System.out.print(num+" ");

            if(num%2==0){
                pares++;
                if (num > maximo) {
                    maximo = num;
                    }
            }else{
                impares++;
                if (num < minimo) {
                    minimo = num;
                }
            }
        }

        System.out.println("Máximo de los pares: " + maximo );
        System.out.println("Mínimo de lo impares: " + minimo);
        System.out.println("La media de los números generados es: "+suma/cont);
    }
}


