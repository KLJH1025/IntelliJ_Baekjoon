package DAY2.P2143;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int T;
    static int N1;
    static int N2;
    static int[] arr1;
    static int[] arr2;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/DAY2/P2143/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        N1 = Integer.parseInt(st.nextToken());
        arr1 = new int[N1];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N1; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        N2 = Integer.parseInt(st.nextToken());
        arr2 = new int[N2];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N2; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        int big = N1 > N2 ? N1: N2;
        int sum1=0;
        int sum2=0;
        for(int i=0; i<big; i++){
            sum1=0;
            sum2=0;
            for(int j=i;j<big;j++){
                if(arr1.length > j){
                    sum1 += arr1[j];
                    a.add(sum1);
                }
                if(arr2.length > j){
                    sum2 += arr2[j];
                    b.add(sum2);
                }
            }
        }

        Collections.sort(a);
        Collections.sort(b);

        System.out.println(a);
        System.out.println(b);

        int start = 0;
        int end = b.size()-1;

        int answer = 0;
        int temp = 0;

        while(true){
            temp = a.get(start) + b.get(end);
            if(temp == T){
                int Acount = Collections.frequency(a,a.get(start));
                int Bcount = Collections.frequency(b, b.get(end));
                answer += Acount*Bcount;
                start += Acount;
                if(start >= a.size())
                    break;
                end -= Bcount;
                if(end < 0)
                    break;
            }
            else if (temp > T){
                end--;
            }
            else{ // temp < T
                start++;
            }
            if(end < 0 || start >= a.size()-1)
                break;


        }

        System.out.println(answer);



    }
}
