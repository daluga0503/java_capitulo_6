package java_capitulo_6.java_capitulo_6.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Muestra 20 números enteros aleatorios entre 0 y 10.");
        for(int i=1; i<=20;i++){
        System.out.print((int)(Math.random()*10)+" ");
    }
}
}
