package Projeto1;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura:");
        double altura = scanner.nextDouble();

        double valorIMC = peso / (altura * altura);

        System.out.println(valorIMC);

        scanner.close();
    }
}
