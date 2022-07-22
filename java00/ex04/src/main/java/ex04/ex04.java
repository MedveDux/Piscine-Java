package ex04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] val = new long[65535];
        int[][]  max = new int[10][3];
        String line = scanner.nextLine();

        for (int i = 0; i < 10; i++){
            max[i][0] = 0;
            max[i][1] = 0;
            max[i][2] = 0;
        }
        for (int i = 0; i < line.length(); i++)
            val[line.charAt(i)]++;

        for (int i = 65534; i > 0; i--)
            if (val[i] != 0)
                checkMax(max, val[i], i);
        numberEqual(max);
        draw(max);
        }
    public static void checkMax(int max[][], long val, int index) {
        int i = 0;

        while (i < 10){
            if (max[i][0] > val)
                i++;
            else {
                determineMax((int) val, i, max, index);
                break;
            }
        }
    }
    public static void determineMax(int val, int index, int max[][], int indexForArray){
        int i = index, tmp = 10, tmp2 =  10;

        while (9 >= ++i){
            max[--tmp][0] = max[tmp - 1][0];
            max[--tmp2][1] = max[tmp2 - 1][1];
        }
        max[index][0] = val;
        max[index][1] = indexForArray;
    }
    public static void numberEqual(int[][] max){
        int i = -1;

        while(++i < 10){
            max[i][2] = max[i][0] * 10 / max[0][0];
        }
    }

    public static void draw(int max[][]){
        int x = 0;
        int tmp = 10;
        for (int j = 0; j < 11; j++) {
            for (int i = 0; i < 10 && max[i][1] != 0; i++) {
                if (max[i][2] == tmp) {
                        System.out.print(max[i][0] + " ");
                } else if (max[i][2] >= tmp){
                    if(max[i][0] > 9 && max[i][0] < 100)
                        System.out.print(" # ");
                    else
                        System.out.print("# ");

                } else {
                    break;
                }
            }
            System.out.print("\n");
            tmp--;
        }
        for (int i = 0; i < 10  && max[i][1] != 0; i++)
            if(max[i][0] > 9 && max[i][0] < 100)
                System.out.print(" " + (char)max[i][1]+ " ");
            else
            System.out.print((char)max[i][1]+ " ");
    }
}

