package ex02;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt(), count = 0;
        while(sc != 42){
            if(Checker(Digit(sc)))
                count++;
            sc = scan.nextInt();
        }
        System.out.println("Coffee " + count);
    }

    public static int Digit(int digit) {
        int res = 0;
        for (int i = 0; i < 6; i++){
            res = res + digit % 10;
            digit = digit / 10;
        }
        return (res);
    }
    public static boolean Checker(int digit) {
        int count = 0;
        boolean flag = false;

        if (digit <= 1){
            System.err.println("IllegalArgument");
            System.exit (-1);
        }
        else {
            for (int i = 2; i * i <= digit; i++){
                count++;
                if (digit % i == 0)
                    return  (false);
            }
        }
        return (true);
    }
}





