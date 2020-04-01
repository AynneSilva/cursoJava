import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe o valor do raio");
       double raio = sc.nextDouble();
       final double pi = 3.14;
       double a = raio*pi;
       System.out.println("O valor da circuferencia é " +a+"!");

    }
}
