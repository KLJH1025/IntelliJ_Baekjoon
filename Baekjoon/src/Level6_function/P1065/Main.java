package Level6_function.P1065;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10002];

        for(int i=0; i<=10001; i++){
            arr[i] = i;
        }

        for(int i=1; i<=10001; i++){
            int temp = function(i);
            if(temp <= 10001)
                if(arr[temp] != -1)
                    arr[temp] = -1;
        }

        for(int i=1; i<=10001; i++){
            if(arr[i] != -1)
                System.out.println(arr[i]);
        }
    }

    static int function(int a){
        if(a < 10) {
            return a + a;
        }
        else if(a >= 10 && a < 100){
            int temp = a / 10;
            int temp2 = a - temp*10;
            return temp + temp2 + a;
        }
        else if(a >= 100 && a < 1000){
            int temp = a / 100;
            int temp2 = (a - temp*100) / 10;
            int temp3 = (a - temp*100 - temp2*10);
            return temp + temp2 + temp3 + a;
        }
        else if(a >= 1000 && a < 10000){
            int temp = a / 1000;
            int temp2 = (a - temp*1000) / 100;
            int temp3 = (a - temp*1000 - temp2*100) / 10;
            int temp4 = (a - temp*1000 - temp2*100 - temp3*10);
            return temp + temp2 + temp3 + temp4 + a;
        }
        else{
            return 2;
        }
    }

}


