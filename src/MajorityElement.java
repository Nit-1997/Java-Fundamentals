import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

    }
    public int getMajorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.get(nums[i]) > nums.length / 2) {
                    return nums[i];
                }
                map.put(nums[i], map.get(nums[i] + 1));
            } else {
                map.put(nums[i], 1);
            }
        }
        Arrays.sort(nums);
     return -1;
    }
}
