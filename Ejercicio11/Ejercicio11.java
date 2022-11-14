package java_capitulo_6.java_capitulo_6.Ejercicio11;

public class Ejercicio11 {
    public static void main(String[] args) {
        int suspenso=0;
        int suficiente=0;
        int bien=0;
        int notable=0;
        int sobresaliente=0;
        
        for(int i=1;i<=20;i++){
            int nota=(int)(Math.random()*5+1);
            switch (nota) {
                case 1:
                    System.out.println("Suspenso");
                    suspenso++;
                    break;

                case 2:
                    System.out.println("Suficiente");
                    suficiente++;
                    break;

                case 3:
                    System.out.println("Bien");
                    bien++;
                    break;

                case 4:
                    System.out.println("Notable");
                    notable++;
                    break;

                case 5:
                    System.out.println("Sobresaliente");
                    sobresaliente++;
                    break;
            
                default:
                    break;
            }
            }
                        
        System.out.println(" ");
        System.out.println("Suspensos: " + suspenso);
        System.out.println("Suficiente: " + suficiente);
        System.out.println("Bien: "+ bien);
        System.out.println("Notables: "+notable);
        System.out.println("Sobresaliente: " + sobresaliente);
    }
}
