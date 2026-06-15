import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner dados = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Calculador idade");
        System.out.println("=====================================");
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = dados.nextInt();

        int anoAtual = java.time.Year.now().getValue();

        int resultado = anoAtual - anoNascimento;
        System.out.println("Você tem " + resultado + " anos");
    }
}