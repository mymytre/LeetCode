package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Solution026 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            integerSet.add(nums[i]);
        }
        List<Integer> outList = new ArrayList<>(integerSet);
        for (int i = 0; i < outList.size(); i++) {
            nums[i] = outList.get(i);
        }
        return outList.size();
    }
}
