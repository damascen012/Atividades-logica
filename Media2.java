import java.io.IOException;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner (System.in);
    double v1 = input.nextDouble();
    double v2 = input.nextDouble();
    double v3 = input.nextDouble();
    
    double result = ((v1*2)+(v2*3)+(v3*5))/10.0;
    System.out.printf("MEDIA = %.1f%n", result);
    input.close();
    }
}