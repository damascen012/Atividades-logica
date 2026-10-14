import java.io.IOException;
import java.util.Scanner;
 
public class Media1 {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner (System.in);
    double v1 = input.nextDouble();
    double v2 = input.nextDouble();
    
    double media = ((v1*3.5) + (v2*7.5))/11.0;
    System.out.printf("MEDIA = %.5f%n", media);
    input.close();
    }
}