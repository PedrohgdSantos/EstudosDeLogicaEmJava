package Projeto2;
import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //verdadeira
        boolean isTrue = true;
        //falsa
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        //Operadores de comparação

        int num = 10;

        //Comparação
        System.out.println(num == 10);

        //Diferente de 
        System.out.println(num != 9);

        //Maior que 
        System.out.println(num > 11);

        //Menor que
        System.out.println(num < 8);

        //Maior Igual
        System.out.println(num >= 10);

        //Menor igual
        System.out.println(num <= 11);

        //Comparação de Strings usando EQUALS()

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";

        System.out.println(str1.equals(str2));

        // usando o equalsignoreCase ele apenas verifica se é uma String ignorando qualquer diferenciação entre os carácteres
        System.out.println(str1.equalsIgnoreCase(str3));

        // if
        int numero = 10;

        if (numero > 5) {
            System.out.println("O número é maior do que 5");
        }

        //else
        int a = 20;

        if ( a > 18) {
            System.out.println("Você tem mais de 18 anos");
        }
        else {
            System.out.println("Você ainda é menor de idade");
        }
        
        System.out.println("Digite sua 1° nota: ");
        double nota = scanner.nextDouble();
        System.out.println("Digite sua 2° nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite sua 3° nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite sua 4° nota: ");
        double nota4 = scanner.nextDouble();

        int media = (int) ( (nota + nota2 + nota3 + nota4) / 4 );

        if ( media >= 9) {
            System.out.println("Sua nota foi muito boa parabéns");
        } else if ( media >= 7 ) {
            System.out.println("Sua nota está boa");
        } else if ( media >= 6) { 
            System.out.println("Sua nota está na média");
        } else {
            System.out.println("Você está de recuperação");
        }

        scanner.close();
    }
}
