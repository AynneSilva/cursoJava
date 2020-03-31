public class calculando {
    public static void main(String[] args) {
        /* @ AynneSilva */
      var salary = 1500.0;
      var porcent = 30/100 ;

      var calculo = salary * 0.03;
      var resultado = calculo + salary;

      System.out.println("Seu salario teve um aumento de "+ calculo +" E agora seu salario é "+ resultado);
      calculo = salary * 0.05;

      System.out.println(calculo);
      calculo = salary * 0.06;
      System.out.println(calculo);
    }
}
