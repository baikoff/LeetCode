package org.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Map сейчас: " + map);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Найдено: " + complement + " на позиции " + map.get(complement));
                return new int[]{map.get(complement), i};
            }
            System.out.println("Добавляю в map: " + nums[i] + " -> " + i);
            map.put(nums[i], i);
            System.out.println(map);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result)); // [0, 1]

        int[] result1 = twoSum(new int[]{8, 7, 11, 15, 6, 3, 4, 5}, 9);
        System.out.println(Arrays.toString(result1)); // [0, 1]
    }
}

