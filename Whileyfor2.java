
package whileyfor.pkg2;
import java.util.Scanner;
/**
 *
 * @author Pratik
 */
public class Whileyfor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    int a, b;
    Scanner S = new Scanner(System.in);
    
    System.out.println("Introduce un número menor: ");
    a = S.nextInt();
    
    System.out.println("Introduce un número mayor: ");
    b = S.nextInt();
    
    for(int i = a; i < b; i++){
    
    System.out.println(i+" ");    
    }
    
}
}
