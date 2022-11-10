package java_capitulo_6.java_capitulo_6.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int suma = 0;
        for(int i =1; i<=3; i++){
        int tirada=(int)(Math.random()*6+1);
        System.out.println("Dado" + i + " :" + tirada);
        suma=suma+tirada;
        }
        System.out.println("la suma de las tres tiradas es: " + suma);
    }
}