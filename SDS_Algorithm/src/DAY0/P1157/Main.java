package DAY0.P1157;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY0/P1157/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer a = new StringTokenizer(br.readLine());
        String temp =  a.nextToken().toUpperCase();

        int length = temp.length();

        System.out.println(temp);




    }

}
