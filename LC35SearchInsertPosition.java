/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-19
 * Time: 15:13
 * Description:
 */
public class LC35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        //3 base cases

        if(target < nums[0]) return 0;

        if(nums.length == 1 && target <= nums[0]) return 0;
        else if(nums.length == 1 && target > nums[0]) return 1;

        if(target > nums[nums.length - 1]) return nums.length;


        //using binary search, time complexity requirement is O(logn)

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target) {
                right = mid - 1;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
        }


        return left;
    }
}
