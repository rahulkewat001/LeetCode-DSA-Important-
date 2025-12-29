package Arrays;

import java.util.PriorityQueue;

public class SecondLargestElementInArray {

    public static int secLargest(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }

        if(nums.length < 2) {
            return -1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            minHeap.add(num);
            if(minHeap.size() > 2) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4,7};
        System.out.println(secLargest(nums));
    }

}
