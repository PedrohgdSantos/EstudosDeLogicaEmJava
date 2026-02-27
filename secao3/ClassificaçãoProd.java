package secao3;
import java.util.Scanner;

public class ClassificaçãoProd {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String produto1 = "Mouse Gamer";
        String produto2 = "Teclado Gamer";
        String produto3 = "Monitor Gamer";
        double preco = 0;

        System.out.println("Digite o nome do produto: ");

        String nomeProduto = scanner.nextLine();
        
        if (produto1.equalsIgnoreCase(nomeProduto) ||
         produto2.equalsIgnoreCase(nomeProduto)||
          produto3.equalsIgnoreCase(nomeProduto)) {
            
            System.out.println("Produto já existe. Quer atualizar o preço?");

            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("Sim")) {

                System.out.println("Digite o valor que deseja: ");
                preco = scanner.nextDouble();

                System.out.println("Concluido, o valor do produto: " + nomeProduto 
                + " foi atualizado e agora ele está valendo: " + preco );

                if (preco >= 50 && preco <= 100) {
                    System.out.println("O valor está na média");
                } else if (preco <= 49) {
                    System.out.println("O valor está baixo");
                } else {
                    System.out.println("O valor ta muito alto");
                }
                
            }
        } else{
            System.out.println("Deseja cadastrar um produto novo? ");
            String respCadastro = scanner.nextLine();

            if (respCadastro.equalsIgnoreCase("Sim")) {
                System.out.println("Digite o nome do seu produto novo");
                String cadastroNew = scanner.nextLine();

                System.out.println("Digite o valor que deseja: ");
                preco = scanner.nextDouble();

                System.out.println("Concluido o seu produto: " + cadastroNew + " no valor de R$" + preco );

            }
        

        }

        scanner.close();
    }
}
