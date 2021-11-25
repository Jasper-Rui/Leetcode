/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: haoruiyang
 * Date: 2021-11-24
 * Time: 8:28 p.m.
 * Description:
 */
public class Remove_Duplicates_from_Sorted_Array_26 {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            //first, the order in input array is ascending
            if(nums.length <= 1) {
                return nums.length;
            }

            int index = 0;
            int i = 1;
            while(i < nums.length) {
                if(nums[index] != nums[i]) {
                    index++;
                    nums[index] = nums[i];
                }
                i++;
            }
            return index + 1;
        }
    }
}
