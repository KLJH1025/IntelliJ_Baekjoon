package Level7_string.P11654;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        /*
        입력으로 들어오는 문자를 아스키코드로 변환해서 출력하기
        방법 몰랐는데 잘 기억하자.
         */
        int ch = scan.next().charAt(0);
        /*
        chatAt(0)으로 문자를 받아서 int형 변수로 저장.
         */
        System.out.println(ch);

    }

}
