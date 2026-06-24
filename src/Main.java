import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner data =  new Scanner(System.in);
        int n, s=0, p=0, i=0, h=0;
        float media = 0;
        do {
            System.out.println("Informe um numero: " + " Valor 0 interrompe");
            n = data.nextInt();
            s += n;

            if(n != 0){
               media = (float) s / n;
            }

            if(n % 2 == 0 && n > 0){
              p++;
              if (n > 100) h++;
            } else if(n > 0) {
                i++;
            }
        }while (n != 0);
        System.out.println("--- Resultado ----");
        System.out.println("Total de valores: " + s);
        System.out.println("Total de pares: " + p);
        System.out.println("Total de impares: " + i);
        System.out.println("Acima de 100: " + h);
        System.out.println("Media dos valores: " + media);
        System.out.println("------------");
    }
}
