import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
      // Adivinhando um Numero AkiNumber
        System.out.println("*******************************");
        System.out.println("--- Bem vindo ao AkiNumber ---");
        System.out.println("*******************************");

        System.out.println("Tente advinhar o número que estou pensando de 1 a 5 digite: ");
        Scanner dados = new Scanner(System.in);
        int numeroDoUsuario = dados.nextInt();
        System.out.println(numeroDoUsuario);

        double numeroSecreto = Math.random();
        int num = (int) (1 + numeroSecreto * (5-1));
        
        String resposta;

        resposta = (num==numeroDoUsuario)?"Voce acertou o numero":"Voce errou o numero";
        System.out.println("O numero que pensei foi " + num);
        System.out.println(resposta);
    }
}