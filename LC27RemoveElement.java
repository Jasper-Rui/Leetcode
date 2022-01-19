/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JasperRui
 * Date: 2022-01-19
 * Time: 15:17
 * Description:
 */
public class LC27RemoveElement {
       /* public int removeElement(int[] nums, int val) {

        if(nums == null || nums.length < 1) {
            return 0;
        }
        if(nums.length == 1 && nums[0] == val) {
            return 0;
        }
        if(nums.length == 1 && nums[0] != val) {
            return nums[0];
        }

        Arrays.sort(nums);
        int start = -1;
        int end = -1;
        for(int i = 0; i < nums.length; i++) {
            if(start == -1 && nums[i] == val) {
                start = i;
            }

            if(nums[i] == val) {
                end = i;
            }
        }

        if(start == end && start == -1) {
            return nums.length;
        }

        int len = nums.length;
        //now we get the start index and the end index of val existance
        //just move

        int size = end - start + 1;
        int i = 0;
        while(i < size) {
            nums[start + i] = nums[len - i - 1];
            i++;
        }
        return len - (end - start) - 1;
    }*/

    public int removeElement(int[] nums, int val) {

        int put = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[put] = nums[i];
                put++;
            }
        }
        return put;
    }
}
