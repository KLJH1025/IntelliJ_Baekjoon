package DAY4.P14476;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int num;
    static int[] original;
    static int[] LR;
    static int[] RL;

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/DAY4/P14476/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        original = new int[num];
        LR = new int[num];
        RL = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            original[i] = Integer.parseInt(st.nextToken());
        }


        LR[1] = fun(original[0], original[1], original[1] % original[0]);
        RL[num-1] = fun(original[num-1], original[num-2], original[num-1]%original[num-2] );

        System.out.println(LR[0]);
        System.out.println(RL[num-1]);

        for(int i=2; i<num; i++){
            LR[i] = fun(LR[i-1], original[i], original[i]%LR[i-1]);
        }

        /*for(int i=num-1; i>=0; i--){
            System.out.print(original[i] + " : ");
        }*/

        for(int temp : LR){
            System.out.print(temp + " : ");
        }


    }

    static int fun(int a, int b, int c){
        int answer = 0;
        int tempA = a;
        int tempB = b;
        int tempC = c;
        while( c != 0){

            int temp = tempA % tempB;
            if(temp == 0){
                answer = tempB;
                break;
            }
            else{
                tempA = tempB;
                tempB = temp;
            }

        }
        return answer;
    }
}
