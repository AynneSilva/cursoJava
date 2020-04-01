import java.util.Scanner;
public class salarioLiquido {
    public static void main(String[] args) {
        //entrada
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do Salário Base,");
        double salarioBase = sc.nextDouble();

        System.out.println("Informe as Horas Trabalhadas ,");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Informe o Valor Hora de trabalho ,");
        double valorHoraDeTrabalho = sc.nextDouble();

        System.out.println("Informe o Percentual de Desconto ,");
        double percentualDeDesconto = sc.nextDouble();

        System.out.println("Informe o total de Desconto ,");
        double totalDeDesconto = sc.nextDouble();

        System.out.println("Informe o Salário Líquido ,");
        double SalárioLíquido= sc.nextDouble();
        //processamento

        double sb = horasTrabalhadas * valorHoraDeTrabalho;
        double td = (percentualDeDesconto/100) * salarioBase;
        double sl = salarioBase - totalDeDesconto;
        //saida

        System.out.println("Seu salário base é " + sb+ "seu total de descontos é "+td+"seu salario liquido é" +sl +"." );






    }
}
