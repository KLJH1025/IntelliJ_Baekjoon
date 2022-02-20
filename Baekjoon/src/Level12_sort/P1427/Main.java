package Level12_sort.P1427;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/Level12_sort/P1427/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int[] arr = new int[input.length()];

        for(int i=0; i<input.length(); i++){
            int temp = input.charAt(i) - '0';
            arr[i] = temp;
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int i=input.length()-1; i>=0; i--){
            sb.append(arr[i]);
        }

        System.out.println(sb);

    }
}
