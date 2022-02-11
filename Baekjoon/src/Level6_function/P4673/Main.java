package Level6_function.P4673;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/Level6_function/P4673/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 1; i <= N; i++){
            if(function(i) == true){
                count++;
            }
        }

        System.out.println(count);

    }

    static boolean function(int a){
        if(a >= 1 && a <= 99)
            return true;
        else if( a >= 100 && a <= 999){
            int temp = a / 100;
            int temp2= (a - temp*100) / 10;
            int temp3 = (a - temp*100 -temp2*10);

            if(temp+temp3 == temp2+temp2)
                return true;
            else
                return false;
        }
        else
            return false;
    }

}
