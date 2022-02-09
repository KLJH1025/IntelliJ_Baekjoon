package DAY0.P1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=1; i<=N; i++){
            if(function(i) == true)
                count++;
        }

        System.out.println(count);
    }

    static boolean function(int a){

        if(1<= a && a <= 9){
            return true;
        }
        else if (10 <= a && a <= 99){
            return true;
        }
        else if (100 <= a && a <= 999){
            int temp1 = a / 100;
            int temp2 = (a - temp1*100) / 10;
            int temp3 = (a - temp1*100 - temp2*10);
            if(temp3-temp2 == temp2 -temp1){
                return true;
            }
            else
                return false;
        }
        return false;
    }
}
