package Level7_string.P2941;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        String[] b = a.split("k");

        int num = 0;
        String[] list = {"dz=", "c=", "c-", "s=", "z=", "d-", "lj", "nj"};

        for(String temp : list){
            if(a.contains(temp)){
                a = a.replaceAll(temp, "%");
            }
        }

        System.out.println(a.length());
    }

}
