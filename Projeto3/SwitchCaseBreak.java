package Projeto3;
import java.util.Scanner;

public class SwitchCaseBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual dia da semana você quer saber: ");
        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1 :
                System.out.println("Hoje é Segunda");
                break;

            case 2 :
                System.out.println("Hoje é Terça");
                break;

            case 3 :
                System.out.println("Hoje é Quarta");
                break;
            
            case 4 :
                System.out.println("Hoje é Quinta");
                break;
                
            case 5 : 
                System.out.println("Hoje é Sexta");
                break;
            
            case 6 :
                System.out.println("Hoje é Sabado");
                break;
            case 7 : 
                System.out.println("Hoje é Domingo");
                break;

            default : 
            System.out.println("Infelizmente você não digitou um valor correto");
            

        }


        scanner.close();
    }

}
