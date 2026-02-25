package Exercícios;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto que vocêe deseja consultar: ");
        double precoProduto = scanner.nextDouble();

        if (precoProduto < 50) {
            System.out.println("está barato");
        } else if (precoProduto > 50 && precoProduto < 100) {
            System.out.println("O valor está mediano");
        } else if (precoProduto > 100) {
            System.out.println("O Produto está caro");
        }

    scanner.close();
    }
}
