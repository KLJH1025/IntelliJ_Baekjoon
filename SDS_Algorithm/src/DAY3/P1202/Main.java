package DAY3.P1202;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main { //Greedy Algorithm

    static int jewelNum;
    static int bagNum;
    static List<Jewel> jewelList;
    static List<Integer> bagList;

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("src/DAY3/P1202/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        jewelNum = Integer.parseInt(st.nextToken());
        bagNum = Integer.parseInt(st.nextToken());
        jewelList = new ArrayList<>();
        bagList = new ArrayList<>();

        for (int i = 0; i < jewelNum; i++) {
            st = new StringTokenizer(br.readLine());
            jewelList.add(new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        for (int i = 0; i < bagNum; i++) {
            bagList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(jewelList, new Comparator<Jewel>() {
            @Override
            public int compare(Jewel o1, Jewel o2) {
                return Integer.compare(o1.J_weight, o2.J_weight);
            }
        });
        Collections.sort(bagList);


        PriorityQueue<Jewel> priorityQueue = new PriorityQueue<>();

        long total = 0;
        int choiceBag = 0;
        int choiceJewel = 0;

        while (true) {
            if (choiceBag >= bagList.size() || choiceJewel >= jewelList.size()) {
                if (choiceBag >= bagList.size()) {
                    break;
                }
                if (choiceJewel >= jewelList.size()) {
                    if (!priorityQueue.isEmpty()) {
                        total += priorityQueue.poll().J_price;
                        choiceBag += 1;
                        continue;
                    } else {
                        break;
                    }
                }
            }

            if (bagList.get(choiceBag) >= jewelList.get(choiceJewel).J_weight) {
                priorityQueue.add(jewelList.get(choiceJewel));
                choiceJewel += 1;
            } else {
                Jewel temp = priorityQueue.poll();
                //System.out.println(temp);
                total += temp.J_price;
                choiceBag += 1;
            }


        }


        System.out.println(total);

    }
}

class Jewel implements Comparable<Jewel> {

    int J_weight;
    int J_price;

    Jewel(int weight, int price) {
        this.J_weight = weight;
        this.J_price = price;
    }

    @Override
    public String toString() {
        return "Jewel{" +
                "J_weight=" + J_weight +
                ", J_price=" + J_price +
                '}';
    }

    @Override
    public int compareTo(Jewel o) {
        return Integer.compare(o.J_price, this.J_price);
    }
}
