package java_capitulo_6.java_capitulo_6.Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        int suma=0;
        int cont=0;
        int maximo = 100;
        int minimo = 199;
        for(int i=1;i<=50;i++){
            int tirada=(int)(Math.random()*100+100) ;
            System.out.print(tirada + " ");
            suma=suma+tirada;
            cont ++;

            if (tirada < minimo) {
                minimo = tirada;
                }
                
                if (tirada > maximo) {
                maximo = tirada;
                }

        }




        System.out.println(" ");
        System.out.println("El máximo de estos números es: " + (int)maximo);
        System.out.println("El mínimo de estos números es: " + (int)minimo);
        System.out.println("La media de los números es de: " + suma/cont);
    }
}
