package Exercícios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu usuário");
        String usuario = scanner.nextLine();
        System.out.println("Agora Digite sua senha: ");
        String password = scanner.next();

        if(usuario.equals("admin") && password.equals("1234")) { 
            System.out.println("Parabéns seu acesso foi liberado");
        } else {
            System.out.println("Seu acesso foi negado");
        }
        scanner.close();
    }
    
}
