package java_capitulo_6.java_capitulo_6.Ejercicio15;

public class Ejercicio15 {
    public static void main(String[] args) {
        int melodia = 4*(int)(Math.random()*7); 
        String nota  = " ";
        String primera = " ";

                for(int contador = 1; contador <= melodia ; contador ++){
                    switch ((int)(Math.random()*7+1)) { 
                        case 1:
                            nota = "do";
                        break;
                        case 2:
                            nota = "re";
                        break;
                        case 3:
                            nota = "mi";
                            break;
                        case 4:
                            nota = "fa";
                        break;
                        case 5:
                            nota = "sol";
                        break;
                        case 6:
                            nota = "la";
                        break;
                        case 7:
                            nota = "si";
                        break;
                    }

                    
                    if (contador == 1){ 
                        primera = nota;
                    }

                    if (contador == melodia){ 
                        nota = primera;
                    }

                    System.out.print(nota + " ");
                    
                    if(contador == melodia){
                        System.out.print(" || ");
                    } else if(contador%4==0){
                        System.out.print("| ");
                    }
                    
                }
            }
        }