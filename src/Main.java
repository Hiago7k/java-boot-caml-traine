import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ola seu final de semana foi bom? 1 - para sim 2 - par não ");

        int resposta = teclado.nextInt();

        if(resposta == 1){
            System.out.println("Que bom que seu final de semana foi bom, me conte sobre ele");
        } else{
            System.out.println("Que pena que seu final de semana, não foi bom, oque aconteceu? ");
        }
    }
}