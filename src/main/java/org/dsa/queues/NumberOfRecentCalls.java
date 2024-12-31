package org.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {

     Queue<Integer> queue;
    public NumberOfRecentCalls() {
        queue  = new LinkedList<>();
    }

    public  int ping(int t) {
        queue.add(t);
        while (queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        NumberOfRecentCalls n = new NumberOfRecentCalls();
        System.out.println(n.ping(1));
        System.out.println(n.ping(100));
        System.out.println(n.ping(3001));
        System.out.println(n.ping(3002));
    }
}
