import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        System.out.println("Tipos de traingulo");
        Scanner data = new Scanner(System.in);
        System.out.println("Segmento A do triangulo: ");
        int a = data.nextInt();
        System.out.println("Segmento B do triangulo: ");
        int b = data.nextInt();
        System.out.println("Segmento C do triangulo: ");
        int c = data.nextInt();


        if(a<b+c && b<a+c  && c<a+b){
            if (a ==b && b==c)
            {
                System.out.println("Equilatero");
            }else if(a!=b && b!=c && a!=c){
                System.out.println("Escaleno");
            }else {
                System.out.println("Isoselis");
            }
        }else {
            System.out.println("Não forma um triangulo");
            System.out.println("-------");
        }

    }
}
