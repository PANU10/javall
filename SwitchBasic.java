package pkgswitch.basic;
import java.util.Scanner;

/**
 *
 * @author Pratik
 */
public class SwitchBasic {

    public static void main(String[] args) {
     int año;
     Scanner S = new Scanner(System.in);

     System.out.println(" Introduce un valor :  ");
     
     año = S.nextInt();

     switch(año){
     
         case 1:
             System.out.println(" El valor es 1. ");
         break;
         
         case 2:
             System.out.println(" El valor es 2. ");
         break;
         
         case 3:
             System.out.println(" El valor es 3. ");
         break;
         
         case 4:
             System.out.println(" El valor es 4. ");
         break;
         case 5:
             System.out.println(" El valor es 5. ");
         break;
         
         case 10:
             System.out.println(" El valor es 10. ");
         break;
         
         default:
             System.out.println(" No existe este valor. ");

             
     }
    }
    
}
