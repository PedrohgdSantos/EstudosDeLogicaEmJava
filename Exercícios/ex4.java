package Exercícios;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número de 1 a 7 para verificar se é um dia útil ou não: ");
        int diaUtil = scanner.nextInt();

        switch (diaUtil) {
            case 1:
                System.out.println("Segunda é um dia útil");
                break;
            case 2:
                System.out.println("Terça é um dia útil");
                break;
            case 3:
                System.out.println("Quarta é um dia útil");
                break;
            case 4:
                System.out.println("Quinta é um dia útil");
                break;
            case 5:
                System.out.println("Sexta é um dia útil");
                break;
            case 6:
                System.out.println("Sabado não é um dia útil");
                break;
            case 7:
                System.out.println("Domingo não é um dia útil");
                break;

        
            default:
                System.out.println("Desculpe você digitou um número invalido");
                break;
        }

        scanner.close();
    }

    
}
