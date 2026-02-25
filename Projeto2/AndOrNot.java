package Projeto2;
import java.util.Scanner;

public class AndOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
         int saldo = 5000;
        String contaLiberada = "Sim";

        if(saldo != 5000  && contaLiberada == "Sim"){
            System.out.println("Infelizmente você não foi liberado o pix para você ");
        } else if ( saldo == 5000 && contaLiberada == "Sim"){
            System.out.println("Parabéns você está disónivel para realizar seu pix");

            System.out.println("Qual o valor que você deseja enviar?");
            int valorEnviar = scanner.nextInt();

            int debitoConta = saldo - valorEnviar;

            System.out.println("Parabéns seu pix de " + valorEnviar + " foi enviado com sucesso agora");
            System.out.println("Saldo restante: " + debitoConta);
        }

        //Operador OR

        boolean estaChovendo = true;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);

        int idade = 16;
        boolean ehMembro = true;


        if(idade > 16 || ehMembro){
            System.out.println("Você pode acessar");
        }else{
            System.out.println("Entrada Negada");
        }


        //Operador Not
         System.out.println(!estaChovendo);


        scanner.close();
    }
}
