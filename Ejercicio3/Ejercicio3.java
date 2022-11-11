package java_capitulo_6.java_capitulo_6.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Genera una carta de la baraja española");
    String palo = " ";
    String carta = " ";
    
    int numPalo = (int)(Math.random()*4) + 1;
    
    switch(numPalo) {
        case 1:
        palo = "moneda";
        break;
        case 2:
        palo = "copa";
        break;
        case 3:
        palo = "bastos";
        break;
        case 4:
        palo = "espada";
        default:
    }

    int numCarta = (int)(Math.random()*11) + 1;
    
    switch(numCarta) {
        case 1:
        carta = "As";
        break;
        case 8:
        carta = "Sota";
        break;
        case 9:
        carta = "Caballo";
        break;
        case 10:
        carta = "Rey";
        break;
        default:
        carta = String.valueOf(numCarta);
    }
    
    System.out.println(carta + " de " + palo);
    }
}
