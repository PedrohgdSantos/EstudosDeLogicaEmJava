package Projeto1;
import java.util.Scanner;

public class CalculandoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
