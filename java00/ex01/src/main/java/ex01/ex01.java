package ex01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int count = 0;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt();
        if (sc <= 1){
            System.err.println("IllegalArgument");
            System.exit (-1);
        }
        else {
            for (int i = 2; i * i <= sc; i++){
                count++;
                if (sc % i == 0)
                {
                    System.out.println(sc + " false " + count);
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(sc + " true " + ++count);
        }
    }
}
