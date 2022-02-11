package Level4_while.P10951;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        테스트 케이스 개수가 정해져있지 않을떄는
        while(scan.hasNextLine())처럼
        있는 테스트케이스를 모두 읽을수 있게 해야한다.
        */
        while(scan.hasNextLine()){
            String[] temp = scan.nextLine().split(" ");

            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            System.out.println(a+b);
        }

    }

}
