package ex03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String  sc = scan.nextLine();
        int prov = 0, weekNum = 1, res = 0;

        while (!sc.equals("42") && weekNum++ != 18){
            if (!sc.equals("Week " + ++prov)){
                System.err.println("IllegalArgument");
                System.exit (-1);
            }
            res  = res + minValue(scan.nextLine()) * power(weekNum - 2);
            sc = scan.nextLine();
        }
        for(int i = 0; i < prov; i++){
            equally(res % 10, i);
            res = res / 10;
        }
        scan.close();
    }
    private static int power(int pow){
        int res = 1;
        for (int i = 0; i < pow; i++){
            res *= 10;
        }
        return (res);
    }
    private static int minValue(String giveLine) {
        int tmp, min;
        Scanner line = new Scanner(giveLine);
        min = line.nextInt();
        while (line.hasNext()){
            if (min > (tmp = line.nextInt()))
                min = tmp;
        }
        line.close();
        return (min);
    }
    private static void equally(int   equally, int week) {
        int i = -1;
        System.out.print("Week " + week + " ");
        while (++i < equally)
            System.out.print("=");
        System.out.println(">");
    }
}

