import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        System.out.println("Contador de dividas no més");
        System.out.println("Digite a quantidade de parcelas, que voce possui no seu cartao");
        int numeroDeParcelas  = data.nextInt();

        System.out.println("Agora digite o valor da parcela: ");
        float valorParcela = data.nextFloat();

        float contador = 0;

        while (contador < numeroDeParcelas)
        {
            System.out.println("Somando total de parcelas: " + numeroDeParcelas);
            contador = numeroDeParcelas * valorParcela;
            System.out.println("Valor total a pagar: " + contador);
        }
    }
}
