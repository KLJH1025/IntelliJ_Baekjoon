package P7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/P7/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String a ="123";
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int list[] = new int[num];
        for(int i=0; i<num; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        int start = 0;
        int end = 1;
        int count = 0;

        while(true){
            if(list[start] >= M)
                break;

            int temp = list[start] + list[end];
            if(temp == M){
                count++;
                end++;
                if(end >= num){
                    start++;
                    end = start+1;
                    if(start == num-1){
                        break;
                    }
                }
            }
            else if(temp > M){
                start++;
                end = start+1;
                if(start >= num-1){
                    break;
                }

            }
            else if(temp < M){
                end++;
                if(end >= num){
                    start++;
                    end = start+1;
                    if(start == num-1){
                        break;
                    }
                }
            }
        }
        System.out.println(count);


    }
}
