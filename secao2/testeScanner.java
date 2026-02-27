package secao2;
import java.util.Scanner;

public class testeScanner {
    public static void main(String[] args) {
        
        //1 - Testando Scanner
        Scanner scanner = new Scanner(System.in); 
            // Mensagem enviada ao usuário para solicitar o nome
            System.out.println("Seja bem-vindo! Por favor Digite o seu nome: ");

            // O método nextLine() é usado para ler uma linha completa de texto, incluindo espaços em branco.
            String nome = scanner.nextLine();

            // Exibe uma mensagem de agradecimento ao usuário, incluindo o nome que ele digitou.
            System.out.println("Agradecemos a sua presença " + nome);

            // Mensagem enviada ao usuário para solicitar a idade
            System.out.println("Agora informe sua idade por favor: ");

            // O método nextInt() é usado para ler um número inteiro do usuário.
            int idade = scanner.nextInt();

            // Exibe uma mensagem ao usuário informando a idade que ele digitou.
            System.out.println("Então você tem " + idade + " anos");



        scanner.close();
        
    }
    
}