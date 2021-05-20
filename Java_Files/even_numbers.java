package Java_Files;

public class even_numbers {

    public int findNumbers(int[] nums) {
        int count = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            int len = String.valueOf(nums[i]).length();
            if( len % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
    
}
