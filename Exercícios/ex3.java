package Exercícios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é par ou impar");
        int num = scanner.nextInt();

        if (num%2 == 0) {
            System.out.println("é par");
        } else if (num%2 != 0){
            System.out.println(" é impar");
        }
        scanner.close();
    }
    
}
