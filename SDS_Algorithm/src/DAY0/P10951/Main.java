package DAY0.P10951;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY0/P10951/input.txt"));
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String a = scan.nextLine();
            if (!a.isEmpty()) {
                String[] aa = a.split(" ");
                //System.out.println(a[0] + " : " + a[1]);
                System.out.println(Integer.parseInt(aa[0]) + Integer.parseInt(aa[1]));
            }
            else{
                break;
            }

        }
    }

}
