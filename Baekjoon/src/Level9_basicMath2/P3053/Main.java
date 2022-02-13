package Level9_basicMath2.P3053;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level9_basicMath2/P3053/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        System.out.printf("%.6f",(double)N*(double)N*Math.PI );
        System.out.println();
        System.out.printf("%.6f",2*(double)N*N );
    }
}
