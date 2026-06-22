import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        System.out.println("Digite a quantidade de pernas: ");
        int pernas = data.nextInt();
        String tipo;

        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipedi";
                break;
            case 4:
                tipo = "Quadrupide";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "Et";
                break;
        }
        System.out.println(tipo);

    }
}
