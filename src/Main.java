import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        int cambalhota = 0;
        while (cambalhota < 10){
            cambalhota++ ;
            if (cambalhota == 5 || cambalhota == 7 || cambalhota == 9) {
                continue;
            }
            System.out.println("Dando uma cambolha pela vez: " + cambalhota);
        }
    }
}
