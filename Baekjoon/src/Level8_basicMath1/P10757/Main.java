package Level8_basicMath1.P10757;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] sum;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level8_basicMath1/P10757/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String x = st.nextToken();
        String y = st.nextToken();

        int maxLength = Integer.max(x.length(), y.length());

        int[] xlist = new int[maxLength+1];
        int[] ylist = new int[maxLength+1];

        for(int i=0; i<x.length(); i++){
            xlist[i] = x.charAt(x.length()-1-i) - '0';
        }

        for(int i=0; i<y.length(); i++){
            ylist[i] = y.charAt(y.length()-1-i) - '0';
        }

        for(int i=0; i<=maxLength; i++){
            xlist[i] += ylist[i];
            if(xlist[i] >= 10){
                xlist[i] = xlist[i] % 10;
                xlist[i+1]++;
            }
        }

        for(int i=maxLength; i>=0;i--){
            if(xlist[i] == 0 && i == maxLength)
                continue;
            System.out.print(xlist[i]);
        }

    }
}
