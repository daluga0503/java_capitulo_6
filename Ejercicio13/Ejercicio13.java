package java_capitulo_6.java_capitulo_6.Ejercicio13;

public class Ejercicio13 {
    public static void main(String[] args) {
        int tirada1;
        int tirada2;

        do {
            tirada1 = (int)((Math.random()*6)+1);
            tirada2 = (int)((Math.random()*6)+1);
            System.out.println("Tirada 1: " + tirada1 + " Tirada 2: " + tirada2);
        } while (tirada1 != tirada2);

    }
}
