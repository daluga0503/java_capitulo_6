package java_capitulo_6.java_capitulo_6.Ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Resultado de la quiniela:"); 
        int resultadoPartido;
        int columnas = 3;
        
        for (int fila = 1; fila <= 14; fila++) {
            System.out.printf("%2d. |", fila);
    
            for (int apuesta = 1; apuesta <= columnas; apuesta++) {
            resultadoPartido = (int)(Math.random() * 6) + 1;
            switch(resultadoPartido) {
                case 1:
                System.out.print("1  |");
                break;
                case 2:
                System.out.print("1  |");
                break;
                case 3:
                System.out.print("1  |");
                break;
                case 4:
                System.out.print("  2|");
                break;
                case 5:
                System.out.print("  2|");
                break;
                case 6:
                System.out.print(" X |");
                break;
                default:
            }
            }
            System.out.println();
        }
        
        System.out.print("Pleno al 15   ");
        int goles = (int)(Math.random() * 4);
        System.out.print("Local...");
        System.out.print(goles < 3 ? goles : "M");
        
        System.out.print("   Visitante...");
        goles = (int)(Math.random() * 4);
        System.out.print(goles < 3 ? goles : "M");
        }
    }

