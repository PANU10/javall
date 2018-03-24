 //Scanner = Recoge lo que introducimos con el teclado.

import java.util.Scanner;


public class EscribirElValor {

 
    public static void main(String[] args) {
        int a;
        double d;
        char c;
        Scanner typing = new Scanner(System.in);
        System.out.println("Introduce un valor pot teclado : ");
        
        a = typing.nextInt();
         System.out.println("El valor introducido és: "+a);
        
        d = typing.nextDouble();
        System.out.println("El valor introducido és: "+d);
        
       
  
        

        
    }
    
}
