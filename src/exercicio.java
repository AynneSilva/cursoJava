import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a sua idade");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("ADULTO");
        } else {
            System.out.println("NÃO ADULTO");
        }
    }
}
