package ex04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] val = new long[65535];
        int[][]  max = new int[10][3];
        String line = scanner.nextLine();
//        char c;
        for (int i = 0; i < 10; i++){
            max[i][0] = 0;
            max[i][1] = 0;
            max[i][2] = 0;
        }
        for (int i = 0; i < line.length(); i++){
            val[line.charAt(i)]++;
        }
//        for (int i = 0; i < 65535; i++) {
//            System.out.println(val[i]);
//        }
        for (int i = 0; i < 65535; i++) {
            if (val[i] != 0){
//                System.out.println(val[i]);
                checkMax(max, val[i], i);
            }
        }
        numberEqual(max);
//        draw(max);
        for (int i = 0; i < 10; i++){
            System.out.print(max[i][0] + " ");
            System.out.print(max[i][1] + " ");
            System.out.println(max[i][2]);
        }
//            if (max[0] < val[i])
//                determineMax((int)val[i], 0, max);
//            else if(max[1] < val[i]  && max[0] > val[i])
//                determineMax((int)val[i], 1, max);
//            else if(max[2] < val[i]  && max[1] > val[i])
//                determineMax((int)val[i], 2, max);
//            else if(max[3] < val[i]  && max[2] > val[i])
//                determineMax((int)val[i], 3, max);
//             else if(max[4] < val[i]  && max[3] > val[i])
//                determineMax((int)val[i], 4, max);
//            else if(max[5] < val[i]  && max[4] > val[i])
//                determineMax((int)val[i], 5, max);
//            else if(max[6] < val[i]  && max[5] > val[i])
//                determineMax((int)val[i], 6, max);
//            else if(max[7] < val[i]  && max[6] > val[i])
//                determineMax((int)val[i], 7, max);
//            else if(max[8] < val[i]  && max[7] > val[i])
//                determineMax((int)val[i], 8, max);
//            else if(max[9] < val[i]  && max[8] > val[i])
//                determineMax((int)val[i], 9, max);
        }
//
    public static void checkMax(int max[][], long val, int index) {
        int i = 0;
//            System.out.println(val);
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
//        System.out.println("000");
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


//                max[9] = max[8];
//                max[8] = max[7];
//                max[7] = (int) val[i];
//                max[6] = max[5];
//                max[5] = max[4];
//                max[4] = max[3]; val > 4
//                max[3] = max[2];
//                max[2] = max[1];
//                max[1] = max[0];
//                max[0] = (int) val[i];
//    public static void draw(int max[][]){
//        int x = 0;
//        for(int i = 0; ;i++)
//            if (max[0] = val[i])
//
//        x =
//    }
}

