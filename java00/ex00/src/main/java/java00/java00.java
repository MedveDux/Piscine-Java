package java00;

public class java00 {
    public static void main(String[] args) {
        int count = 123456;
        int res = 0;
        for (int i = 0; i < 6; i++){
            res = res + count % 10;
            count = count / 10;
        }
        System.out.println(res);
    }

}
