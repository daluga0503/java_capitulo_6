package java_capitulo_6.java_capitulo_6.Ejercicio25;

public class Ejercicio25 {
    public static void main(String[] args) {
        int numeros=0;
        boolean primo = false;
        for(int i = 1; i <=100;i++){
            numeros=(int)(Math.random()*191)+10;
            
            for(int j =2;j<=numeros/2;j++){
                if(numeros%i==0){
                    primo=true;
                }
            }
        

                if(numeros%5==0){
                    System.out.print(" #"+numeros+"# ");
                } else if(primo){
                    System.out.print(" {"+numeros+" }");
                }else{
                    System.out.print(" "+numeros+" ");
                }
            }
                
        
    }
}
    

