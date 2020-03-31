import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor do seu salario");
            float salario = sc.nextFloat();
            final var constante = 4500.0;
        if (salario >= constante) {
           var resultado = salario * 0.3;
           System.out.println("Aumento de salario foi de"+ resultado);


        } else {
            salario *= 0.15;
            System.out.println("O aumento do seu salario foi de:"+salario);

        }




    }
}
