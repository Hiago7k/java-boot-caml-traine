import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
       // do while exemplo
        int n, s=0;
        Scanner data = new Scanner(System.in);
        String resp;

        do{
            System.out.println("Digite um número");
            n = data.nextInt();
            s += n; // s + s = n;
            System.out.println("Quer continuar? [S/N]");
            resp = data.next();
        }while (resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
}
