import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        System.out.println("Ola seja bem vindo, a Loteria digite o nome do boleto");
        Scanner informacoes = new Scanner(System.in);
        String nomeDoBoleto = informacoes.nextLine();

        System.out.println("Salvando dados, do boleto no nosso banco de dados...");
        System.out.println("O boleto foi salvo codigo do boleto " + nomeDoBoleto);
    }
}