import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner dadosNumericos = new Scanner(System.in);

       /* System.out.println("Bem vindo a loja de bebidas, por gentileza digite sua idade: ");
        Integer idade = dadosNumericos.nextInt();
        // transformar numerico int em string
        String valorConvertido = Integer.toString(idade);
        System.out.println(valorConvertido);

        */


        // Transformar String em INT
        System.out.println("Digite seu ano: ");
        String anoDeNascimento = dadosNumericos.nextLine();
        int valorInteiro = Integer.parseInt(anoDeNascimento);

        System.out.println(valorInteiro + 1);
    }
}