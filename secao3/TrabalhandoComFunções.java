package secao3;


public class TrabalhandoComFunções {

    public static void main(String[] args) {
        // 1 - Criando a primeira função
        saudacao();
        saudacao();
        saudacao();

        // 2 - Parâmetros das funções

        soma(2, 4);

        // 3 - Retorno de funções

        System.out.println(dobrar(200));
    }

    public static void saudacao(){
        System.out.println("Olá mundo, estou programando em Java");
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println(resultado);
    }
    
    public static int dobrar(int n) {
        
        return (n *2 + 100) / 2;
    }
}