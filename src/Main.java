import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        // calculo de fatorial
        // 4 x 3 x 2 x 1
        // ou seja o fatorial é o numero que escolhemos 10
        // ai fazemos o 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 1
        // o resultado final seria 5 x 4 x 3 x 2 x 1 = 120
        // 120 seria o fatorial



        int i = 1;
        int a = 0;

        while (i < 10){
            ++a; // 10 vezes o a vira 11
            i = i + 1; // 2
            if (a> 6) i++; // essa espressao vai ser true apenas 4 vezes 2 6 8
        }
        System.out.println(i); // aqui é 11
        System.out.println(a); // aqui é 8





    }
}
