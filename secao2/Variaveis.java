package secao2;

public class Variaveis {

    public static void main(String[] args) {
        
        //tipo : nomeVar = Atribui um tipo de valor ou um valor
        String nome = "Pedro";
        Number idade = 20;

        //Recebendo o dado de outra var
        String nomeDois = nome;

        System.out.println("Meu nome é " + nome);
        System.out.println("Minha idade é " + idade + " Anos");

        //Concatenando com String
        System.out.println("Realmente meu nome é: " + nomeDois + " e este nome é duplicado");

        //Tipo de Var = Inteiro

        int n = 30;
        int u = 20;

        System.out.println("Este vai ser meu salário um dia: " + n * u * (n + u) / 2);

        //Tipo de Var = Long

        long populacaoMundial = 7899999999999999999L;

        System.out.println("Está é a nova quantidade de população mundial : " + populacaoMundial);

        //Tipo de Var = Double = 
        
        double porcentagemAtual = 100.00;
        int diaFoiMal = 20;

        System.out.println("Meu dia foi um total de " + ((porcentagemAtual % 3) - (diaFoiMal / 2)) + "%");

        //Op aritmeticos avançado

        int x = 5;

        x++;

        System.out.println(x);

        int y = 10;

        y--;

        System.out.println(y);

        int w = 4;

        w += 6;

        System.out.println(w);

        int z = 20;

        z -= 15;

        System.out.println(z);

        // Tipe casting
        // Implicito ( Widening)

        int nummer = 42;

        long nummerLong = nummer;

        double nummerDou = nummer;

        System.out.println(nummerLong);
        System.out.println(nummerDou);

        //Explicito(Narrowing)

        double valorDouble = 10.50;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        //Var Constante

        final int numeroConstante = 200;

        System.out.println("Eu tenho na minha poupança: " + numeroConstante);

        //Ela não pode receber outro valor pois se trata de uma constante



    }
    
}
