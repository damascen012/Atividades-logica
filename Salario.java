import java.io.IOException;
import java.util.Scanner;

public class Salario {
 
    public static void main(String[] args) throws IOException {
        Scanner calculoSalario = new Scanner (System.in);
        
    int NFunci = calculoSalario.nextInt();
    int HTrab = calculoSalario.nextInt();
    double Salario = calculoSalario.nextDouble();
    
    
    System.out.println("NUMBER = " + NFunci);
    System.out.printf("SALARY = U$ %.2f\n", HTrab*Salario);
    calculoSalario.close();
    }
}

