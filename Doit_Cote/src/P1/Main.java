package P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String str = scan.next();
        char[] charStr = str.toCharArray();
        int total = 0;
        for(int i=0; i<charStr.length; i++){
            total += charStr[i] - '0';
        }
        System.out.println(total);
    }
}
