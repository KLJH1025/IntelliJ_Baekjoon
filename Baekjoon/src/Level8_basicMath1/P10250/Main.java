package Level8_basicMath1.P10250;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/Level8_basicMath1/P10250/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int hotelFloor = Integer.parseInt(st.nextToken());
            int hotelRoom = Integer.parseInt(st.nextToken());
            int customer = Integer.parseInt(st.nextToken());

            int customerRoom = (customer / hotelFloor) + 1;
            int customerFloor = (customer % hotelFloor);
            if(customerFloor == 0) {
                customerFloor = hotelFloor;
                customerRoom = (customer / hotelFloor);
            }
            System.out.println(customerFloor*100 + customerRoom);
        }
    }

}
