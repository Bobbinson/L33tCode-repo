package Java_Files;

public class sorted_array_duplicates {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        int j = 0;
        
        if(len == 0 ){ return 0; }
        
        for(int i = 1; i < len; i++ ){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
                
            }
            
        }
       
       return j + 1;
        
    }
}
