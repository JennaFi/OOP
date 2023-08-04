package seminar2.task2;

import static seminar2.task2.IConst.*;

public class Main {
    public static void main(String[] args) {
        
        int[] nums = new int[MAX];

        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) {
                System.out.println(ERROR);
            } else {
                nums[i] = i;
                System.out.println(nums[i]);
            }
        }
    }
}
