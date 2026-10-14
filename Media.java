import java.io.IOException;
import java.util.Scanner;
 
public class Media {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner (System.in);
    double v1 = input.nextDouble();
    double v2 = input.nextDouble();
    
    double media = (v1 + v2)/2.0;
    System.out.printf("MEDIA = %.5f%n", media);
    input.close();
    }
}