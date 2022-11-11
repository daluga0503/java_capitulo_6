package java_capitulo_6.java_capitulo_6.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Genera al azar una carta de la baraja francesa: ");
    
    String palo = "";
    String carta = "";
    
    int numPalo = (int)(Math.random()*4) + 1;
    
    switch(numPalo) {
        case 1:
        palo = "picas";
        break;
        case 2:
        palo = "corazones";
        break;
        case 3:
        palo = "diamantes";
        break;
        case 4:
        palo = "tréboles";
        default:
    }

    int numCarta = (int)(Math.random()*13) + 1;
    
    switch(numCarta) {
        case 1:
        carta = "As";
        break;
        case 11:
        carta = "J";
        break;
        case 12:
        carta = "Q";
        break;
        case 13:
        carta = "K";
        break;
        default:
        carta = String.valueOf(numCarta);
    }
    
    System.out.println(carta + " de " + palo);



    }
}
