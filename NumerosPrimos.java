package numeros.primos;
import java.util.Scanner;
/**
 *
 * @author Pratik
 */
// Comprobar si es el número primo.
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int primo;
     Scanner s = new Scanner(System.in);
     boolean resultado = true;
     
     System.out.println("Introduce un número primo:  ");
     primo = s.nextInt();
     
     
     
     for (int a = 2; a < primo; a++){
         if(primo % a == 0){
         resultado = false;
         }
     }
         if(resultado){
             System.out.println("Es un número primo.");     
         }
         else{
          System.out.println("No es un número primo.");
         }
    
    }
    
}
