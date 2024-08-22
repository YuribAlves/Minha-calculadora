import java.util.Scanner;
public class Main2  {
  public static void main(String[] args) {
    
    System.out.println("Qual operação você deseja realizar?");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");

    int opcao;

    Scanner leitor = new Scanner (System.in);
    opcao = leitor.nextInt();

    if (opcao == 1){ //soma
      float a;
      float b;
      System.out.println("Digite o primeiro número: ");
      a = leitor.nextFloat();
      System.out.println("Digito o segundo número:");
      b = leitor.nextFloat();
      float res;
      res = a + b;  
      System.out.printf("Resultado: %.2f", res);
  } else if (opcao == 2){ // subtração
      float a;
      float b;
      System.out.println("Digite o primeiro número: ");
      a = leitor.nextFloat();
      System.out.println("Digito o segundo número:");
      b = leitor.nextFloat();
      float res;
      res = a - b;  
      System.out.printf("Resultado: %.2f", res);
      
  } else if (opcao == 3){ // Multiplicação
      float a;
      float b;
      System.out.println("Digite o primeiro número: ");
      a = leitor.nextFloat();
      System.out.println("Digito o segundo número:");
      b = leitor.nextFloat();
      float res;
      res = a * b;  
      System.out.printf("Resultado: %.2f", res);
      
  } else if (opcao == 4){ // Divisão
      float a;
      float b;
      
      System.out.println("Digite o primeiro número: ");
      a = leitor.nextFloat();
      System.out.println("Digito o segundo número:");
      b = leitor.nextFloat();
      float res;
      res = a / b;  
      System.out.printf("Resultado: %.2f", res);
      
  } else {
      System.out.println("Opção inválida");
  }

  }
  
}