
import java.util.Scanner;
/**
 *
 * @author Pratik
 */
public class DoAndWhileMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        
        
        do{
        System.out.println("- Al pulsar el número 1, te enseñeremos hola mundo!");
        System.out.println("- Al pulsar el número 2, te mostraremos el nombre del autor de este documento :");
        System.out.println("- Al pulsar el número 3, me ha gustado tu diseño!");
        System.out.print("Introduce una opción : ");
    
        a = s.nextInt();
        }while(a > 3 || a < 1);
        
        switch(a){
        
            case 1:
                System.out.println("Hola mundo!");
            break;
            
            case 2:
                System.out.println("Pratik Kumar Patel");
            break;
            
            case 3:
                System.out.println("Me ha gustado tu diseño.");
            break;
            
            default:
                System.out.println("Introduzca una opción correcta.");
            
        }
    }
    
}
