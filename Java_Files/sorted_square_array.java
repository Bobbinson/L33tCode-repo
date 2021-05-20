package Java_Files;

import java.util.Arrays;

public class sorted_square_array {

    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        
        for(int i = 0; i < len; i++){
            nums[i] = nums[i] * nums[i];
            
        }
        Arrays.sort(nums);
        return nums;
    }
    
}
