package P2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int arr[] = new int[a];
        int max = 0;
        int total = 0;
        for(int i=0; i<a; i++){
            arr[i] = scan.nextInt();
            if(max < arr[i])
                max = arr[i];
            total += arr[i];
        }

        System.out.println((double) total/max*100/a);

    }
}
