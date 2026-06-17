import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
      // Estruturas Condicionais

        float n1, n2;
        n1 = 1;
        n2  = 8;
        float m = (n1 + n2) / 2;

        if(m >= 6){
            System.out.println("Parabens passou de ano");
            System.out.println("com a media " + m);
        } else{
            System.out.println("Reprovado");
        }


    }
}