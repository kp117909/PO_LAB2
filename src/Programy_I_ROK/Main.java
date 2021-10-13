package Programy_I_ROK;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        int i;
        for (i  = 20 ; i >= 0; i--)
        {
            if (i==2)
                continue;
            else if (i==5)
                continue;
            else if (i==10)
               //
                continue;
            System.out.println(i);
        }
        Scanner wej = new Scanner(System.in);
        double silnia = 1;
        int n;
        i = 1;
        System.out.println("Podaj liczbe z której ma zostac wyliczona silnia");
        n = wej.nextInt();
        do
        {
            silnia = i * silnia;
            i++;
        } while(n>=i);
        System.out.println(n + "! = " + silnia);

    }

}
