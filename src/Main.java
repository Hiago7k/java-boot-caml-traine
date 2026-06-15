import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o ano atual que estamos: ");
        int anoAtual = dados.nextInt();
        System.out.println("Digite o ano que você nasceu: ");
        int anoNascimento = dados.nextInt();

        int resultado = anoAtual - anoNascimento;
        System.out.println("Você tem a idade de  " + resultado);
        
    }
}