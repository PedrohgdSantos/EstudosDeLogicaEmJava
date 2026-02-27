package secao2;


public class Exercicios {
    
    public static void main(String[] args) {


        int valorUm = 10;
        int valorFinal = valorUm * 2;

        System.out.println(valorFinal);

        char letra1 = 'B';
        int letraNume = (int) letra1;

        System.out.println(letraNume);

        double teste1 = 15.75;
        double teste2 = 20.40;
        double somaDostestes = teste1 + teste2;

        System.out.println(somaDostestes);

        long populacao = 2_000_000_000L;
        int populacaoInteira = (int)populacao;

        System.out.println(populacaoInteira);
        System.out.println(populacao);


        String primeiroText = "Olá, Mundo";
        String segundoText = " Bem-vindo ao mundo do Java";

        System.out.println( primeiroText + segundoText);
        

    }
}
