package P9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/P9/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalLen = Integer.parseInt(st.nextToken());
        int pwdLen = Integer.parseInt(st.nextToken());

        String str = br.readLine();

        st = new StringTokenizer(br.readLine());
        int[] list = new int[4];
        for(int i=0; i<4; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        char[] charList = str.toCharArray();
        int[] intList = new int[totalLen];
        for(int i=0; i<totalLen; i++){
            char a = charList[i];
            if(a == 'A'){
                intList[i] = 0;
            }
            else if(a == 'C'){
                intList[i] = 1;
            }
            else if(a == 'G'){
                intList[i] = 2;
            }
            else if(a == 'T'){
                intList[i] = 3;
            }
        }

        int count=0;
        int start = 0;
        int end = pwdLen-1;

        for(int i=0; i<pwdLen; i++){
            list[intList[i]]--;
        }
        while(end != totalLen-pwdLen-1){
            if(list[0]<1 && list[1]<0 && list[2]<0 && list[3]<0){
                count++;
            }
            list[intList[start]]++;
            start++;
            list[intList[start]]--;

            list[intList[end]]++;
            end++;
            list[intList[end]]--;
        }

        System.out.println(count);
    }
}
