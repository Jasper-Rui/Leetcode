/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-12
 * Time: 13:57
 * Description:
 */
public class LC26RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int k = 1;
        int prev = nums[0];
        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if(prev == nums[i]) {
                continue;
            }
            else {
                //prve != numns[i]
                //find a new element
                nums[index] = nums[i];
                prev = nums[i];
                k++;
                index++;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4};
        int[] array1 = {1, 1, 2};
        int[] array2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(array));
        System.out.println(removeDuplicates(array1));
        System.out.println(removeDuplicates(array2));
    }
}
