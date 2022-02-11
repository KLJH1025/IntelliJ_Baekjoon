package Level7_string.P1157;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level7_string/P1157/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        int[] list = new int[26];
        for(int i=0; i<26; i++){
           list[i] = 0;
        }

        for(int i=0; i<a.length(); i++){
            char temp = a.charAt(i);

            if(temp >= 'a' && temp <= 'z'){
                temp = (char)((int)temp - 'a');
                list[temp]++;
            }
            else {
                temp = (char) ((int) temp - 'A');
                list[temp]++;
            }
        }
        int[] cloneList = list.clone();
        Arrays.sort(cloneList);

        if(cloneList[25] == cloneList[24])
            System.out.println("?");
        else{
            int max = cloneList[25];
            for(int k=0; k<26; k++){
                if(max == list[k])
                    System.out.println((char)('A' + k));
            }
        }

    }

}
