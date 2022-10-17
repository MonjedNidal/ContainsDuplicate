import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{2,14,18,22,22}));
    }
    public static boolean containsDuplicate(int[] nums) {
        if (nums != null){
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.isEmpty()){
                    map.put(nums[i], 1);
                }else if (map.containsKey(nums[i])){
                    return true;
                }else{
                    map.put(nums[i], 1);
                }
            }return false;
        }return false;
    }
}