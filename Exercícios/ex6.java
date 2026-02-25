package Exercícios;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra para verficar se é vogal ou consoante: ");
        char letra =  scanner.nextLine().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É vogal");
                break;
        
            default:
                System.out.println("É consoante");
        }
        scanner.close();
    }
    
}
