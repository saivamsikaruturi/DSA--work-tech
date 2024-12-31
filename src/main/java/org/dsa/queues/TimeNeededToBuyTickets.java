package org.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets {



    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int seconds = 0;

        for(int i =0;i<tickets.length;i++){
            queue.add(i);
        }
        while(tickets[k] >=1){
            boolean check = tickets[queue.peek()] - 1 >= 1;
            tickets[queue.peek()] = tickets[queue.peek()]-1;
            if(check){
                int ans = queue.poll();
                queue.add(ans);
            }
            else{
                queue.poll();
            }
            seconds++;
        }
        return seconds;
    }


    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{5,1,1,1},0));
    }
}
