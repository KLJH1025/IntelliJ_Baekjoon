package P8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] list = new long[num];

        for(int i=0; i<num; i++){
            list[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(list);

        int count = 0;
        for(int k=0; k<num; k++){
            int i = 0;
            int j = num-1;

            while(i<j){
                long temp = list[i] + list[j];
                if(temp > list[k]){
                    j--;
                }
                else if(temp < list[k]){
                    i++;
                }
                else{
                    if(i!=k && j!= k) {
                        count++;
                        break;
                    }
                    else if(i==k){
                        i++;
                    }
                    else if(j==k){
                        j--;
                    }
                }
            }

        }

        System.out.println(count);
    }
}
