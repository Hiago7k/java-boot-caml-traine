import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner data =  new Scanner(System.in);
        int n, s=0, p=0, i=0;
        do {
            System.out.println("Informe um numero: " + " Valor 0 interrompe");
            n = data.nextInt();
            s += n; // s recebe ele mesmo + o numero que acabou a ler

            if(n % 2 == 0 && n > 0){
              p++;
            } else if(n > 0) {
                i++;
            }
        }while (n != 0);
        System.out.println("Resultado final " +  "Somatorio vale: " + s);
        System.out.println("Total de pares: " + p);
        System.out.println("Total de impares: " + i);
    }
}
