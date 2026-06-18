import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        float n1 = teclado.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        float n2 = teclado.nextFloat();
        float m =  (n1 + n2) / 2;

        System.out.println("Sua média é " + m);
        if(m > 9) {
            System.out.println("Parabens pela sua nota " + m);
        }
    }
}