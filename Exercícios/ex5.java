package Exercícios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        if(num >= 10 && num <= 20){
            System.out.println("Dentro do intervalo");
        }else{
            System.out.println("Fora do intervalo");
        }
        scanner.close();
    }
    
}
