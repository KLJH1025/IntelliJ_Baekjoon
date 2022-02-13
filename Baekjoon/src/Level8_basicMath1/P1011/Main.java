package Level8_basicMath1.P1011;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level8_basicMath1/P1011/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int distance = b - a;

            int start = 0;
            int count = 0;
            while(true){
                if(distance == 1){
                    count = 1;
                    break;
                }
                else if(start*start < distance && distance <= (start+1)*(start+1)){
                    int temp1 = start*start;
                    int temp2 = (start+1)*(start+1);

                    if((temp1+temp2)/2 >= distance){
                        count = 2*start;
                    }
                    else{
                        count = 2*start + 1;
                    }
                    break;
                }
                else{
                    start += 1;
                }

            }


            System.out.println(count);
        }
    }

}
