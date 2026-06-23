import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);

        int n = 5;
        int f = 1;
        int c = n;
      while(c >= 1)
      {
          f *= c;
          c--;
      }
        System.out.println(f);
    }
}
