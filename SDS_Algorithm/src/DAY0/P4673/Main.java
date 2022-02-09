package DAY0.P4673;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        int[] arr = new int[10001];
        for(int i=0; i < 10001; i++){
            arr[i] = i;
        }

        for(int i=1; i<10001; i++){
            int temp = function(i);
            if(1<=temp && temp <= 10000){
                if(arr[temp] != -10){
                    arr[temp] = -10;
                }
            }
        }

        for(int i=1; i<10001; i++){
            if(arr[i] != -10){
                System.out.println(arr[i]);
            }
        }


    }

    static int function(int a){
        if(1<= a && a <= 9){
            return a + a;
        }
        else if (10 <= a && a <= 99){
            int temp1 = a / 10;
            int temp2 = a - temp1*10;
            return a + temp1 + temp2;
        }
        else if (100 <= a && a <= 999){
            int temp1 = a / 100;
            int temp2 = (a-temp1*100) / 10;
            int temp3 = a - temp1*100 - temp2*10;
            return a + temp1 + temp2 + temp3;
        }
        else if (1000 <= a && a <= 9999){
            int temp1 = a / 1000;
            int temp2 = (a-temp1*1000) / 100;
            int temp3 = (a-temp1*1000 - temp2*100) / 10;
            int temp4 = (a-temp1*1000 - temp2*100 - temp3*10);
            return a + temp1 + temp2 + temp3 + temp4;
        }
        return 10001;
    }
}


