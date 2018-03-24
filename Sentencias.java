//Comprobar el valor dado por el teclado si es par.
package sentencias;
import java.util.Scanner;

public class Sentencias {

    public static void main(String[] arg) {
     
    int a,b;
     
    Scanner typing = new Scanner(System.in);
     System.out.println("Introduce un número : "); 

     a = typing.nextInt();
     
     b = a % 2;
     
    if(b == 0){
        System.out.println("El número "+a+ " es par.");
    }
    else{
         System.out.println("El número "+a+ " es impar.");
    }
}
}